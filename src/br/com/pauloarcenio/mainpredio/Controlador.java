
package br.com.pauloarcenio.mainpredio;

public class Controlador {
    
    Elevador[] elevador;
    
    public static void inicializa(Elevador elevador,byte posicao,byte qntPessoas){
        elevador.inicializa(posicao, qntPessoas);  
    }
    
    public static void entrarPessoa(Elevador elevador,byte posicao){
       elevador.entrarPessoas(posicao);
    }
    
    public static void sairPessoa(Elevador elevador, byte qntPessoas){
        elevador.sairPessoas(qntPessoas);
    }
    
    public static void subir(Elevador elevador,byte posicao){
        elevador.subir(posicao);
    }
    
    public static void descer(Elevador elevador,byte posicao){
        elevador.descer(posicao);
    }
    
    // BUGUEI,COMO CHAMAR E PERCORRER O ARRAY DA MAIN
    
}
