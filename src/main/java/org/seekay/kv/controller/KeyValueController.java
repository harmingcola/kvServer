package org.seekay.kv.controller;

import org.seekay.kv.model.KeyValuePair;
import org.seekay.kv.service.KeyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class KeyValueController {

  @Autowired
  private KeyValueService keyValueService;

  @ResponseStatus(HttpStatus.CREATED)
  @ResponseBody
  @RequestMapping(value = "/pair", method = POST)
  @ResponseStatus(value = HttpStatus.CREATED)
  public KeyValuePair create(@RequestBody  KeyValuePair keyValuePair) {
    return keyValueService.create(keyValuePair);
  }

  @ResponseBody
  @RequestMapping(value = "/pair/{key}", method = GET)
  public KeyValuePair read(@PathVariable String key) {
    return keyValueService.read(key);
  }

  @ResponseBody
  @RequestMapping(value = "/pair", method = PUT)
  public KeyValuePair update(@RequestBody  KeyValuePair keyValuePair) {
    return keyValueService.update(keyValuePair);
  }

  @ResponseBody
  @RequestMapping(value = "/pair/{key}", method = DELETE)
  public ResponseEntity delete(@PathVariable String key) {
    keyValueService.delete(key);
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

  @ResponseBody
  @RequestMapping(value = "/pair", method = GET)
  public Set<KeyValuePair> search(@RequestParam("key") String key) {
    return keyValueService.search(key);
  }
}
