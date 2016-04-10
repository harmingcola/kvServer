package org.seekay.kv.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KeyValuePair {
  
  private String key;
  
  private String value;


  public KeyValuePair() {
    key = null;
    value = null;
  }

  public KeyValuePair(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  public String getKey() {
    return key;
  }
  
  public void setKey(String key) {
    this.key = key;
  }
}
