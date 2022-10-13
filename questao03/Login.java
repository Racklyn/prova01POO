package questao03;

public class Login implements App {
    
    public void logarForm(Usuario usuario) {
        System.out.println("Usuário: " + usuario.getUsuario());
        System.out.println("Senha: " + usuario.getSenha());
    }

    public void logarPlataforma(Plataforma plataforma) {
        System.out.println("Login...");
        plataforma.logar();
    }
}
