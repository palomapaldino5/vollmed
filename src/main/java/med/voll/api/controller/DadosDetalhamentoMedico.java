package med.voll.api.controller;

import med.voll.api.domain.endereco;

public record DadosDetalhamentoMedico (Long id,
                String nome,
                String email,
                String crm,
                String telefone,
                Especialidade especialidade,
                Endereco endereco){


public Long id() {
        return id;
    }

    public String nome() {
        return nome;
    }

    public String email() {
        return email;
    }

    public String crm() {
        return crm;
    }

    public String telefone() {
        return telefone;
    }

    public Especialidade especialidade() {
        return especialidade;
    }

    public Endereco endereco() {
        return endereco;
    }
}
