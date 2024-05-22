package zoo;

public class Main {
    public static void main(String[] args) {
        Animale[] zoo = {new Cane("Pluto"),new Passerotto("Paulie"), new Aquila("Marahute"), new Delfino("Mahito")};

        for (Animale animale : zoo) {
            if (animale instanceof Cane) {
                System.out.println("Nome animale: " + ((Cane) animale).nome);
            } else if (animale instanceof Passerotto) {
                System.out.println("Nome animale: " + ((Passerotto) animale).nome);
            } else if (animale instanceof Aquila) {
                System.out.println("Nome animale: " + ((Aquila) animale).nome);
            } else if (animale instanceof Delfino) {
                System.out.println("Nome animale: " + ((Delfino) animale).nome);
            }
            if (animale instanceof Volare) {
                faiVolare(((Volare) animale));
            }
            if (animale instanceof Nuotare) {
                faiNuotare(((Nuotare) animale));
            }

            animale.dormi();
            animale.mangia();
            animale.verso();
            System.out.println("**********************");
        }

    }
    public static void faiVolare(Volare animale){
        animale.vola();
    }public static void faiNuotare(Nuotare animale){
        animale.nuota();
    }
}
