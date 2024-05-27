package com.projetoPOO.restaurante.model.pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    //  local onde devo colocar as funções CRUD mais especificas
    @Transactional
    @Modifying
    @Query("UPDATE Pedido p SET p.ic_Pronto = :pronto WHERE p.cd_IdPedido = :id")
    int updateIsPronto(int id, boolean pronto);

    @Query("SELECT Pedido p WHERE p.ic_Pronto = true")
    List<Pedido> findByPronto();

    Pedido findById(int id);
}
