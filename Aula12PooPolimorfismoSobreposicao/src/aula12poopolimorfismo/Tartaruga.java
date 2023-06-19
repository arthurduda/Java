package aula12poopolimorfismo;
public class Tartaruga extends Reptil {

    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
    
    @Override
    public void locomover() {
        System.out.print("Andando beeeeem devagar, ");
    }
}