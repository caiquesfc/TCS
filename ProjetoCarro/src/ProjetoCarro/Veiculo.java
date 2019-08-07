package ProjetoCarro;

public class Veiculo {

    private String modelo;
    private String cor;
    boolean status;
    private float precoCombustivel;
    protected int nivelConbustivel;

    void ligar() {
        this.status = true;       
    }

    void desligar() {
        this.status = false;
        System.out.println("Veiculo desligado!");
    }

    void abastecer() {
        this.status = true;
        System.out.println("Veículo abastecido!");
    }

    void trocarPneu() {
        this.status = true;
        System.out.println("Pneu trocado!");
    }

    void acelerar() {
        this.status = true;
        System.out.println("Acelerando!");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(float precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public int getNivelConbustivel() {
        return nivelConbustivel;
    }

    public void setNivelConbustivel(int nivelConbustivel) {
        this.nivelConbustivel = nivelConbustivel;
    }
    
}
