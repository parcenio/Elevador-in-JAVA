
package br.com.pauloarcenio.mainpredio;

import java.util.Scanner;

public class MainPredio {

   
    public static void main(String[] args) {
        
        Elevador[] elevador;
        elevador = new Elevador[4];
        elevador[0]= new Elevador("Elevador1");
        elevador[1]= new Elevador("Elevador2");
        elevador[2]= new Elevador("Elevador3");
        elevador[3]= new Elevador("Elevador4");
        Elevador Elevador1 = elevador[0];
        Elevador Elevador2 = elevador[1];
        Elevador Elevador3 = elevador[2];
        Elevador Elevador4 = elevador[3];
        //INICIALIZANDO ELEVADORES
        Controlador.inicializa(Elevador1,(byte)0,(byte)0);
        Controlador.inicializa(Elevador2,(byte)0,(byte)0);
        Controlador.inicializa(Elevador3,(byte)0,(byte)0);
        Controlador.inicializa(Elevador4,(byte)0,(byte)0);
        
        Scanner leia = new Scanner(System.in);
        byte andar = 0;
        byte pessoas = 0;
        byte resposta;

        
        System.out.println("1 - Subir"
                    + "\n2 - Descer"
                    + "\n0 - Sair");
        resposta = leia.nextByte();
        
        do {
                        
            switch(resposta){
                case 1:
                    System.out.println("Quantas pessoas?");
                    pessoas = leia.nextByte();
                    System.out.println("Pra qual andar?");
                    andar = leia.nextByte();
                    Controlador.entrarPessoa(Elevador4, pessoas);
                    Controlador.subir(Elevador4, andar);
                    break;
                    
                case 2:
                    System.out.println("Quantas pessoas?");
                    pessoas = leia.nextByte();
                    System.out.println("Pra qual andar?");
                    andar = leia.nextByte();
                    Controlador.entrarPessoa(Elevador4, pessoas);
                    Controlador.descer(Elevador4, andar);
                    break;
                    
                default:
                    System.out.println("Dado inválido!");
                    break; 
                    
            }          
            
            for(Elevador imprimir : elevador){
                System.out.println(imprimir);
            }
            System.out.println("1 - Subir"
                    + "\n2 - Descer"
                    + "\n0 - Sair");
            resposta = leia.nextByte();
        }while(resposta != 0);
            
        System.out.println("OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS DE ELEVADOR!");
        
        
    }
    
    
}
