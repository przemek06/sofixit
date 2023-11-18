package sofixit.example.service_1.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import sofixit.example.service_1.error.exception.BadVariableException;

@ControllerAdvice
@Slf4j
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadVariableException.class)
    public ResponseEntity<String> handleBadRequest(Exception e) {
        log.error(e.getMessage());
        return ResponseEntity
                .badRequest()
                .body(e.getMessage());
    }
}
