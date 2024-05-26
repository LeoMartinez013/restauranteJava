package com.projetoPOO.restaurante.model.itemPedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_IdItemPedido")
    private int id;

    @Column(name = "cd_IdPedido ")
    private int idPedido;

    @Column(name = "cd_ItemCardapio")
    private int idItemCardapio;

    @Column(name = "ic_Pronto")
    private boolean isPronto;

    public ItemPedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdItemCardapio() {
        return idItemCardapio;
    }

    public void setIdItemCardapio(int idItemCardapio) {
        this.idItemCardapio = idItemCardapio;
    }

    public boolean isPronto() {
        return isPronto;
    }

    public void setPronto(boolean isPronto) {
        this.isPronto = isPronto;
    }
    
    
}
