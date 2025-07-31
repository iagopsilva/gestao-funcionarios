package dev.iago.gestao_funcionarios.funcionario.application.service;

import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioListResponse;
import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    Funcionario salva(Funcionario funcionario);

    List<Funcionario> buscaTodosFuncionarios();
}
