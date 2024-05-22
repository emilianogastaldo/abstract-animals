package zoo;

public class Passerotto extends Animale{
    public String nome;
    Passerotto(String nome){
        this.nome = nome;
    }

    @Override
    public void verso() {
        System.out.println("Cip Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio i semi");
    }
}
