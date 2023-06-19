package aula12poopolimorfismo;
public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    
    
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    @Override
    public void locomover() {
        System.out.print("\nSaltando, ");
    }
    @Override
    public void alimentar() {
        System.out.print("Mamando, ");
    }
    @Override
    public void emitirSom() {
        System.out.print("Som de mamífero\n"); 
    }
        
}