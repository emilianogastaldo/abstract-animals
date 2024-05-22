package bonus;

import java.util.Scanner;

public class Creator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Che dispositivo vuoi?");
        String dispositivo = scanner.nextLine();
        Dispositivo prova = create(dispositivo);
        DispositivoInterface prova2 = createInterface(dispositivo);
        prova.play();
        prova.stop();
        System.out.println("-------------");
        prova2.play();
        prova2.stop();
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
    public static DispositivoInterface createInterface(String dispositivo){
        DispositivoInterface lett = null;
        if(dispositivo.equals("lettore dvd")) {
            lett = new LettoreDvd();
        }
        if(dispositivo.equals("playstation")){
            lett = new PlayStation();
        }
        return lett;
    }
}
