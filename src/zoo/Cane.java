package zoo;

public class Cane extends Animale{
    public String nome;
    Cane(String nome){
        this.nome = nome;
    }
    @Override
    public void verso() {
        System.out.println("Bau Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio la carne");
    }
}
