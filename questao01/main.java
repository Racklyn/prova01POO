package questao01;

public class main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Produto p1 = new Produto("Biscoito", 10);
        Produto p2 = new Produto("Arroz", 17);
        Produto p3 = new Produto("Feijão", 13);
        Produto p4 = new Produto("Cuscuz", 22);

        compra.adicionaProduto(p1);
        compra.adicionaProduto(p2);
        compra.adicionaProduto(p3);
        compra.adicionaProduto(p4);

        compra.listarProdutos();
        compra.obterValorTotal();
    }
}
