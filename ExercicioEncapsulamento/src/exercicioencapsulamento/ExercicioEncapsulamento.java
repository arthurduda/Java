package exercicioencapsulamento;
public class ExercicioEncapsulamento {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.mudo();
        c.menosVolume();
        c.desligar();
        c.ligar();
        c.abrirMenu();
    }
}