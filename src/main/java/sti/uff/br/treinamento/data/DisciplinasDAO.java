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



//    @Query(value = "select t.* from turma t\n" +
//            " inner join disciplina d on d.iddisciplina = t.iddisciplina\n" +
//            " inner join CUR_DISCIPLINACURRICULO dc on dc.iddisciplina = d.iddisciplina\n" +
//            " inner join cur_curriculo c on c.idcurriculo = dc.idcurriculo and c.idversaocurriculo = dc.idversaocurriculo\n" +
//            " inner join alunocurriculo ac on ac.idcurriculo = c.idcurriculo\n" +
//            " inner join aluno a on a.ididentificador = ac.idaluno\n" +
//            " where a.matricula = '113031015'\n" +
//            " and t.STATUS in (1, 2, 3, 4)\n" +
//            " and t.anosemestre = '20191'\n" +
//            " and t.vagasregular is not null\n",
//            nativeQuery = true)

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
