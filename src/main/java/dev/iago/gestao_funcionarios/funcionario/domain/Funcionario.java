package dev.iago.gestao_funcionarios.funcionario.domain;

import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioAlteracaoRequest;
import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idFuncionario;
    @NotBlank
    private String nome;
    @NotBlank
    private String designacao;
    @NotBlank
    private String salario;
    @NotBlank
    @Column(unique = true)
    private String telefone;
    @NotBlank
    private String endereco;

    private LocalDateTime dataHoraCdastro;
    private LocalDateTime dataHoraUltimaAlteracao;

    public Funcionario(FuncionarioRequest funcionarioRequest) {
        this.idFuncionario = idFuncionario;
        this.nome = funcionarioRequest.getNome();
        this.designacao = funcionarioRequest.getDesignacao();
        this.salario = funcionarioRequest.getSalario();
        this.telefone = funcionarioRequest.getTelefone();
        this.endereco = funcionarioRequest.getEndereco();
        this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
        this.dataHoraCdastro = LocalDateTime.now();
    }

    public void altera(FuncionarioAlteracaoRequest funcionarioRequest) {
        this.idFuncionario = idFuncionario;
        this.nome = funcionarioRequest.getNome();
        this.designacao = funcionarioRequest.getDesignacao();
        this.salario = funcionarioRequest.getSalario();
        this.endereco = funcionarioRequest.getEndereco();
        this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
        this.dataHoraCdastro = LocalDateTime.now();
    }
}
