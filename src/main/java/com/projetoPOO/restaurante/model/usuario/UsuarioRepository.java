package com.projetoPOO.restaurante.model.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNomeAndSenha(String nome, String senha);

    Page<Usuario> findAll(Pageable paginacao);
}
