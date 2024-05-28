package com.projetoPOO.restaurante.model.pedido;

public record DadosCadastroPedido(
    String cliente,
    boolean entregar,
    String endereco
) {

}
