package com.khanhtt.demospringboot.controller;

import com.khanhtt.demospringboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
  @GetMapping("/getAllUser")
  public String getAllUser()
  {
    return "Hello World";
  }

  @GetMapping("/add")
  public String addUser(){
    return "Hello Add User";
  }

  @GetMapping("/getDetail/{id}/{name}")
  public String getDetail(@PathVariable("id") int id, @PathVariable("name") String name)
  {
    return "Hello " + id + " " + name;
  }

  @PostMapping("/update")
  public String update(@RequestBody User user)
  {
    return "Hello " + user.getId() + " - " + user.getName() + " - " + user.getPassword();
  }
}
