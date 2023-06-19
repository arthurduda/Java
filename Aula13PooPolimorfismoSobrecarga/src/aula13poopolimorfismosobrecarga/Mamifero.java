package aula13poopolimorfismosobrecarga;
public class Mamifero extends Animal {
    
    protected String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorPelo(corPelo);
    }

    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}