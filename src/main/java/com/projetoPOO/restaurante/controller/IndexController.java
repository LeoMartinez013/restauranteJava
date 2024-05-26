package com.projetoPOO.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.projetoPOO.restaurante.model.pedido.PedidoService;

@Controller
public class IndexController {
    @Autowired
    private PedidoService pedidoService;
    

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
