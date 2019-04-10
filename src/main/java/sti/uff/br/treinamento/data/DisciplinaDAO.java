package sti.uff.br.treinamento.data;

import br.uff.sti.graduacao.academico.model.Disciplina;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DisciplinaDAO {

//    @Query(" SELECT d FROM AlunoCurriculo ac" +
//            " JOIN ac.aluno " +
//            " JOIN ac.aluno a " +
//            " JOIN Curriculo c " +
//            " JOIN FETCH c.disciplinaCurriculo " +
//            " JOIN c.disciplinaCurriculo dc" +
//            " JOIN FETCH dc.disciplina d " +
//            " WHERE a.matricula = ?1")
    @Query("SELECT distinct ac.curriculo.disciplinaCurriculo.disciplina FROM AlunoCurriculo ac WHERE ac.aluno.matricula = ?1")
    List<Disciplina> obterDisciplinasPorAluno(String matricula);


//    "SELECT distinct ac.curriculo.disciplinaCurriculo.disciplina FROM AlunoCurriculo ac WHERE ac.aluno.matricula = ?1"
}
