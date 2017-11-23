package com.dudu;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/index")
public class TestRestController {
  @RequestMapping(value = "/home")
  public List<String> home() {
    List<String> list=new ArrayList<String>();
    list.add("Hello");
    list.add("World");
    list.add("HAHAHAHA");
    return list;
//    return "index home";
  }

  @GetMapping(value = "/login/{name}&{pwd}")
  public String login(@PathVariable String name, @PathVariable String pwd) {
    if (name.equals("admin") && pwd.equals("admin")) {
      return "hello welcome admin";
    } else {
      return "oh sorry user name or password is wrong";
    }
  }
}
