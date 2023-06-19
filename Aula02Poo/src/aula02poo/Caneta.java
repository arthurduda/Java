package aula02poo;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor: " +this.cor);
        System.out.println("Ponta: " +this.ponta +"mm");
        System.out.println("Carga: " +this.carga +"%");
        System.out.println("Está tampada?: " +this.tampada);        
    }    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! não posso rabiscar");
        } else if (this.tampada == false){
            System.out.println("Estou rabiscando...");
        }
    }   
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}