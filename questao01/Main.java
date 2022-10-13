package questao01;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Produto p1 = new Produto("Biscoito", 10);
        Produto p2 = new Produto("Arroz", 17);
        Produto p3 = new Produto("Feijão", 13);
        Produto p4 = new Produto("Cuscuz", 22);

        compra.adicionaProduto(p1, 3);
        compra.adicionaProduto(p2, 1);
        compra.adicionaProduto(p3, 2);
        compra.adicionaProduto(p4, 10);

        compra.listarProdutos();
        compra.obterValorTotal();
    }
}
