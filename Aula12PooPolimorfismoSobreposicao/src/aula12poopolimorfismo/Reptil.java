package aula12poopolimorfismo;
public  class Reptil extends Animal {
    
    private String corEscama;

    
    public Reptil(float peso, int idade, int membros, String corEscama) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorEscama(corEscama);
    }
    
    
    public void escama() {
        System.out.println("Cor da escama: " +this.getCorEscama());
    }
    @Override
    public void locomover() {
        System.out.print("\nRastejando, ");
    }
    @Override
    public void alimentar() {
        System.out.print("Comendo vegetais ou outros animais, ");
    }
    @Override
    public void emitirSom() {
        System.out.print("Som de Réptil\n");
    }
    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}