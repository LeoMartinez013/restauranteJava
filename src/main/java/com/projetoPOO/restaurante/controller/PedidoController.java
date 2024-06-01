package com.projetoPOO.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetoPOO.restaurante.model.itemPedido.DadosCadastroItemPedido;
import com.projetoPOO.restaurante.model.itemPedido.ItemPedido;
import com.projetoPOO.restaurante.model.itemPedido.ItemPedidoRepository;
import com.projetoPOO.restaurante.model.itemPedido.ItemPedidoService;
import com.projetoPOO.restaurante.model.pedido.DadosCadastroPedido;
import com.projetoPOO.restaurante.model.pedido.DadosDetalhamentoPedido;
import com.projetoPOO.restaurante.model.pedido.Pedido;
import com.projetoPOO.restaurante.model.pedido.PedidoRepository;



@RestController
@RequestMapping("/api-pedidos")
public class PedidoController {
    @Autowired
    private ItemPedidoService service;
    
    @Autowired
    private PedidoRepository repository;
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DadosDetalhamentoPedido> pronto(@PathVariable Long id) {
        Pedido pedido = repository.getReferenceById(id);
        pedido.setPronto(true);
        return ResponseEntity.ok(new DadosDetalhamentoPedido(pedido));
    }

    @GetMapping
    public ResponseEntity<Page<DadosDetalhamentoPedido>> listar(Pageable paginacao) {
        var page = repository.findAll(paginacao).map(DadosDetalhamentoPedido::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosDetalhamentoPedido> detalhar(@PathVariable Long id) {
        var pedido = repository.findById(id);
        if (pedido.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(new DadosDetalhamentoPedido(pedido.get()));
    }
    
    @GetMapping("/prontos")
    public ResponseEntity<Page<DadosDetalhamentoPedido>> listarProntos(Pageable paginacao) {
        var page = repository.findAllByProntoTrue(paginacao).map(DadosDetalhamentoPedido::new);
        return ResponseEntity.ok(page);
    }
    
    @PostMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoPedido> cadastrar(@RequestBody DadosCadastroPedido dados) {
        Pedido pedido = new Pedido(dados);
        
        for (DadosCadastroItemPedido item : dados.itens()) {
            var novoItem = service.criarItemPedido(item);
            novoItem.setPedido(pedido);
            itemPedidoRepository.save(novoItem);
        }

        repository.save(pedido);
        var uri = UriComponentsBuilder.fromPath("/api-pedidos/{id}").buildAndExpand(pedido.getId()).toUri();
        
        return ResponseEntity.created(uri).body(new DadosDetalhamentoPedido(pedido));
    }
    
}
