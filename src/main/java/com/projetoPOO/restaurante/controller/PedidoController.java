package com.projetoPOO.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoPOO.restaurante.model.pedido.DadosDetalhamentoPedido;
import com.projetoPOO.restaurante.model.pedido.Pedido;
import com.projetoPOO.restaurante.model.pedido.PedidoRepository;



@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity pronto(@PathVariable Long id) {
        Pedido pedido = repository.getReferenceById(id);
        pedido.setPronto(true);
        return ResponseEntity.ok(new DadosDetalhamentoPedido(pedido));
    }

    
    
}
