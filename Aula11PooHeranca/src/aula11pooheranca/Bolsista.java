package aula11pooheranca;

import java.text.DecimalFormat;

public class Bolsista extends Aluno {
    
    private float bolsa;

    DecimalFormat df = new DecimalFormat("#,##");
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de " +this.getNome() 
        +"\nDesconto de bolsa: " +df.format(this.getBolsa()) +"%"
        +"\nMatrícula nº: " +this.getMatricula() 
        +"\nCurso: " +this.getCurso() +"\n");
    }
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}