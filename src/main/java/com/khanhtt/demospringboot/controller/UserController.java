package com.khanhtt.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/getDetail/{id}")
  public String getDetail(@PathVariable("id") int id)
  {
    return "Hello " + id;
  }
}
