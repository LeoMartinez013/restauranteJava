package com.projetoPOO.restaurante.model.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoPOO.restaurante.model.usuario.Usuario;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    //  local onde devo colocar as funções CRUD mais especificas
   
}
