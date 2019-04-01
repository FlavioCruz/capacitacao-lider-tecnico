package sti.uff.br.treinamento.model.enums;

public enum SituacaoEnum {
    INSCRITO_ONLINE(1);

    public int status;

    SituacaoEnum(int status){
        this.status = status;
    }
}
