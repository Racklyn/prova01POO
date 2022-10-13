package questao04;

public class Pix implements IPagamento {

    private TipoPix tipoPix;
    private String chave;

    public Pix(TipoPix tipoPix, String chave){
        this.tipoPix = tipoPix;
        this.chave = chave;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("\nPAGO COM PIX!!!");
        System.out.println("-------------------------------------------");
        System.out.printf("Valor: %.2f\n", valor);
        System.out.println("Tipo do pix: " + this.tipoPix.getValue());
        System.out.println("Chave: " + this.chave);
        System.out.println("--------------------------------------------");
    }
    
}
