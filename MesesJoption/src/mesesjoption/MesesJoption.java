package mesesjoption;
import javax.swing.JOptionPane;
public class MesesJoption {
    public static void main(String[] args) {
        float anob = 0, ano = 
        Integer.parseInt(JOptionPane.showInputDialog
        (null, "Qual o ano?", "Entrada de Dados", 3));
        String mes[] = {"Janeiro","Feveiro","Março","Abril","Maio","Junho","Julho"
        ,"Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tot2[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (ano % 400 == 0){
            anob++;
        } else if ((ano % 4 == 0) && (ano % 100 != 0)){
            anob++;
        } if (anob == 1){
            JOptionPane.showMessageDialog
            (null, "<html>No ano de " 
            +String.format("%.0f", ano) +" os meses possuem: <hr>"+
            "\n" +mes[0] +":        " +tot2[0] +" dias"+
            "\n" +mes[1] +":         " +tot2[1] +" dias"+
            "\n" +mes[2] +":           " +tot2[2] +" dias"+
            "\n" +mes[3] +":              " +tot2[3] +" dias"+
            "\n" +mes[4] +":              " +tot2[4] +" dias"+
            "\n" +mes[5] +":           " +tot2[5] +" dias"+
            "\n" +mes[6] +":            " +tot2[6] +" dias"+
            "\n" +mes[7] +":         " +tot2[7] +" dias"+
            "\n" +mes[8] +":    " +tot2[8] +" dias"+
            "\n" +mes[9] +":       " +tot2[9] +" dias"+
            "\n" +mes[10] +":   " +tot2[10] +" dias"+
            "\n" +mes[11] +":   " +tot2[11] +" dias"                                                                                                                                                                                                                                                                                               
            ,"Ano Bissexto", 1);                                                                                                     
        } if(anob == 0){                                            
            JOptionPane.showMessageDialog
            (null, "<html>No ano de " 
            +String.format("%.0f", ano) +" os meses possuem: <hr>"+
            "\n" +mes[0] +":        " +tot[0] +" dias"+
            "\n" +mes[1] +":         " +tot[1] +" dias"+
            "\n" +mes[2] +":           " +tot[2] +" dias"+
            "\n" +mes[3] +":              " +tot[3] +" dias"+
            "\n" +mes[4] +":              " +tot[4] +" dias"+
            "\n" +mes[5] +":           " +tot[5] +" dias"+
            "\n" +mes[6] +":            " +tot[6] +" dias"+
            "\n" +mes[7] +":         " +tot[7] +" dias"+
            "\n" +mes[8] +":    " +tot[8] +" dias"+
            "\n" +mes[9] +":       " +tot[9] +" dias"+
            "\n" +mes[10] +":   " +tot[10] +" dias"+
            "\n" +mes[11] +":   " +tot[11] +" dias"                                                                                                                                                                                                                                                                                               
            ,"Ano Abundante", 1);                                                                                                               
        }                
    }   
}