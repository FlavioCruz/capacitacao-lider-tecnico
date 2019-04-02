package sti.uff.br.treinamento.data;

import sti.uff.br.treinamento.model.Aluno;

import java.util.List;

public interface AlunoData {    /**


    /**
     * recupera um aluno pela matrícula informada
     * @param matricula {@link String}
     * @return {@link Aluno}
     */
    Aluno obterAlunoPorMatricula( String matricula);

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
