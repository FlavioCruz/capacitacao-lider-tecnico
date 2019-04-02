package sti.uff.br.treinamento.service;

import sti.uff.br.treinamento.model.Aluno;

import java.util.List;

public interface AlunoService {

    /**
     * lista todos os alunos do sistema
     * @return {@link List<Aluno>}
     */
    List<Aluno> obterTodosAlunos();

    /**
     * Lista todos os alunos de dado curso
     * @param codigo {@link String}
     * @return {@link List<Aluno>}
     */
    List<Aluno> obterAlunosPorCurso(String codigo);

    /**
     * recupera um aluno pela matrícula informada
     * @param matricula {@link String}
     * @return {@link Aluno}
     */
    Aluno obterAlunoPorMatricula(String matricula);

    /**
     * Cria um novo aluno
     * @param aluno {@link Aluno}
     * @return {@link String}
     */
    String criarAluno(Aluno aluno);

    /**
     * Remove um aluno existente
     * @param aluno {@link Aluno}
     * @return {@link Boolean}
     */
    boolean deletarAluno(Aluno aluno);

}
