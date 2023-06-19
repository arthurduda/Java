package aula11pooheranca;

import java.text.NumberFormat;

public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;


    public void receberAumento(float a) {
        System.out.println("Professor: " +this.getNome()+
        "\nRecebeu aumento de "+NumberFormat.getCurrencyInstance().format(a)+
        "\nSalário original   " +NumberFormat.getCurrencyInstance().format(this.getSalario()));
        this.setSalario(this.getSalario() + a);
        System.out.println("Salário atualizado " +NumberFormat.getCurrencyInstance().format(this.getSalario()) +"\n");
    }
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}