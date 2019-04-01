package sti.uff.br.treinamento.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sti.uff.br.treinamento.data.AlunoData;
import sti.uff.br.treinamento.model.Aluno;
import sti.uff.br.treinamento.service.AlunoService;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoData alunoData;

    @Override
    public List<Aluno> obterTodosAlunos() {
        return alunoData.obterTodosAlunos();
    }

    @Override
    public Aluno obterAlunoPorMatricula(String matricula) {
        return alunoData.obterAlunoPorMatricula(matricula);
    }

    @Override
    public String criarAluno(Aluno aluno) {
        return alunoData.criarAluno(aluno);
    }

    @Override
    public boolean deletarAluno(Aluno aluno) {
        return alunoData.deletarAluno(aluno);
    }
}
