package dev.iago.gestao_funcionarios;

import dev.iago.gestao_funcionarios.funcionario.domain.Funcionario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GestaoFuncionariosApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestaoFuncionariosApplication.class, args);
	}

}
