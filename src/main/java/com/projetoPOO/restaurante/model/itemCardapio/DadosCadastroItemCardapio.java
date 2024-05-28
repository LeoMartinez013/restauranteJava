package com.projetoPOO.restaurante.model.itemCardapio;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroItemCardapio(
    @NotBlank
    String nome,

    @NotBlank
    String componentes,

    @DecimalMin("0.01")
    double preco
) {
    public DadosCadastroItemCardapio(ItemCardapio itemCardapio) {
        this(itemCardapio.getNome(), itemCardapio.getComponentes(), itemCardapio.getPreco());
    }
    

}
