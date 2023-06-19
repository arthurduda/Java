package programaidadecondicionalcomposta;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class ProgramaIdadeCondicionalComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar atual = GregorianCalendar.getInstance();
        System.out.print("Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int idade = (atual.get(Calendar.YEAR) - nasc);
        System.out.print(idade+" Anos.");
        if (idade >= 18){
            System.out.println(" Maior de Idade");
        } else {
            System.out.println(" Menor de Idade");
        }                
    }            
}