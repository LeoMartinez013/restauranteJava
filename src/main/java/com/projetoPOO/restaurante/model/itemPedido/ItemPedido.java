package com.projetoPOO.restaurante.model.itemPedido;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;

import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapio;
import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapioRepository;
import com.projetoPOO.restaurante.model.pedido.Pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itempedido")
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_iditempedido")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cd_idpedido")
    private Pedido Pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cd_itemcardapio")
    @Fetch(FetchMode.JOIN)
    private ItemCardapio ItemCardapio;

    @Column(name = "qt_Quantidade")
    private int quantidade;

    @Column(name = "ic_pronto")
    private boolean isPronto;

    public ItemPedido(DadosCadastroItemPedido dados){
        this.ItemCardapio = dados.itemCardapio();
        this.quantidade = dados.quantidade();
    }

    public ItemPedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPronto() {
        return isPronto;
    }

    public void setPronto(boolean isPronto) {
        this.isPronto = isPronto;
    }

    public Pedido getPedido() {
        return Pedido;
    }

    public void setPedido(Pedido pedido) {
        Pedido = pedido;
    }

    public ItemCardapio getItemCardapio() {
        return ItemCardapio;
    }

    public void setItemCardapio(ItemCardapio itemCardapio) {
        ItemCardapio = itemCardapio;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
