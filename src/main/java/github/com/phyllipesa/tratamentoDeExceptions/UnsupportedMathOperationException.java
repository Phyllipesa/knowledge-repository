package github.com.phyllipesa.tratamentoDeExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Exceptions personalizadas
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {

    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
