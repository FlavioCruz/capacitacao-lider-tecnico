package sti.uff.br.treinamento.service.impl;

import br.uff.sti.graduacao.academico.model.Disciplina;
import br.uff.sti.graduacao.academico.model.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sti.uff.br.treinamento.data.DisciplinasDAO;
import sti.uff.br.treinamento.service.DisciplinaService;

import java.util.List;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    @Autowired
    DisciplinasDAO disciplinasDAO;

    @Override
    public Disciplina obterDisciplinaPorCodigo(String codigoDisciplina) {
        return disciplinasDAO.obterDisciplinaPorCodigo(codigoDisciplina);
    }

    @Override
    public List<Turma> obterDisciplinasPorCurso(String matricula) {
        List<Turma> disciplinas = disciplinasDAO.obterDisciplinasPorMatricula(matricula);
//        List<Turma> turmas = new ArrayList<>();
//        for(Disciplina disciplina : disciplinas){
//            Turma t = new Turma();
//            t.setDisciplina(disciplina);
//            turmas.add(t);
//        }
        return disciplinas;
    }

    @Override
    public String criarDisciplina(Disciplina disciplina) {
        return null;
    }

    @Override
    public boolean deletarDisciplina(Disciplina disciplina) {
        return false;
    }
}
