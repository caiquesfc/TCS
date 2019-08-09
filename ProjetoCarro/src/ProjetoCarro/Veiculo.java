package ProjetoCarro;

public class Veiculo implements InterfaceVeiculo {

    private String cor;
    private String modelo;
    boolean status;
    private int qtdPneu;
    private int combustivel;
    private float gastoCombustivel;
    private final int nivelCombustivelMax = 10;
    int velMax;

    public void ligar() {
        if (this.status == true) {
            System.out.println("Carro já foi ligado!");
        }else{
            this.status = true;
            System.out.println("Carro ligado!");
        }
    }

    public void desligar() {
        if (this.status == false) {
            System.out.println("Carro já foi desligado!");
        }else{
            this.status = false;
            System.out.println("Carro desligado!");
        }
    }

    public boolean verificComb() {
        if (getCombustivel() == getCombustivelMax()) {
            return true;
        } else {
            return false;
        }
    }    
    public void acelerar() {
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public float getgastoCombustivel() {
        return gastoCombustivel;
    }

    public void setgastoCombustivel(float gastoCombustivel) {
        this.gastoCombustivel = gastoCombustivel;
    }
    public int getnivelCombustivelMax() {
        return nivelCombustivelMax;
    }

    @Override
    public void VerificComb() {

    }

    private int getCombustivelMax() {
        return 0;

    }

    @Override
    public void abastecer() {

    }

}
