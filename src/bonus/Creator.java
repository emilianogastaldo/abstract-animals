package bonus;

import java.util.Scanner;

public class Creator {
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
