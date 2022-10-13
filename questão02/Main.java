package questão02;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        Carro c1 = new Carro("Palio", "Prata", 1);
        Carro c2 = new Carro("Jetta", "Preto", 1);
        Carro c3 = new Carro("Nivus", "Branco", 3);
        Carro c4 = new Carro("Civic", "Azul", 1);

        estacionamento.adicionarCarro(c1);
        estacionamento.adicionarCarro(c2);
        estacionamento.adicionarCarro(c3);
        estacionamento.adicionarCarro(c4);

        estacionamento.listarCarros();
        estacionamento.obterQuantidadeTotalPessoas();
    }
}
