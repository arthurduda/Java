package vetor01;
public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {0,1,2,3,4,5};
        System.out.println("Total de casas de N: " +n.length);    
        for (int c=0;c<n.length;c++){
            System.out.println("Na posição " +c+ " Temos o valor: " +n[c]);
        }
    }   
}