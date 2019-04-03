package sti.uff.br.treinamento.data;

import br.uff.sti.graduacao.academico.model.Aluno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlunoSSDAO extends CrudRepository<Aluno, Long> {

    @Query("Select a from #{#entityName} where matricula = ?1")
    Aluno getAlunoByMatricula(String matricula);
}
