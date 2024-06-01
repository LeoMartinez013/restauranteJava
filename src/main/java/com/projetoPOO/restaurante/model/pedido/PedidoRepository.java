package com.projetoPOO.restaurante.model.pedido;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    //  local onde devo colocar as funções CRUD mais especificas
    // @Transactional
    // @Modifying
    // @Query("UPDATE Pedido p SET p.ic_Pronto = :pronto WHERE p.cd_IdPedido = :id")
    // Long updateIsPronto(Long id, boolean pronto);

    Page<Pedido> findAllByProntoTrue(Pageable paginacao);
}
