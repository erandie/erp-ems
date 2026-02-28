package org.example.erp_system.advisor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
//    @ExceptionHandler(Exception.class)
//    public ResponseUtil exceptionHandler(Exception exception) {
//        return new ResponseUtil(500,
//                exception.getMessage(), null);
//    }
}
