package dev.iago.gestao_funcionarios.funcionario.application.api;

import dev.iago.gestao_funcionarios.funcionario.application.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FuncionarioController implements FuncionarioAPI{
    private final FuncionarioService funcionarioService;

    @Override
    public FuncionarioResponse postFuncionario(FuncionarioRequest funcionarioRequest) {
        log.info("[inicia] FuncionarioController - postFuncionario");
        FuncionarioResponse funcionarioCriado = funcionarioService.criaFuncionario(funcionarioRequest);
        log.info("[finaliza] FuncionarioController - postFuncionario");
        return funcionarioCriado;
    }

    @Override
    public List<FuncionarioListResponse> getTodosFuncionarios() {
        log.info("[inicia] FuncionarioController - getTodosFuncionario");
        List<FuncionarioListResponse> funcionarios = funcionarioService.buscaTodosFuncionarios();
        log.info("[finaliza] FuncionarioController - getTodosFuncionario");
        return funcionarios;
    }

    @Override
    public FuncionarioDetalhadoResponse getFuncionarioAtravesId(UUID idFuncionario) {
        log.info("[inicia] FuncionarioController - getFuncionarioAtravesId");
        log.info("[idFuncionario] {}", idFuncionario);
        FuncionarioDetalhadoResponse funcionarioDetalhado = funcionarioService.buscaFuncionarioAatravesId(idFuncionario);
        log.info("[finaliza] FuncionarioController - getFuncionarioAtravesId");
        return funcionarioDetalhado;
    }

}
