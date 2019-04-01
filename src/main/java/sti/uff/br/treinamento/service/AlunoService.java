package sti.uff.br.treinamento.service;

import sti.uff.br.treinamento.model.Aluno;

import java.util.List;

public interface AlunoService {

    List<Aluno> obterTodosAlunos();

    Aluno obterAlunoPorMatricula(String matricula);

    String criarAluno(Aluno aluno);

    boolean deletarAluno(Aluno aluno);

}
