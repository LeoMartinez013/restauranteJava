package com.projetoPOO.restaurante.model.itemPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;
    //  local onde devo colocar todas as funções que serão chamadas no indexController

    public boolean alterarIsPronto(int id, boolean isPronto) {
        return itemPedidoRepository.updateIsPronto(id, isPronto);
    }
    
    public ItemPedido buscarItemPedidoPorID(ItemPedido pedido) {
        return itemPedidoRepository.findById(
            pedido.getId()
        );
    }
    
    public ItemPedido inserirItemPedido(ItemPedido pedido) {
        return itemPedidoRepository.save(pedido);
    }

    public boolean deleteAllItensPedido(int idPedido) {
        return itemPedidoRepository.deleteAllByIdPedido(idPedido);
    }

    public List<ItemPedido> listarItensPedido(int idPedido) {
        return itemPedidoRepository.findByIdPedido(idPedido);
    }
}