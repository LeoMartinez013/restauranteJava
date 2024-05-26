package com.projetoPOO.restaurante.model.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    //  local onde devo colocar todas as funções que serão chamadas no indexController

    public void alterarIsPronto(int id, boolean pronto) {
        pedidoRepository.updateIsPronto(id, pronto);

    }
    
    public Pedido buscarPedidoPorID(Pedido pedido) {
        return pedidoRepository.findById(pedido.getId());
    }
    
    public Pedido inserirPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}