package testefuncao02;
import java.util.Scanner;
public class TesteFuncao02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quer contar até quanto?: ");
        int f = tec.nextInt();
        System.out.println(Operacoes.contador(0,f));
    }    
}