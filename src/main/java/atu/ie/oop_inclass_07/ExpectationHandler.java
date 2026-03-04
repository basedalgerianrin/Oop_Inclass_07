package atu.ie.oop_inclass_07;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.MethodArgumentNotValidExpectation;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.FieldError;
import java.util.HashMap;
import java.util.Map;
@RestController

public class ExpectationHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
}
