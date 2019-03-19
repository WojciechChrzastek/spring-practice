package net.chrzastek.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
  String username;

  public String getUsername() {
    return username;
  }

  public ForumUser() {
    this.username = "John Smith";
  }
}
