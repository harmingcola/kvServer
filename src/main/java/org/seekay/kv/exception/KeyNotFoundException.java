package org.seekay.kv.exception;

public class KeyNotFoundException extends RuntimeException {

  public KeyNotFoundException(String message) {
    super(message);
  }
}
