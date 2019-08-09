
package ProjetoCarro;


public class Caminhao extends Veiculo{
    
public Caminhao() {
        
    }
    
    public void abastecer() {
        if (!getstatus()) {
            if (verificComb()) {
                System.out.println("O tanque dao seu caminhão está cheio! ");
            } else {
                int auxiliar;
                auxiliar = getCombustivel() - getnivelCombustivelMax();
                setCombustivel(getCombustivel() + auxiliar);
                setgastoCombustivel(getgastoCombustivel() + (auxiliar * 2));
                System.out.println("Sseu caminhão foi abastecido com " + auxiliar + " Litros");
                System.out.println("O valor gasto foi de: " + auxiliar * 2);
                System.out.println("O valor do gasto total foi de: " + getgastoCombustivel());
            }

        }
    }

    public void acelerar() {
        if (this.status == true) {
            this.velMax = this.velMax + 10;
            for (int i = 0; velMax <= 140; i += 10)
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
}
