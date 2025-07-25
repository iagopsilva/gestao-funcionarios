package dev.iago.gestao_funcionarios.funcionario.application.service;

import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioResponse;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);
}
