package com.projetoPOO.restaurante.model.pedido;

import java.math.BigDecimal;

public record DadosDetalhamentoPedido(
    Long id,
    String cliente,
    boolean entregar,
    String endereco,
    boolean pronto,
    BigDecimal total
) {
    public DadosDetalhamentoPedido(Pedido pedido){
        this(
            pedido.getId(),
            pedido.getCliente(),
            pedido.isEntregar(),
            pedido.getEndereco(),
            pedido.isPronto(),
            pedido.getTotal()
        );
    }
}
