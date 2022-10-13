package questao04;

public class ModuloPagamento {
    private IPagamento metodoPagamento;

    public void informarMetodoPagamento(IPagamento metodoPagamento){
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(double valor){
        this.metodoPagamento.efetuarPagamento(valor);
    }
}
