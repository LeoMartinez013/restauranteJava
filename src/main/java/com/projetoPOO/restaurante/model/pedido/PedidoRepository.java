package com.projetoPOO.restaurante.model.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    //  local onde devo colocar as funções CRUD mais especificas
}
