package questao06;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();

    public Cliente(){
        
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String text = "Cliente: " + this.nome 
            + "\n==========CONTAS==========";
        float saldoTotal = 0;
        for (ContaCorrente c: contas){
            text += "\n" + c;
            saldoTotal += c.saldo;
        }

        return text + "\n" + 
            String.format("*** Saldo total: R$%.2f", saldoTotal); 
    }
}
