package questao05;

public abstract class Comunicacao {
    public void conectar(){
        this.estabelecerConexao();
        this.processarDados();
        this.fecharConexao();
    }

    protected void estabelecerConexao(){
        System.out.println("Estabelecendo conexão!");
    }

    protected abstract void processarDados();

    protected void fecharConexao(){
        System.out.println("Fechando conexão!");
    }
}
