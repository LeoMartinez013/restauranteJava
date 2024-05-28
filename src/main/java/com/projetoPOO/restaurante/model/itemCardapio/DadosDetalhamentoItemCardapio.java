package com.projetoPOO.restaurante.model.itemCardapio;

public record DadosDetalhamentoItemCardapio(
    Long id,
    String nome,
    String componentes,
    double preco
) {

    public DadosDetalhamentoItemCardapio(ItemCardapio itemCardapio) {
        this(itemCardapio.getId(), itemCardapio.getNome(), itemCardapio.getComponentes(), itemCardapio.getPreco());
    }
}
