package aula02poo;
public class Aula02Poo {
    public static void main(String[] args) {
        /*Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.8f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();*/
        
        System.out.println("\n");
        
        /*Caneta c2 = new Caneta();
        c2.modelo = "Bic Intensity";
        c2.cor = "Preta";
        c2.ponta = 0.4f;
        c2.carga = 70;
        c2.destampar();
        c2.status();
        c2.rabiscar();*/
        
        Monitor m = new Monitor();
        m.modelo = "AOC 2050";
        m.cor = "Preto";
        m.resolução = "1600x900";
        m.polegadas = 20;
        m.tela = "LED";
        m.hz = 60;
        m.saída = "VGA";        
        m.status();
        m.ligar();
        m.imagem();
    }   
}