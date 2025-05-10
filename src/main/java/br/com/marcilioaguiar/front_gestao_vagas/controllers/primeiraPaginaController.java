package br.com.marcilioaguiar.front_gestao_vagas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class primeiraPaginaController {

    @GetMapping("/home")
    public String primeiraPagina(Model model) {

        model.addAttribute("mensagemDaController", "Bem-vindo ao Sistema de Gestão de Vagas!");
        return "primeiraPagina";
    }

    @GetMapping("/login")
    public String paginaCandidate() {
        return "candidate/login";
    }

    @PostMapping("/create")
    public String cadastroCandidate(Model model, Pessoa pessoa) {
        
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Email: " + pessoa.email);
        System.out.println("Usuario: " + pessoa.usuario);

        model.addAttribute("pessoa", pessoa);

        return "candidate/info";
    }

    record Pessoa(String nome, String email, String usuario) {
    }
}