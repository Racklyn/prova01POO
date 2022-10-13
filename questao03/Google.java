package questao03;

public class Google extends Plataforma{
    
    public Google(String email, String senha) {
        super.email = email;
        super.senha = senha;
    }

    public void logar() {
        System.out.println("Conta Google!");
        System.out.println("Usuário: " + super.email);
        System.out.println("Senha: " + super.senha);
    }
}
