package dev.iago.gestao_funcionarios.funcionario.infra;

import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuncionarioSpringDataJPARepository extends JpaRepository<Funcionario, UUID> {
}
