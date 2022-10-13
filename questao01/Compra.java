package questao01;
import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private double valorTotal;

    void adicionaProduto(Produto produto){
        produtos.add(produto);
        valorTotal += produto.getValor();
    }

    void obterValorTotal(){
        System.out.println(valorTotal);
    }

    void listarProdutos(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).getNome());
        }
    }
}
