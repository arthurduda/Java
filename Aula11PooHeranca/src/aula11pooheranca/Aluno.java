package aula11pooheranca;

import java.util.Random;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    
    
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de " +this.getNome()
        +"\nMatrícula nº: " +this.getMatricula() +"\nCurso: " +this.getCurso() +"\n");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        Random m = new Random(matricula);
        this.matricula = m.nextInt(9999);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}