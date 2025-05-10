package br.com.marcilioaguiar.front_gestao_vagas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class primeiraPaginaController {
    
    @GetMapping("/home")
    public String primeiraPagina() {
        return "primeiraPagina";
    }

    @GetMapping("/login")
    public String paginaCandidate() {
        return "candidate/login";
    }
}