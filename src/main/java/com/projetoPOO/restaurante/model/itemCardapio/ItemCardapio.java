package com.projetoPOO.restaurante.model.itemCardapio;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemcardapio")
public class ItemCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_iditemcardapio ")
    private Long id;

    @Column(name = "nm_itemcardapio")
    private String nome;

    @Column(name = "ds_componentes")
    private String componentes;

    @Column(name = "vl_preco")
    private BigDecimal preco;

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
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
