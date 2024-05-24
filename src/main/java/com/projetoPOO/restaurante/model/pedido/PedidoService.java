package com.projetoPOO.restaurante.model.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoPOO.restaurante.model.pedido.*;;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    //  local onde devo colocar todas as funções que serão chamadas no indexController

    public Pedido alterarStatus(int id, boolean status) {
        Pedido pedido = pedidoRepository.findAllById(id);
        
    }
    
    public Pedido buscarPedidoPorID(Pedido pedido) {
        int id = pedido.getId();
        return pedidoRepository.findById(id);
    }
    
    public Pedido inserirPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}