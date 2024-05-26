package com.projetoPOO.restaurante.model.itemCardapio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemCardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_IdItemCardapio ")
    private int id;

    @Column(name = "nm_ItemCardapio")
    private String nome;

    @Column(name = "ds_Componentes")
    private String componentes;

    public ItemCardapio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
