package aula13poopolimorfismosobrecarga;
public class Lobo extends Mamifero {

    public Lobo(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuu!");
    }
}