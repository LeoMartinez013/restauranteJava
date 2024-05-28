package com.projetoPOO.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetoPOO.restaurante.model.itemCardapio.DadosCadastroItemCardapio;
import com.projetoPOO.restaurante.model.itemCardapio.DadosDetalhamentoItemCardapio;
import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapio;
import com.projetoPOO.restaurante.model.itemCardapio.ItemCardapioRepository;

import jakarta.transaction.Transactional;


@RestController
@RequestMapping("/itens-cardapio")
public class CardapioController {

    @Autowired
    private ItemCardapioRepository repository;

    @GetMapping
    public ResponseEntity<Page<DadosDetalhamentoItemCardapio>> listar(Pageable paginacao) {
        var page = repository.findAll(paginacao).map(DadosDetalhamentoItemCardapio::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosDetalhamentoItemCardapio> detalhar(@PathVariable Long id) {
        var itemCardapio = repository.getReferenceById(id);

        return ResponseEntity.ok(new DadosDetalhamentoItemCardapio(itemCardapio));
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoItemCardapio> inserir(@RequestBody DadosCadastroItemCardapio dados) {
        var itemCardapio = new ItemCardapio(dados);
        repository.save(itemCardapio);

        var uri = UriComponentsBuilder.fromPath("/medicos/{id}").buildAndExpand(itemCardapio.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoItemCardapio(itemCardapio));
    }
    
}
