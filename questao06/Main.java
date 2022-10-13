package questao06;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Zezinho da Silva");
        c1.contas.add(new ContaCorrente(300));
        c1.contas.add(new ContaEspecial(1800, 2000));
        System.out.println(c1);

        System.out.println(c1.contas.get(0).sacar(130));
        System.out.println(c1.contas.get(1).sacar(2100));
        System.out.println(c1.contas.get(1).sacar(2000));
        System.out.println(c1);

        Cliente c2 = new Cliente("Benedido Aparecido");
        c2.contas.add(new ContaCorrente(1000));
        System.out.println(c2);

        System.out.println(c1.contas.get(1).transferir(c2.contas.get(0), 200));

        System.out.println(c2);
    }
}
