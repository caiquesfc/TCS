package projetopoo;

public class notebook extends computadores implements Icomputador{

    private String cor;
    private String modelo;
    private int tela;

    public notebook() { //construtor sem o uso de parametro
        this.cor = "Azul";
        this.modelo = "z72";
        this.preco = 5.90f;
        this.status = false;
        this.tela = 15;
    }

    public notebook(String cor, String modelo, int tela) { //construtor com o uso de parametro
        this.cor = cor;
        this.modelo = modelo;
        this.preco = 5.90f;
        this.tela = tela;
        this.status = false;
        this.tela = 15;
        this.so = "";
    }

    void MostrarCarac() {

        System.out.println("cor: " + this.cor);
        System.out.println("modelo: " + this.modelo);
        System.out.println("preco: " + this.preco);
        System.out.println("status: " + this.status);
        System.out.println("tela: " + this.tela);
        System.out.println("S.O Linux Deepin " + this.so);
    }    
    
    public String getCor() {
        return this.cor;

    }

    public String getModelo() {
        return this.modelo;

    }    

    private void setCor(String cor) {
        this.cor = cor;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }
           
    @Override
    public void Ligar() {
        this.status = true; 
    }

    
    @Override
    public void Desligar() {
        
    }
    
    @Override
    public void boasVindas() {
        System.out.println("Salve");
    }

    

}
