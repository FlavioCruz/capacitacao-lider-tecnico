package sti.uff.br.treinamento.model;

import java.util.Date;

public class Aluno {

//    @Getter @Setter
    private String nome;
//    @Getter @Setter
    private String cpf;
//    @Getter @Setter
    private String matricula;
//    @Getter @Setter
    private Date nascimento;

    public Aluno(String nome, String cpf, String matricula, Date nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nascimento = nascimento;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
