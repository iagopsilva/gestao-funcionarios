package dev.iago.gestao_funcionarios.funcionario.application.api;

import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.UUID;

public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nome;
    private String telefone;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return null;
    }
}
