package repeticao01;

import java.util.Scanner;

public class Repeticao01 {
    public static void main(String[] args) {
        /*int cc = 0;
        do {
            System.out.println("Cambalhota");
            cc++;
        } while (cc<4);*/
        
        int n, t = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            t += n;
            System.out.print("Quer continuar? [s/n]: ");
            resp = teclado.next();
        } while (resp.equals("s"));        
        System.out.println("A soma dos números é igual a: "+t);
    }    
}