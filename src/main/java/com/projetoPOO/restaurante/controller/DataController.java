package com.projetoPOO.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projetoPOO.restaurante.model.itemPedido.*;
import com.projetoPOO.restaurante.model.itemCardapio.*;
import com.projetoPOO.restaurante.model.pedido.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ItemPedidoService itemPedidoService;
    @Autowired
    private ItemCardapioService itemCardapioService;

    // Endpoint para buscar itens do cardápio
    @GetMapping("/itens-cardapio")
    public List<ItemCardapio> getItensCardapio() {
        return itemCardapioService.listarItensCardapio();
    }

    // Endpoint para buscar pedidos prontos
    @GetMapping("/pedidos-prontos")
    public List<Pedido> getPedidosProntos() {
        // Implemente a lógica para buscar apenas pedidos com 'isPronto' como 'true'
        return pedidoService.listarPedidosProntos();
    }

    // Endpoint para criar um novo pedido
    @PostMapping("/novo-pedido")
    public Pedido criarPedido(@RequestBody Pedido novoPedido) {
        return pedidoService.inserirPedido(novoPedido);
    }
}
