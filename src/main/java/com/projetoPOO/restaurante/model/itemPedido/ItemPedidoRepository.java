package com.projetoPOO.restaurante.model.itemPedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    //  local onde devo colocar as funções CRUD mais especificas
    // @Transactional
    // @Modifying
    // @Query("UPDATE ItemPedido i SET i.ic_Pronto = :isPronto WHERE p.cd_IdItemPedido = :id")
    // boolean updateIsPronto(int id, boolean isPronto);

    // ItemPedido findById(Long id);

    // @Query("DELETE ItemPedido i WHERE i.cd_IdPedido = :idPedido")
    // boolean deleteAllByIdPedido(int idPedido);

    // @Query("SELECT ItemPedido i WHERE i.cd_IdPedido = :idPedido")
    // List<ItemPedido> findByIdPedido(int idPedido);
}
