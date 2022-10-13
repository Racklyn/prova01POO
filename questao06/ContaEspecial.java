package questao06;

public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float saldo, float limite){
        super(saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        if (valor > 0 && saldo-valor >= -limite){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("CONTA ESPECIAL - Saldo: R$%.2f (Limite R$%.2f)", this.saldo, this.limite);
    }

}
