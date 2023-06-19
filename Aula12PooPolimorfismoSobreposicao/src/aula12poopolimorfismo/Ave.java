package aula12poopolimorfismo;
public class Ave extends Animal {
    
    private String corPena;

    
    public Ave(float peso, int idade, int membros, String corPena) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorPena(corPena);
    }
    
    
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
    public void pena() {
        System.out.println("Cor da pena: " +this.getCorPena());
    }
    @Override
    public void locomover() {
        System.out.print("\nVoando, ");
    }
    @Override
    public void alimentar() {
        System.out.print("Comendo frutas, ");
    }
    @Override
    public void emitirSom() {
        System.out.print("Som de ave\n");
    }
    
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}