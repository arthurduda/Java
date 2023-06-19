package tiposprimitivos;
import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.printf("Digite a nota de %s: ", nome);
        float nota = (float) teclado.nextFloat();        
        System.out.printf("A nota de %s é: %.2f \n", nome, nota);
        
        /*System.out.print("Qual a idade?: ");
        int idade = teclado.nextInt();
        String valor = Integer.toString(idade);        
        System.out.println("A idade é: " + valor);*/        
        
        /*String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println("A idade é: " +idade);*/
            
        /*String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f \n", idade);*/
        
        
        
        
    }       
}