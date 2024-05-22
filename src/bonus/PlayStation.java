package bonus;

public class PlayStation extends Dispositivo implements DispositivoInterface{
    @Override
    public void play() {
        System.out.println("Sono una playstation e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una playstaion e sono in modalità stop");
    }
}
