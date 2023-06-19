package aula12poopolimorfismo;

import java.text.DecimalFormat;

public abstract class Animal {
    
    protected float peso;
    protected int idade;
    protected int membros;

    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    public void detalhes() {
        DecimalFormat f = new DecimalFormat("0.00");
        System.out.println("\nPeso: " +f.format(this.getPeso()) +"kg"+
        "\nIdade: " +this.getIdade()+
        "\nMembros: " +this.getMembros());
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}