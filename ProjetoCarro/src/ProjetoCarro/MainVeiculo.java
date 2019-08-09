package ProjetoCarro;

import java.util.Scanner;

public class MainVeiculo {

    public static void main(String[] args) throws InterruptedException {
        Carro carro = null;
        Moto moto = null;
        Caminhao caminhao = null;
        int opcao, funcao;

        do {
            System.out.println("Escolha um veículo:");
            System.out.println("0. Sair");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    carro = new Carro();
                    do {
                        System.out.println("\tEscolha uma função para o carro:");
                        System.out.println("0. Sair");
                        System.out.println("1. Ligar");
                        System.out.println("2. Desligar");
                        System.out.println("3. Acelerar");
                        System.out.println("4. Nível do combustível");
                        System.out.println("5. Abastecer");
                        Scanner ler = new Scanner(System.in);
                        funcao = ler.nextInt();
                        switch (funcao) {
                            case 1:
                                carro.ligar();                                
                                break;
                            case 2:
                                carro.desligar();                                
                                break;
                            case 3:
                                carro.acelerar();                                
                                break;
                            case 4:
                                System.out.println("Nível de combustível: " + carro.getnivelCombustivelMax() + "Litros");
                                break;
                            case 5:
                                carro.abastecer();                                
                                break;
                            
                        }
                    } while (funcao != 0);
                    break;
                    case 2:
                            moto = new Moto();
                            do {
                                System.out.println("\tEscolha uma função para a moto:");
                                System.out.println("0. Sair");
                                System.out.println("1. Ligar");
                                System.out.println("2. Desligar");
                                System.out.println("3. Acelerar");
                                System.out.println("4. Nível do combustível");
                                System.out.println("5. Abastecer");
                                Scanner ler = new Scanner(System.in);
                                funcao = ler.nextInt();
                                switch (funcao) {
                                    case 1:
                                        moto.ligar();                                        
                                        break;
                                    case 2:
                                        moto.desligar();                                        
                                        break;
                                    case 3:
                                        moto.acelerar();                                        
                                        break;
                                    case 4:
                                        System.out.println("Nível de combustível: " + moto.getnivelCombustivelMax() + "Litros");
                                        break;
                                    case 5:
                                        moto.abastecer();                                        
                                        break;                                    
                                }
                            } while (funcao != 0);
                            break;                            
                            case 3:
                                caminhao = new Caminhao();
                                    do {
                                        System.out.println("\tEscolha uma função para o caminhão:");
                                        System.out.println("0. Sair");
                                        System.out.println("1. Ligar");
                                        System.out.println("2. Desligar");
                                        System.out.println("3. Acelerar");
                                        System.out.println("4. Nível do combustível");
                                        System.out.println("5. Abastecer");
                                        Scanner ler = new Scanner(System.in);
                                        funcao = ler.nextInt();
                                        switch (funcao) {
                                            case 1:
                                                caminhao.ligar();                                                
                                                break;
                                            case 2:
                                                caminhao.desligar();                                                
                                                break;
                                            case 3:
                                                caminhao.acelerar();                                                
                                                break;
                                            case 4:
                                                System.out.println("Nível de combustível: " + caminhao.getnivelCombustivelMax() + "Litros");
                                                break;
                                            case 5:
                                                caminhao.abastecer();                                                
                                                break;                                            
                                        }
                                    } while (funcao != 0);
                            }
                    }while (opcao != 0);
    }
}
        