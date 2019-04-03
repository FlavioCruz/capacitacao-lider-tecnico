package sti.uff.br.treinamento.data;

import sti.uff.br.treinamento.model.Inscricao;

import java.util.List;

public interface InscricaoData {

    List<Inscricao> obterInscricoes();

    List<Inscricao> obterInscricaoPorAluno(String matricula);

    Inscricao obterUnicaInscricao(String matricula, String codigo, String anoPeriodo);
}
