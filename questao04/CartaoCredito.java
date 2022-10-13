package questao04;

public class CartaoCredito implements IPagamento {

    private String contaDestino;
    private String agencia;

    public CartaoCredito(String contaDestino, String agencia){
        this.contaDestino = contaDestino;
        this.agencia = agencia;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("\nPAGO COM CARTÃO DE CRÉDITO!!!");
        System.out.println("-------------------------------------------");
        System.out.printf("Valor: %.2f\n", valor);
        System.out.println("Conta de Destino: " + this.contaDestino);
        System.out.println("Agência: " + this.agencia);
        System.out.println("--------------------------------------------");
    }

    
}