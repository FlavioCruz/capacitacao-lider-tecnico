package sti.uff.br.treinamento.service.impl;

import br.uff.sti.graduacao.academico.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sti.uff.br.treinamento.data.AlunosDAO;
import sti.uff.br.treinamento.service.AlunoService;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunosDAO alunosDAO;

    private AlunosDAO swapDAO;

    /**
     * lista todos os alunos do sistema
     * @return {@link List<Aluno>}
     */
    @Override
    public Aluno obterTodosAlunos() {
        return null;
    }

    /**
     * Lista todos os alunos de dado curso
     * @param matricula {@link String}
     * @return {@link List<Aluno>}
     */
    @Override
    public List<Aluno> obterAlunosPorCurso(String matricula){
        String substPeriodo = matricula.substring(0, 3);
        String substSeqAluno = matricula.substring(matricula.length() - 3);
        String codigoCurso = matricula.replace(substPeriodo, "").replace(substSeqAluno, "");
        return alunosDAO.obterAlunosPorCurso(Long.parseLong(codigoCurso));
    }

    /**
     * recupera um aluno pela matrícula informada
     * @param matricula {@link String}
     * @return {@link Aluno}
     */
    @Override
    public Aluno obterAlunoPorMatricula(String matricula) {
        return alunosDAO.getAlunoByMatricula(matricula);
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

    public void setMockDAO(AlunosDAO dao){
        swapDAO = alunosDAO;
        alunosDAO = dao;
    }

    public void unsetMockDAO(){
        alunosDAO = swapDAO;
    }
}
