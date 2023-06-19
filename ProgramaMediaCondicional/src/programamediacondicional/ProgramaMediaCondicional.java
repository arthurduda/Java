package programamediacondicional;
import java.util.Scanner;
public class ProgramaMediaCondicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a média de aprovação?: ");
        int m0 = teclado.nextInt();
        System.out.print("Primeira Nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        float m = ((n1 + n2)/2);
        System.out.printf("Sua média foi: %.1f \n", m);
        if (m>=m0){
            System.out.println("Parabéns!");
        }
        
    }   
}