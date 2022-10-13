package questao01;
import java.util.ArrayList;

public class Compra {
    private ArrayList<ProdutoItens> produtos = new ArrayList<ProdutoItens>();
    private double valorTotal;

    void adicionaProduto(Produto produto, int quantidade){
        produtos.add(new ProdutoItens(produto, quantidade));
        valorTotal += produto.getValor() * quantidade;
    }

    void obterValorTotal(){
        System.out.println(valorTotal);
    }

    void listarProdutos(){
        for(ProdutoItens p: produtos){
            System.out.println(p.getProduto().getNome() + " - " + p.getQuantidade() + " itens");
        }
    }
}
