package org.seekay.kv.dao;

import org.seekay.kv.exception.KeyNotFoundException;
import org.seekay.kv.model.KeyValuePair;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class KeyValueDao {

  private Map<String, String> database = new HashMap<String, String>() {{
	  put("table", "I'm a table");
	  put("weight", "220");
  }};

  public KeyValuePair create(KeyValuePair keyValuePair) {
    database.put(keyValuePair.getKey(), keyValuePair.getValue());
    return read(keyValuePair.getKey());
  }

  public KeyValuePair read(String key) {
    String value = database.get(key);
    if(value == null) {
      throw new KeyNotFoundException("No key ["+ key +"] exists");
    }
    return new KeyValuePair(key, value);
  }

  public KeyValuePair update(KeyValuePair keyValuePair) {
    database.put(keyValuePair.getKey(), keyValuePair.getValue());
    return read(keyValuePair.getKey());
  }

  public void delete(String key) {
    database.remove(key);
  }

  public Set<KeyValuePair> search(String keyPart) {
    Set<KeyValuePair> pairs = new HashSet<KeyValuePair>();
    for(String fullKey : database.keySet()) {
      if(fullKey.toLowerCase().contains(keyPart.toLowerCase())) {
        pairs.add(read(fullKey));
      }
    }
    return pairs;
  }

}
