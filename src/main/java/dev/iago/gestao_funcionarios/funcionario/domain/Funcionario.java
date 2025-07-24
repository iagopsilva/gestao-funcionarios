package dev.iago.gestao_funcionarios.funcionario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private UUID idFuncionario;
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

    public Funcionario(UUID id, String nome, String designacao, String salario, String telefone, String endereco) {
        this.idFuncionario = UUID.randomUUID();
        this.nome = nome;
        this.designacao = designacao;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataHoraCdastro = LocalDateTime.now();
    }

    private LocalDateTime dataHoraCdastro;
    private LocalDateTime dataHoraUltimaAlteracao;
}
