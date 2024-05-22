package zoo;

public class Main {
    public static void main(String[] args) {
        Animale[] zoo = {new Cane("Pluto"),new Passerotto("Paulie"), new Aquila("Marahute"), new Delfino("Mahito")};

        for (int i = 0; i < zoo.length; i++) {
            if(zoo[i] instanceof Cane){
                System.out.println("Nome animale: "+ ((Cane) zoo[i]).nome);
            } else if (zoo[i] instanceof Passerotto) {
                System.out.println("Nome animale: "+ ((Passerotto) zoo[i]).nome);
            } else if (zoo[i] instanceof Aquila){
                System.out.println("Nome animale: "+ ((Aquila) zoo[i]).nome);
            } else if (zoo[i] instanceof Delfino) {
                System.out.println("Nome animale: "+ ((Delfino) zoo[i]).nome);
            }

            zoo[i].dormi();
            zoo[i].mangia();
            zoo[i].verso();
            System.out.println("**********************");
        }
    }
}
