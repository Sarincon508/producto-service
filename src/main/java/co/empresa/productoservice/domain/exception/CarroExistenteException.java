// java
package co.empresa.productoservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CarroExistenteException extends RuntimeException {
    private final Long id;

    public CarroExistenteException(Long id) {
        super("El carro ya existe con id: " + id);
        this.id = id;
    }

    public CarroExistenteException(String message) {
        super(message);
        this.id = null;
    }

    public Long getId() {
        return id;
    }
}