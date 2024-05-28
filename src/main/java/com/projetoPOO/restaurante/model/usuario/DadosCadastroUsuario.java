package com.projetoPOO.restaurante.model.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
    @NotBlank
    String nome,

    @NotBlank
    String senha
) {
    
    public DadosCadastroUsuario(Usuario usuario){
        this(
            usuario.getNome(),
            usuario.getSenha()
        );
    }
}
