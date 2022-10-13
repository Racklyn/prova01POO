package questao01;

public class ProdutoItens {
    private Produto produto;
    private int quantidade;

    public ProdutoItens(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    double getSubTotal(){
        return this.produto.getValor() * this.quantidade;
    }
    
}
