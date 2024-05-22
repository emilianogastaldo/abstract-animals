package bonus;

import java.util.Scanner;

public class Creator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Che dispositivo vuoi?");
        String dispositivo = scanner.nextLine();
        Dispositivo prova = create(dispositivo);
        prova.play();
        prova.stop();
    }
    public static Dispositivo create(String disp){
        Dispositivo lett = null;
        if(disp.equals("lettore dvd")){
            lett = new LettoreDvd();
        }
        if(disp.equals("playstation")){
            lett = new PlayStation();
        }
        return lett;
    }
}
