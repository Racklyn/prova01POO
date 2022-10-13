package questao01;

public class Produto {
    private String nome;
    private double valor;

    //construtor
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    //métodos especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(){
        this.valor = valor;
    }
}
