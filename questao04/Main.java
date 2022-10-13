package questao04;

public class Main {
    public static void main(String[] args) {
        ModuloPagamento mPag = new ModuloPagamento();

        mPag.informarMetodoPagamento(new CartaoCredito("12.345-00", "123-0"));
        mPag.pagar(240);

        mPag.informarMetodoPagamento(new Pix(TipoPix.CHAVE_ALEATORIA, "12345abcde"));
        mPag.pagar(35.70);

        mPag.informarMetodoPagamento(new Boleto("01234238954378935", "11111222", "20/10/2022"));
        mPag.pagar(180);
    }
}
