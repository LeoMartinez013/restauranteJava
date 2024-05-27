package com.projetoPOO.restaurante.model.pedido;

public record DadosDetalhamentoPedido(
    Long id,
    String cliente,
    boolean entregar,
    String endereco,
    boolean pronto
) {
    public DadosDetalhamentoPedido(Pedido pedido){
        this(
            pedido.getId(),
            pedido.getCliente(),
            pedido.isEntregar(),
            pedido.getEndereco(),
            pedido.isPronto()
        );
    }
}
