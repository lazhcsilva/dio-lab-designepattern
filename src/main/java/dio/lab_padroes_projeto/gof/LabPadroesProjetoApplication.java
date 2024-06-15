package dio.lab_padroes_projeto.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 * Projeto String boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * 	- Spring Data JPA
 * 	- Spring Web
 * 	- MySQL Database
 * 	- OpenFeign
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoApplication.class, args);
	}

}
