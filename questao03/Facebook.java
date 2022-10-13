package questao03;

public class Facebook extends Plataforma{
    
    public Facebook(String email, String senha) {
        super.email = email;
        super.senha = senha;
    }

    public void logar() {
        System.out.println("Conta Facebook!");
        System.out.println("Usuário: " + super.email);
        System.out.println("Senha: " + super.senha);
    }
}
