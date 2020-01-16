package sti.uff.br.treinamento;

import br.uff.sti.graduacao.academico.configuration.GraduacaoAcademicoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sti.uff.br.treinamento.data.AlunosDAO;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories(basePackageClasses = {AlunosDAO.class},
		transactionManagerRef = "transactionManager",
		entityManagerFactoryRef = "entityManagerFactory")
@Import(value = { GraduacaoAcademicoConfiguration.class })
public class TreinamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinamentoApplication.class, args);
	}

}
