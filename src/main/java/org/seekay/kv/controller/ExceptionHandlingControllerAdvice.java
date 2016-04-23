package org.seekay.kv.controller;

import org.seekay.kv.exception.KeyNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlingControllerAdvice {

  @ResponseBody
  @ResponseStatus(value= HttpStatus.NOT_FOUND)
  @ExceptionHandler(KeyNotFoundException.class)
  public String handleCustomException(KeyNotFoundException e) {
    return "{\"message\":\""+ e.getMessage() +"\"}";
  }
}
