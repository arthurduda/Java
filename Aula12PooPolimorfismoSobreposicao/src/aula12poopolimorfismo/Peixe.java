package aula12poopolimorfismo;
public class Peixe extends Animal {
    
    private String corEscama;

    
    public Peixe(float peso, int idade, int membros, String corEscama) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setCorEscama(corEscama);
    }
    
    
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    public void escama() {
        System.out.println("Cor da escama: " +this.getCorEscama());
    }
    @Override
    public void locomover() {
        System.out.print("\nNadando, ");
    }
    @Override
    public void alimentar() {
        System.out.print("Comendo substâncias, ");
    }
    @Override
    public void emitirSom() {
        System.out.print("Peixe não emite som\n");
    }
    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
