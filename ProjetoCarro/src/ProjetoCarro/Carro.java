
package ProjetoCarro;


public class Carro extends Veiculo implements InterfaceVeiculo {

    @Override
    public void ligar() {
        this.status = true;
        System.out.println("Veiculo ligado!");
    }

    @Override
    public void desligar() {
        
    }

    @Override
    public void abastecer() {
        
    }

    @Override
    public void acelerar() {
        
    }

    @Override
    public void trocarPneu() {
        
    }
    
}
