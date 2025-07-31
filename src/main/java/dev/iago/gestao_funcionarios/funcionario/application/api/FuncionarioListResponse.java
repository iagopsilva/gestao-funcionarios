package dev.iago.gestao_funcionarios.funcionario.application.api;

import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class FuncionarioListResponse {
    private UUID idFuncionario;
    private String nome;
    private String telefone;

    public static List<FuncionarioListResponse> converte(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .map(FuncionarioListResponse::new)
                .collect(Collectors.toList());
    }

    public FuncionarioListResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nome = funcionario.getNome();
        this.telefone = funcionario.getTelefone();
    }
}
