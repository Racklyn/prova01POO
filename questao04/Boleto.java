package questao04;

public class Boleto implements IPagamento {

    private String codigoBarras;
    private String numeroDocumento;
    private String dataVencimento;

    public Boleto(String codigoBarras, String numeroDocumento, String dataVencimento){
        this.codigoBarras = codigoBarras;
        this.numeroDocumento = numeroDocumento;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("\nPAGO COM BOLETO!!!");
        System.out.println("-------------------------------------------");
        System.out.printf("Valor: %.2f\n", valor);
        System.out.println("Código de barras: " + this.codigoBarras);
        System.out.println("Número do Documento: " + this.numeroDocumento);
        System.out.println("Data de vencimento: " + this.dataVencimento);
        System.out.println("--------------------------------------------");
    }
    
}
