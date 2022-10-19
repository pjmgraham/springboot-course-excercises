package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GSController {

  @GetMapping("/")
  public String getForm() {
  return "form";
  }

}
