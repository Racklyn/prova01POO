package questao04;

public enum TipoPix {
    TELEFONE("TELEFONE"),
    EMAIL("EMAIL"),
    CHAVE_ALEATORIA("CHAVE_ALEATORIA"),
    CPF_CNPJ("CPF_CNPJ");
    
    private final String value;

    TipoPix(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
