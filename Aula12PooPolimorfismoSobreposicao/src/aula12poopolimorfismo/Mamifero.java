package aula12poopolimorfismo;
public class Mamifero extends Animal {
    
    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorPelo(corPelo);
    }
  
    
    public void pelo() {
        System.out.println("Cor do pelo: " +this.getCorPelo());
    }
    @Override
    public void locomover() {
        System.out.print("\nCorrendo, ");
    }
    @Override
    public void alimentar() {
        System.out.print("Mamando, ");
    }
    @Override
    public void emitirSom() {
        System.out.print("Som de Mamífero\n");
    }
    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}