package dev.iago.gestao_funcionarios.funcionario.application.service;

import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioDetalhadoResponse;
import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioListResponse;
import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioRequest;
import dev.iago.gestao_funcionarios.funcionario.application.api.FuncionarioResponse;

import java.util.List;
import java.util.UUID;

public interface FuncionarioService {
    FuncionarioResponse criaFuncionario(FuncionarioRequest funcionarioRequest);

    List<FuncionarioListResponse> buscaTodosFuncionarios();

    FuncionarioDetalhadoResponse buscaFuncionarioAtravesId(UUID idFuncionario);

    void deletaFuncionarioAtravesId(UUID idFuncionario);
}
