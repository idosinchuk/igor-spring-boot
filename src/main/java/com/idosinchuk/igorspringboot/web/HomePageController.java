package com.idosinchuk.igorspringboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

  public static final String HOME_PAGE_HTML = "home";

  @Value("${spring.application.name}")
  String appName;

  @GetMapping("/")
  public String homePage(Model model) {
    model.addAttribute("appName", appName);
    return HOME_PAGE_HTML;
  }
}