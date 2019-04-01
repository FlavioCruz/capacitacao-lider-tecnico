package sti.uff.br.treinamento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sti.uff.br.treinamento.model.enums.SituacaoEnum;

@AllArgsConstructor @NoArgsConstructor
public class Inscricao {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private Aluno aluno;
    @Getter @Setter
    private Materia materia;
    @Getter @Setter
    private SituacaoEnum situacao;
}
