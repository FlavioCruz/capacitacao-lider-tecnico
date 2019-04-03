package sti.uff.br.treinamento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class Materia {

    @Getter @Setter
    private String codigo;
    @Getter @Setter
    private String nome;

}
