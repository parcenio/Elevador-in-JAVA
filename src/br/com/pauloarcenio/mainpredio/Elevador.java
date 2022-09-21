
package br.com.pauloarcenio.mainpredio;



public class Elevador {
    
    private byte posicao;
    private byte qntPessoas;
    private final String nome;

    public void inicializa(byte posicao, byte qntPessoas) {
        this.posicao = posicao;
        this.qntPessoas = qntPessoas;
    }

    public Elevador(String nome) {
//        this.posicao = posicao;
//        this.qntPessoas = qntPessoas;
            this.nome = nome;
    }
        
    public void subir(byte posicao){
        if(posicao > 0){
            this.posicao = posicao;
            this.qntPessoas--;
        }
    }
    public void descer(byte posicao){
        if (posicao != 0 && posicao > 0){
            this.posicao = posicao;
            this.qntPessoas--;
        }
    }

    public void entrarPessoas(byte qntPessoas) {
        this.qntPessoas += qntPessoas;
    }
    
    public void sairPessoas(byte qntPessoas) {
        this.qntPessoas -= qntPessoas;
    }
    
    public byte getPosicao() {
        return posicao;
    }

    public byte getPessoas() {
        return qntPessoas;
    }

    @Override
    public String toString() {
        return  nome + " posicao=" + posicao + ", qntPessoas=" + qntPessoas;
    }
    
    
    
}
