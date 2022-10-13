package questao03;

public class main {
    public static void main(String[] args) {
        Login app = new Login();
        Usuario usuario = new Usuario("user", "123456789");
        Google google = new Google("usergoogle@gmail.com", "123456789");
        Facebook facebook = new Facebook("userfacebook@gmail.com", "123456789");
        ICloud icloud = new ICloud("usericloud@gmail.com", "123456789");

        System.out.println("Logando por Form!");
        app.logarForm(usuario);
        System.out.println(""); //pular linha

        //Google
        app.logarPlataforma(google);
        System.out.println(""); //pular linha

        //Facebook
        app.logarPlataforma(facebook);
        System.out.println(""); //pular linha

        //iCloud
        app.logarPlataforma(icloud);
    }
}
