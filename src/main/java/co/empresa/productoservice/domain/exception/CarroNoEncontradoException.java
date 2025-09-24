// java
package co.empresa.productoservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarroNoEncontradoException extends RuntimeException {
    private final Long id;

    public CarroNoEncontradoException(Long id) {
        super("Carro no encontrado con id: " + id);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}