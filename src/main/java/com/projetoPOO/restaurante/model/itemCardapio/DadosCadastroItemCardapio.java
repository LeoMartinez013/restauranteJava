package com.projetoPOO.restaurante.model.itemCardapio;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroItemCardapio(
    @NotBlank
    String nome,

    @NotBlank
    String componentes,

    @DecimalMin("0.01")
    BigDecimal preco
) {
    public DadosCadastroItemCardapio(ItemCardapio itemCardapio) {
        this(itemCardapio.getNome(), itemCardapio.getComponentes(), itemCardapio.getPreco());
    }
    

}
