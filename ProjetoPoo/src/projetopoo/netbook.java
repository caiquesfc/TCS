package projetopoo;

public class netbook extends computadores implements Icomputador {

    @Override
    public void Ligar() {
        this.status = true;
    }

    @Override
    public void Desligar() {

    }

    @Override
    public void boasVindas() {
        System.out.println("Eaeeeeeee");
    }

}
