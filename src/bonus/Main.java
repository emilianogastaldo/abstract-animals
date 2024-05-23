package bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Che dispositivo vuoi?");
        String dispositivo = scanner.nextLine();
        Dispositivo provaAbstract = Creator.create(dispositivo);
        DispositivoInterface provaInterfaccia = Creator.createInterface(dispositivo);
        provaAbstract.play();
        provaAbstract.stop();
        System.out.println("-------------");
        provaInterfaccia.play();
        provaInterfaccia.stop();
    }
}
