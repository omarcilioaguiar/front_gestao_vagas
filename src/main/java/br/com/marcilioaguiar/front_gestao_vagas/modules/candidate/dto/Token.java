package br.com.marcilioaguiar.front_gestao_vagas.modules.candidate.dto;

import java.util.List;

import lombok.Data;

@Data
public class Token {

    public String access_token;
    private List<String> roles;
    private Long expires_in;

}
