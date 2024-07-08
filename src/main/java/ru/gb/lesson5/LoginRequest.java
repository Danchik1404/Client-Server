package ru.gb.lesson5;


import lombok.Getter;

/**
 * {
 *   "type": "login",
 *   "login": "nagibator"
 * }
 */
@Getter
public class LoginRequest {

  private String login;
  public void setLogin(String login) {
    this.login = login;
  }
}