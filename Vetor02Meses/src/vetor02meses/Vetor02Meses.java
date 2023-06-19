package vetor02meses;
import java.util.Scanner;
public class Vetor02Meses {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
        "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tot2[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Em que ano estamos?: ");
        float ano = tec.nextFloat();
        System.out.println("No ano de "+String.format("%.0f", ano)+": ");
        if (ano%400 == 0){                
            for (int i=0; i<mes.length; ++i){
            System.out.println(mes[i]+ " possui " +tot2[i]+ " dias.");
            }        
        } else if((ano%4 == 0) && (ano%100 != 0)) {
            for (int i=0; i<mes.length; ++i){
            System.out.println(mes[i]+ " possui " +tot2[i]+ " dias.");                
            }    
        } else {
            for (int i=0; i<mes.length; ++i) {
                System.out.println(mes[i]+ " possui " +tot[i]+ " dias.");
            }
        }    
    }   
}