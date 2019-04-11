package sti.uff.br.treinamento.service;

import br.uff.sti.graduacao.academico.model.Disciplina;
import br.uff.sti.graduacao.academico.model.Turma;

import java.util.List;

public interface DisciplinaService {

    Disciplina obterDisciplinaPorCodigo(String codigoDIsciplina);

    List<Turma> obterDisciplinasPorCurso(String matricula);

    String criarDisciplina(Disciplina disciplina);

    boolean deletarDisciplina(Disciplina disciplina);
}
