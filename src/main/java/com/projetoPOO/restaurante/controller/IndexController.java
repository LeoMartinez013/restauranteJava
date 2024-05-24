package com.aulabd.sitebd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.aulabd.sitebd.model.usuario.Usuario;
import com.aulabd.sitebd.model.usuario.UsuarioService;

@Controller
public class IndexController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("usuario", new Usuario());
        return "index";
    }

    @PostMapping("/acessar")
    public String acessar(@ModelAttribute Usuario usuario) {
        Usuario usuarioValidado = usuarioService.validarUsuario(usuario.getNome(), usuario.getSenha());
        if (usuarioValidado != null) {
            return "painel"; // Redireciona para o painel se o usuário for válido
        } else {
            return "index"; // Permanece na página de login se o usuário ou senha estiverem incorretos
        }
    }

    @GetMapping("/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Usuario usuario) {
        usuarioService.inserirUsuario(usuario);
        return "sucesso"; // Supondo que 'sucesso' seja uma página que confirma o cadastro do usuário
    }

    /*@GetMapping("/listar")
    public String listar(Model model){
        List<Usuario> lista = usuarioService.listarUsuarios();
        model.addAttribute("lista", lista);
        return "listar";
    }*/
}
