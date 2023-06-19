package aula10pooheranca;

import java.util.Random;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;


    public void cancelarMatricula() {
        if (this.getMatricula() != 0) {
            this.matricula = 0;
        }    
    }
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        Random r = new Random(1);
        this.matricula = r.nextInt(999);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}