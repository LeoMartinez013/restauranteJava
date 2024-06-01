package com.projetoPOO.restaurante.model.itemPedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapio;
import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapioRepository;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemCardapioRepository repository;

    public ItemPedido getItensPedidoById(DadosCadastroItemPedido dados) {
        // var itemCardapio = repository.getReferenceById(dados.idItemCardapio());
        
        return new ItemPedido(dados);
    }

    public ItemPedido criarItemPedido(DadosCadastroItemPedido dados) {
        // ItemCardapio itemCardapio = repository.getReferenceById(dados.idItemCardapio());
        return new ItemPedido(dados);
    }
}    