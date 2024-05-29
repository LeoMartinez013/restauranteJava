package com.projetoPOO.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.projetoPOO.restaurante.model.usuario.DadosCadastroUsuario;
import com.projetoPOO.restaurante.model.usuario.DadosDetalhamentoUsuario;
import com.projetoPOO.restaurante.model.usuario.Usuario;
import com.projetoPOO.restaurante.model.usuario.UsuarioRepository;


@Controller
public class HtmlController {

    @Autowired
    private UsuarioRepository repository;
    
    @GetMapping("/")
    public ResponseEntity<Resource> index() {
        Resource resource = new ClassPathResource("/templates/index.html");
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(resource);
    }
    

    @GetMapping("/cadastro")
    public ResponseEntity<Resource> cadastro() {
        Resource resource = new ClassPathResource("/templates/!cadastro.html");
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(resource);
    }

    @PostMapping("/cadastro")
    public ResponseEntity cadastrar(@RequestBody DadosCadastroUsuario dados) {
        var usuario = new Usuario(dados);
        repository.save(usuario);
        var uri = UriComponentsBuilder.fromPath("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoUsuario(usuario));
        
    }

    @GetMapping("/cardapio")
    public ResponseEntity<Resource> cardapio() {
        Resource resource = new ClassPathResource("/templates/cardapio.html");
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(resource);
    }
    
}
