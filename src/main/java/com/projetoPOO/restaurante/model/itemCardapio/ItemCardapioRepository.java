package com.projetoPOO.restaurante.model.itemCardapio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCardapioRepository extends JpaRepository<ItemCardapio, Long> {
    //  local onde devo colocar as funções CRUD mais especificas
    // @Transactional
    // @Modifying
    // @Query("UPDATE ItemCardapio c SET c.nm_ItemCardapio = :nome WHERE c.cd_IdItemCardapio = :id")
    // boolean updateNome(int id, String nome);

}
