package sti.uff.br.treinamento.data;

import br.uff.sti.graduacao.academico.model.Aluno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlunoSSDAO extends CrudRepository<Aluno, Long> {

    @Query("Select a from Aluno a " +
            " join a.localidade " +
            " where a.matricula = ?1")
    Aluno getAlunoByMatricula(String matricula);

    @Query("Select a from Aluno a " +
            " join fetch a.curso " +
            " join a.curso c " +
            " where c.codigo = ?1")
    List<Aluno> obterAlunosPorCurso(Long codigoCurso);
}