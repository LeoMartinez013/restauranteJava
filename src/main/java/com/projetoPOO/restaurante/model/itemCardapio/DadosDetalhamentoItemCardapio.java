package com.projetoPOO.restaurante.model.itemCardapio;

import java.math.BigDecimal;

public record DadosDetalhamentoItemCardapio(
    Long id,
    String nome,
    String componentes,
    BigDecimal preco
) {

    public DadosDetalhamentoItemCardapio(ItemCardapio itemCardapio) {
        this(itemCardapio.getId(), itemCardapio.getNome(), itemCardapio.getComponentes(), itemCardapio.getPreco());
    }
}
