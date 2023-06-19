package exercicionumerosoptionpane;
import javax.swing.JOptionPane;
public class ExercicioNumerosOptionPane {
    public static void main(String[] args) {               
        int n, par=0, impar=0, a100=0;
        float c=0, s=0, m=0;
        do{        
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "(0) Interrompe\nDigite um Número: ", "Entrada de Dados", 3));
            if (n!=0){
                c++;
                s += n;
                m = s/c;
            }
            if ((n%2==0) && (n!=0)) {
                par++;
            }else if (n!=0){
                impar++;
            }
            if (n>100){
                a100++;
            }                       
        } while (n!=0);    
    JOptionPane.showMessageDialog(null, "<html>Resultado:<hr></html>"+            
    "\nTotal de Valores: " +String.format("%.0f", c)+
    "\n\nSoma dos Valores: " +String.format("%.0f", s)+
    "\n\nMédia dos Valores: " +String.format("%.1f", m)+
    "\n\nTotal de Pares: " +par+
    "\n\nTotal de Ímpares: " +impar+
    "\n\nAcima de 100: " +a100                                                                                                
    ,"Resultado Final", 1);                    
    }   
}