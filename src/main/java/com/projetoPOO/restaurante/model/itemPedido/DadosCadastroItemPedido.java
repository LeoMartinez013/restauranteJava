package com.projetoPOO.restaurante.model.itemPedido;

import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapio;

import jakarta.validation.constraints.NotNull;

public record DadosCadastroItemPedido(
    @NotNull
    ItemCardapio itemCardapio,
    @NotNull
    int quantidade
) {
    
}
