package dev.iago.gestao_funcionarios.funcionario.infra;

import dev.iago.gestao_funcionarios.funcionario.application.service.FuncionarioRepository;
import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class FuncionarioInfraRepository implements FuncionarioRepository {

    @Override
    public Funcionario salva(Funcionario funcionario) {
        log.info("[inicia] FuncionarioInfraRepository - salva");
        funcionarioSpringDataJPARepository.save(funcionario);
        log.info("[finaliza] FuncionarioInfraRepository - salva");
        return funcionario;
    }
}
