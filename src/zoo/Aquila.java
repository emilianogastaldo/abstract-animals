package zoo;

public class Aquila extends Animale{

    private String nome;

    Aquila(String nome){
        this.nome = nome;
    }

    @Override
    public void verso() {
        System.out.println("verso dell'aquila");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio altri animali");
    }
}
