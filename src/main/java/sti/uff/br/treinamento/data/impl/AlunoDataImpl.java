package sti.uff.br.treinamento.data.impl;

import org.springframework.stereotype.Repository;
import sti.uff.br.treinamento.data.AlunoData;
import sti.uff.br.treinamento.model.Aluno;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class AlunoDataImpl implements AlunoData {

    List<Aluno> alunos = Arrays.asList(
            new Aluno("Aluno 1", "12345678998", "123456781", new Date()),
            new Aluno("Aluno 2", "12345678997", "123456782", new Date()),
            new Aluno("Aluno 3", "12345678996", "123456783", new Date()),
            new Aluno("Aluno 4", "12345678995", "123456784", new Date()),
            new Aluno("Aluno 5", "12345678994", "123456785", new Date()),
            new Aluno("Aluno 6", "12345678993", "123456786", new Date()),
            new Aluno("Aluno 7", "12345678992", "123456787", new Date()),
            new Aluno("Aluno 8", "12345678991", "123456788", new Date()),
            new Aluno("Aluno 9", "12345678910", "123456789", new Date()),
            new Aluno("Aluno 10", "12345678911", "123456710", new Date()),
            new Aluno("Aluno 11", "12345678912", "123456711", new Date()),
            new Aluno("Aluno 12", "12345678913", "123456712", new Date()),
            new Aluno("Aluno 13", "12345678914", "123456713", new Date())
    );

    @Override
    public Aluno obterAlunoPorMatricula(String matricula) {
        return alunos.stream()
                .filter(x -> x.getMatricula().equals(matricula))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Aluno> obterTodosAlunos() {
        return alunos;
    }

    @Override
    public String criarAluno(Aluno aluno) {
        alunos.add(aluno);
        return aluno.getMatricula();
    }

    @Override
    public boolean deletarAluno(Aluno aluno) {
        return alunos.removeIf(x -> x.getMatricula().equals(aluno.getMatricula()));
    }
}
