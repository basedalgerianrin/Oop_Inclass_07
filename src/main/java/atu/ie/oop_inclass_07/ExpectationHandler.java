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
    public ResponseEntity<Map<String,Object>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        Map<String,Object> map = new HashMap<>();
        for(FieldError fieldError : ex.getBindingResult().getFieldErrors()){
            fieldError.put(FieldError.getFeild(), fieldError.getDefaultMessage());
        }
        return ResponseEntity.badRequest().body(map);
    }
}
