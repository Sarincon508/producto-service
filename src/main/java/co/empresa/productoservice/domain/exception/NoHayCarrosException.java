package co.empresa.productoservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoHayCarrosException extends RuntimeException {
    public NoHayCarrosException() {
        super("No hay carros disponibles.");
    }

    public NoHayCarrosException(String message) {
        super(message);
    }
}