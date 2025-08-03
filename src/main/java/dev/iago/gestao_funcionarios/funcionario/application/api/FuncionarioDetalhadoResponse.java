package dev.iago.gestao_funcionarios.funcionario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class FuncionarioDetalhadoResponse {
    private UUID idFuncionario;
    private String nome;
    private String designacao;
    private String salario;
    private String telefone;
    private String endereco;

    private LocalDateTime dataHoraCdastro;
    private LocalDateTime dataHoraUltimaAlteracao;
}
