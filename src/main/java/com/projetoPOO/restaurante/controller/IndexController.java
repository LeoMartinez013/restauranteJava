package com.projetoPOO.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/pedido")
    public String pedido() {
        return "pedido";
    }

    @GetMapping("/cardapio")
    public String cardapio() {
        return "cardapio";
    }
}
