package sti.uff.br.treinamento.data.impl;

import org.springframework.stereotype.Repository;
import sti.uff.br.treinamento.data.AlunoData;
import sti.uff.br.treinamento.model.Aluno;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AlunoDataImpl implements AlunoData {

    List<Aluno> alunos = Arrays.asList(
            new Aluno("Aluno 1", "12305178998", "123051781", new Date()),
            new Aluno("Aluno 2", "12305178997", "123051782", new Date()),
            new Aluno("Aluno 3", "12305178996", "123051783", new Date()),
            new Aluno("Aluno 4", "12305278995", "123052784", new Date()),
            new Aluno("Aluno 5", "12305378994", "123053785", new Date()),
            new Aluno("Aluno 6", "12305378993", "123053786", new Date()),
            new Aluno("Aluno 7", "12305478992", "123054787", new Date()),
            new Aluno("Aluno 8", "12305478991", "123054788", new Date()),
            new Aluno("Aluno 9", "12305578910", "123055789", new Date()),
            new Aluno("Aluno 10", "12305578911", "123055710", new Date()),
            new Aluno("Aluno 11", "12305558912", "123055711", new Date()),
            new Aluno("Aluno 12", "12305558913", "123055712", new Date()),
            new Aluno("Aluno 13", "12305558914", "123055713", new Date())
    );

    /**
     * recupera um aluno pela matrícula informada
     * @param matricula {@link String}
     * @return {@link Aluno}
     */
    @Override
    public Aluno obterAlunoPorMatricula(String matricula) {
        return alunos.stream()
                .filter(x -> x.getMatricula().equals(matricula))
                .findFirst()
                .orElse(null);
    }

    /**
     * lista todos os alunos do sistema
     * @return {@link List<Aluno>}
     */
    @Override
    public List<Aluno> obterTodosAlunos() {
        return alunos;
    }

    /**
     * Lista todos os alunos de dado curso
     * @param codigo {@link String}
     * @return {@link List<Aluno>}
     */
    @Override
    public List<Aluno> obterAlunosPorCurso(String codigo){
        return alunos.stream()
                .filter( x -> x.getMatricula().substring(3, 6).equals(codigo))
                .collect(Collectors.toList());
    }

    /**
     * Cria um novo aluno
     * @param aluno {@link Aluno}
     * @return {@link String}
     */
    @Override
    public String criarAluno(Aluno aluno) {
        alunos.add(aluno);
        return aluno.getMatricula();
    }

    /**
     * Remove um aluno existente
     * @param aluno {@link Aluno}
     * @return {@link Boolean}
     */
    @Override
    public boolean deletarAluno(Aluno aluno) {
        return alunos.removeIf(x -> x.getMatricula().equals(aluno.getMatricula()));
    }
}
