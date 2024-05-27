package com.projetoPOO.restaurante.model.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity(name = "Usuario")
@Table(name = "usuario")
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_ID")
    private Long id;

    @Column(name = "nm_Nome")
    private String nome;

    @Column(name = "ds_Senha")
    private String senha;
    
    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.senha = dados.senha();
    }

    public Usuario() {
    }



    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
