package questao05;

public class Main {
    public static void main(String[] args) {
        UFALBluetooth.conectar(new ComSerial());
        System.out.println("------------------");
        UFALBluetooth.conectar(new ComPacotes());
    }
}
