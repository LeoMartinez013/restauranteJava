package com.projetoPOO.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @GetMapping("/rest")
    public String changeIndex() {
        return "asd";
    }
}
