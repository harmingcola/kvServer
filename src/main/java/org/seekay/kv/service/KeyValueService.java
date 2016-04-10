package org.seekay.kv.service;

import org.seekay.kv.dao.KeyValueDao;
import org.seekay.kv.model.KeyValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class KeyValueService {

  @Autowired
  private KeyValueDao keyValueDao;

  public KeyValuePair create(KeyValuePair keyValuePair) {
    return keyValueDao.create(keyValuePair);
  }

  public KeyValuePair read(String key) {
    return keyValueDao.read(key);
  }


  public KeyValuePair update(KeyValuePair keyValuePair) {
    return keyValueDao.update(keyValuePair);
  }

  public void delete(String key) {
    keyValueDao.delete(key);
  }

  public Set<KeyValuePair> search(String key) {
    return keyValueDao.search(key);
  }
}
