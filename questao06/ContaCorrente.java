package questao06;

public class ContaCorrente {
    protected float saldo;

    public ContaCorrente(){

    }

    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public boolean sacar(float valor){
        if (valor > 0 && saldo-valor >= 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(ContaCorrente contaDestino, float valor){
        if (sacar(valor)){
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("CONTA - Saldo: R$%.2f", this.saldo);
    }
}
