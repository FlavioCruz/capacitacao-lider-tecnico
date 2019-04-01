package sti.uff.br.treinamento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class Materia {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private String nome;

}
