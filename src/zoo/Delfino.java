package zoo;

public class Delfino extends Animale{
    public String nome;
    Delfino(String nome){
        this.nome = nome;
    }

    @Override
    public void verso(){
        System.out.println("Verso delfino");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio pesci");
    }
}
