package sti.uff.br.treinamento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class Turma {
    @Getter @Setter
    private long id;
    @Getter @Setter
    private Materia materia;
    @Getter @Setter
    private int cargaHoraria;
    @Getter @Setter
    private String anoPeriodo;
}
