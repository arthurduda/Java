package projetoyoutube;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totalAssitido;

    
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotalAssitido(0);
    }


    public void detalhes() {
        JOptionPane.showMessageDialog(null,
        toString()
        , "Detalhes", 1);
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssitido() {
        return totalAssitido;
    }

    public void setTotalAssitido(int totalAssitido) {
        this.totalAssitido = totalAssitido;
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("0.00");
        return  "\nNome: " + nome + 
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nExperiência: " + f.format(experiencia) +
                "\nlogin: " + login + 
                "\nTotal assitido: " + totalAssitido;
    }
}