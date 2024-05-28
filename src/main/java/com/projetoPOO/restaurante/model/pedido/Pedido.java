package com.projetoPOO.restaurante.model.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_IdPedido")
    private Long id;

    @Column(name = "nm_Cliente")
    private String cliente;

    @Column(name = "ic_Entregar")
    private boolean entregar;

    @Column(name = "ds_Endereco")
    private String endereco;

    @Column(name = "ic_Pronto")
    private boolean pronto;

    public Pedido(Long id, String cliente, boolean entregar, String endereco, boolean pronto) {
        this.id = id;
        this.cliente = cliente;
        this.entregar = entregar;
        this.endereco = endereco;
        this.pronto = pronto;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean isEntregar() {
        return entregar;
    }

    public void setEntregar(boolean entregar) {
        this.entregar = entregar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }
    
    
}
