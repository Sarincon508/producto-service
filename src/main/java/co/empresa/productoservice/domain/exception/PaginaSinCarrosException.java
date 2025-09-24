package co.empresa.productoservice.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PaginaSinCarrosException extends RuntimeException {
    private final int page;

    public PaginaSinCarrosException(int page) {
        super("La página " + page + " no contiene carros.");
        this.page = page;
    }

    public int getPage() {
        return page;
    }
}