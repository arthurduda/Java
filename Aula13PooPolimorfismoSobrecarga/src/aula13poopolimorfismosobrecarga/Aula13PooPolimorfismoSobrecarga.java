package aula13poopolimorfismosobrecarga;
public class Aula13PooPolimorfismoSobrecarga {
    public static void main(String[] args) {
        Cachorro c = new Cachorro(10f, 6, 4, "Caramelo");
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(12.5f, 2);
        c.reagir(4.5f, 17);
    }
}