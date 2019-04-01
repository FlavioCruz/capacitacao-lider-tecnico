package sti.uff.br.treinamento.data;

import sti.uff.br.treinamento.model.Aluno;

import java.util.List;

public interface AlunoData {

    Aluno obterAlunoPorMatricula( String matricula);

    List<Aluno> obterTodosAlunos();

    String criarAluno(Aluno aluno);

    boolean deletarAluno(Aluno aluno);

}
