package sti.uff.br.treinamento.data;

import br.uff.sti.graduacao.academico.model.Disciplina;
import br.uff.sti.graduacao.academico.model.Turma;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DisciplinasDAO extends CrudRepository<Disciplina, Long> {

    @Query("SELECT d FROM Disciplina d WHERE d.codigo = ?1")
    Disciplina obterDisciplinaPorCodigo(String codigo);

    @Query( " SELECT distinct t FROM Turma t                                                                                " +
            " INNER JOIN DisciplinaCurriculo dc ON dc.disciplina.idDisciplina = t.disciplina.idDisciplina                   " +
            " INNER JOIN Curriculo c on c.versaoCurriculoCorrente.idVersaoCurriculo = dc.versaoCurriculo.idVersaoCurriculo  " +
            " INNER JOIN AlunoCurriculo ac on ac.curriculo.idCurriculo = c.idCurriculo                                      " +
            " INNER JOIN ac.aluno a on a.idIdentificador = ac.aluno.idIdentificador                                         " +
            " INNER JOIN FETCH Turma t on t.disciplina = dc.disciplina                                                      " +
            " WHERE a.matricula = ?1                                                                                        " +
            " AND t.status in (1, 2, 3, 4)                                                                                  " +
            " AND t.anoSemestre = ?2                                                                                        ")
    List<Turma> obterDisciplinasPorMatricula(String matricula, int anoSemestre);
}
