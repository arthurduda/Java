/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao01fatorial;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Funcao01Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        Scanner t = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Qual o número deseja o fatorial?");
        int n = t.nextInt();
        f.setValor(n);
        System.out.print(f.getFormula());
        System.out.println(df.format(f.getFatorial()));
    }
    
}
