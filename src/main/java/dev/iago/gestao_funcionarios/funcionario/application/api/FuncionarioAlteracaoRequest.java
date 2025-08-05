package dev.iago.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FuncionarioAlteracaoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    private String telefone;
    @NotBlank
    private String endereco;
}
