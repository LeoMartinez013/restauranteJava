package com.projetoPOO.restaurante.model.pedido;

import java.util.List;

import com.projetoPOO.restaurante.model.itemPedido.DadosCadastroItemPedido;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPedido(
    @NotBlank
    String cliente,
    @NotBlank
    boolean entregar,
    String endereco,
    @NotNull
    List<DadosCadastroItemPedido> itens
) {

}
