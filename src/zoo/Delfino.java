package zoo;

public class Delfino extends Animale implements Nuotare{
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

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
