package sti.uff.br.treinamento.data;

import br.uff.sti.graduacao.academico.model.Disciplina;
import br.uff.sti.graduacao.academico.model.Turma;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DisciplinasDAO extends CrudRepository<Disciplina, Long> {

    @Query("SELECT d FROM Disciplina d WHERE d.codigo = ?1")
    Disciplina obterDisciplinaPorCodigo(String codigo);

//    @Query(value =  " select distinct d.* from disciplina d\n" +
//                    " left join CUR_DISCIPLINACURRICULO dc on dc.iddisciplina = d.iddisciplina\n" +
//                    " left join cur_curriculo c on c.idcurriculo = dc.idcurriculo and c.idversaocurriculo = dc.idversaocurriculo\n" +
//                    " left join alunocurriculo ac on ac.idcurriculo = c.idcurriculo\n" +
//                    " left join aluno a on a.ididentificador = ac.idaluno\n" +
//                    " where a.matricula = ?1",
//    nativeQuery = true)
    @Query(" SELECT t FROM AlunoCurriculo ac " +
            " INNER JOIN DisciplinaCurriculo dc " +
            " INNER JOIN dc.curriculo c " +
            " INNER JOIN ac.aluno a " +
            " INNER JOIN FETCH Turma t on t.disciplina = dc.disciplina ")
    List<Turma> obterDisciplinasPorMatricula(String matricula);
}
