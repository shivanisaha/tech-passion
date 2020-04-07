package com.example.demo.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ErrorHandler  {

    @Value("${api.doc.url}")
    private String details;

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<CustomizedError> getEmployeeNotFoundError(EmployeeNotFoundException ex){
        CustomizedError error = new CustomizedError();
        error.setResponseCode(101);
        error.setMessage(ex.getMessage());
        error.setDetails(details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
