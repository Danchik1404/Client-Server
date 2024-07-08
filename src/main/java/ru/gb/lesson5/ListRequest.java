package ru.gb.lesson5;

import lombok.Getter;
import lombok.Setter;

/**
 * {
 *   "type": "users"
 * }
 */
@Getter
@Setter
public class ListRequest {

  private String type;

  public ListRequest(String type) {
    this.type = type;
  }

  public ListRequest() {
    this.type = "default";
  }

  public void setType(String type) {
    this.type = type;
  }

}