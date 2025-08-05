package dev.iago.gestao_funcionarios.funcionario.application.service;

import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioListResponse;
import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;
import java.util.UUID;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);

    List<Funcionario> buscaTodosFuncionarios();

    Funcionario buscaFuncionarioAtravesId(UUID idFuncionario);

    void deletaFuncionario(Funcionario funcionario);
}
