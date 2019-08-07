package projetopoo;

public abstract class computadores {

    protected float preco;
    protected boolean status;
    protected String so;

    void Ligar() {
        this.status = true;
        System.out.println("Computador ligado");
    }

    void InstallLinux() {
        this.setSo("Linux");
        System.out.println("O sistema foi instalado");

    }

    void Navegar() {
        if (this.status == false) {
            System.out.println("Não posso navegar");
        } else {
            System.out.println("Navegando");
        }
    }

    void Desligar() {
        if (this.status == true) {
            this.status = false;
            System.out.println("Computador desligado");
        } else {
            System.out.println("Computador já está desligado");

        }

    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

}
