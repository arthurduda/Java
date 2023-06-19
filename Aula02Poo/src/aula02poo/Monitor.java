package aula02poo;
public class Monitor {
    String modelo;
    String cor;
    String resolução;
    String saída;
    String tela;
    int polegadas;
    int hz;
    boolean ligado;
    
    void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor: " +this.cor);
        System.out.println("Resolução: " +this.resolução);
        System.out.println("Tamanho: " +this.polegadas +" Polegadas");
        System.out.println("Tipo de tela: " +this.tela);
        System.out.println("Frequência: " +this.hz +"hz");
        System.out.println("Tipo de saída: " +this.saída);       
    }
    void ligar(){
        this.ligado = true;
    }
    void desligar(){
        this.ligado = false;        
    }
    void imagem(){
        if (this.ligado == true){
            System.out.println("Estou mostrando imagem!");
        } else {
            System.out.println("Não estou mostrando imagem, por favor me ligue!");
        }
    }
}