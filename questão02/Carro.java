package questão02;

public class Carro {
    private String marca;
    private String cor;
    private int quantidadePessoas;

    //construtor
    public Carro(String marca, String cor, int quantidadePessoas){
        this.marca = marca;
        this.cor = cor;
        if(quantidadePessoas > 0 && quantidadePessoas <= 5) {
            this.quantidadePessoas = quantidadePessoas;
        }
    }

        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }

        public int getGuantidadePessoas() {
            return quantidadePessoas;
        }
        public void setQuantidadePessoas(int quantidadePessoas) {
            this.quantidadePessoas = quantidadePessoas;
        }
    }
