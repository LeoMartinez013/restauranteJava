package com.projetoPOO.restaurante.model.itemCardapio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name = "item_cardapio") Confirmar nome da tabela
public class ItemCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_IdItemCardapio ")
    private Long id;

    @Column(name = "nm_ItemCardapio")
    private String nome;

    @Column(name = "ds_Componentes")
    private String componentes;

    @Column(name = "vl_Preco")
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ItemCardapio() {
    }

    public ItemCardapio(DadosCadastroItemCardapio dados) {
        this.nome = dados.nome();
        this.componentes = dados.componentes();
        this.preco = dados.preco();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

}
