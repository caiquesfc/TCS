package ProjetoCarro;

import java.util.Scanner;

public class Carro extends Veiculo {

    public Carro() {
        
    }
    
    public void abastecer() {        
            {
                int auxiliar;
                auxiliar = this.getCombustivel() - this.getnivelCombustivelMax();
                this.setCombustivel(this.getCombustivel() + auxiliar);
                this.setgastoCombustivel(this.getgastoCombustivel() + (auxiliar * 4));
                System.out.println("Seu carro foi abastecido com: " + auxiliar + " Litros");
                System.out.println("O valor gasto foi de: " + auxiliar * 4);                
            }       
    }

    public void acelerar() {
        if (this.status == true) {
            this.velMax = this.velMax + 20;
            for (int i = 0; velMax <= 140; i += 20)
            break;
            System.out.println(this.velMax +"Km/h ... Acelerando!");            
            if (this.velMax == 140){
                System.out.println("Velocidade Máxima!");
            }
            
        }
    }

    private boolean getstatus() {
        return false;

    }

    void nivelCombustivelMax() {
        
    }
}
