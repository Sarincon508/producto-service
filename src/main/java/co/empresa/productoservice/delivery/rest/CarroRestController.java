package co.empresa.productoservice.delivery.rest;

import co.empresa.productoservice.domain.exception.NoHayCarrosException;
import co.empresa.productoservice.domain.exception.PaginaSinCarrosException;
import co.empresa.productoservice.domain.exception.CarroNoEncontradoException;
import co.empresa.productoservice.domain.exception.ValidationException;
import co.empresa.productoservice.domain.model.Carro;
import co.empresa.productoservice.domain.service.ICarroService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/carro-service")
public class CarroRestController {

    private final ICarroService carroService;

    private static final String MENSAJE = "mensaje";
    private static final String CARRO = "carro";
    private static final String CARROS = "carros";

    public CarroRestController(ICarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/carros")
    public ResponseEntity<Map<String, Object>> getCarros() {
        List<Carro> carros = carroService.findAll();
        if (carros.isEmpty()) {
            throw new NoHayCarrosException();
        }
        Map<String, Object> response = new HashMap<>();
        response.put(CARROS, carros);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/carro/page/{page}")
    public ResponseEntity<Object> index(@PathVariable Integer page) {
        Pageable pageable = PageRequest.of(page, 4);
        Page<Carro> carros = carroService.findAll(pageable);
        if (carros.isEmpty()) {
            throw new PaginaSinCarrosException(page);
        }
        return ResponseEntity.ok(carros);
    }

    @PostMapping("/carros")
    public ResponseEntity<Map<String, Object>> save(@Valid @RequestBody Carro carro, BindingResult result) {
        if (result.hasErrors()) {
            throw new ValidationException(result);
        }
        Map<String, Object> response = new HashMap<>();
        Carro nuevoCarro = carroService.save(carro);
        response.put(MENSAJE, "El carro ha sido creado con éxito!");
        response.put(CARRO, nuevoCarro);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/carros")
    public ResponseEntity<Map<String, Object>> delete(@RequestBody Carro carro) {
        carroService.findById(carro.getId())
                .orElseThrow(() -> new CarroNoEncontradoException(carro.getId()));
        carroService.delete(carro);
        Map<String, Object> response = new HashMap<>();
        response.put(MENSAJE, "El carro ha sido eliminado con éxito!");
        response.put(CARRO, null);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/carros")
    public ResponseEntity<Map<String, Object>> update(@Valid @RequestBody Carro carro, BindingResult result) {
        if (result.hasErrors()) {
            throw new ValidationException(result);
        }
        carroService.findById(carro.getId())
                .orElseThrow(() -> new CarroNoEncontradoException(carro.getId()));
        Map<String, Object> response = new HashMap<>();
        Carro carroActualizado = carroService.update(carro);
        response.put(MENSAJE, "El carro ha sido actualizado con éxito!");
        response.put(CARRO, carroActualizado);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/carros/{id}")
    public ResponseEntity<Map<String, Object>> findById(@PathVariable Long id) {
        Carro carro = carroService.findById(id)
                .orElseThrow(() -> new CarroNoEncontradoException(id));
        Map<String, Object> response = new HashMap<>();
        response.put(MENSAJE, "El carro ha sido encontrado con éxito!");
        response.put(CARRO, carro);
        return ResponseEntity.ok(response);
    }
}