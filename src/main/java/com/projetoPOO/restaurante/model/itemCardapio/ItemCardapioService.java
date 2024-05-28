// package com.projetoPOO.restaurante.model.itemCardapio;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class ItemCardapioService {
//     @Autowired
//     private ItemCardapioRepository itemCardapioRepository;
//     //  local onde devo colocar todas as funções que serão chamadas no indexController
    
//     public ItemCardapio buscarItemCardapioPorID(int id) {
//         return itemCardapioRepository.findById(id);
//     }
    
//     public boolean updateNomeItemCardapio(int id, String nome) {
//         // return itemCardapioRepository.updateNome(id, nome);
//         return false;
//     }

//     public ItemCardapio inserirItemCardapio(ItemCardapio cardapio) {
//         return itemCardapioRepository.save(cardapio);
//     }

//     public void deleteItemCardapio(int id) {
//         itemCardapioRepository.delete(
//             itemCardapioRepository.findById(id)
//         );
//     }

//     public List<ItemCardapio> listarItensCardapio() {
//         return itemCardapioRepository.findAll();
//     }
// }