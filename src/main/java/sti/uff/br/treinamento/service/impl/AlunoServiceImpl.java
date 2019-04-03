package sti.uff.br.treinamento.service.impl;

import br.uff.sti.graduacao.academico.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sti.uff.br.treinamento.data.AlunoData;
import sti.uff.br.treinamento.data.AlunoSSDAO;
import sti.uff.br.treinamento.service.AlunoService;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoData alunoData;

    @Autowired
    AlunoSSDAO alunoDAO;

    /**
     * lista todos os alunos do sistema
     * @return {@link List<Aluno>}
     */
    @Override
    public Aluno obterTodosAlunos() {
        return alunoDAO.getAlunoByMatricula("113031015");
    }

    /**
     * Lista todos os alunos de dado curso
     * @param codigo {@link String}
     * @return {@link List<Aluno>}
     */
    @Override
    public List<Aluno> obterAlunosPorCurso(String codigo){
        return null;//lunoData.obterAlunosPorCurso(codigo);
    }

    /**
     * recupera um aluno pela matrícula informada
     * @param matricula {@link String}
     * @return {@link Aluno}
     */
    @Override
    public Aluno obterAlunoPorMatricula(String matricula) {
        return null;//alunoData.obterAlunoPorMatricula(matricula);
    }

    /**
     * Cria um novo aluno
     * @param aluno {@link Aluno}
     * @return {@link String}
     */
    @Override
    public String criarAluno(Aluno aluno) {
        return "";//alunoData.criarAluno(aluno);
    }

    /**
     * Remove um aluno existente
     * @param aluno {@link Aluno}
     * @return {@link Boolean}
     */
    @Override
    public boolean deletarAluno(Aluno aluno) {
        return false;//alunoData.deletarAluno(aluno);
    }
}
