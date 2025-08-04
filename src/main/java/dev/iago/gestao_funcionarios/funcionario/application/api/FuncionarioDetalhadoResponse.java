package dev.iago.gestao_funcionarios.funcionario.application.api;

import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;
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

    public FuncionarioDetalhadoResponse(Funcionario funcionario) {
        this.idFuncionario = funcionario.getIdFuncionario();
        this.nome = funcionario.getNome();
        this.designacao = funcionario.getDesignacao();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.endereco = funcionario.getEndereco();
        this.dataHoraCdastro = funcionario.getDataHoraCdastro();
        this.dataHoraUltimaAlteracao = funcionario.getDataHoraUltimaAlteracao();
    }
}
