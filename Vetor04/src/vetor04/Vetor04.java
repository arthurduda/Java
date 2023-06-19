package vetor04;
import java.util.Arrays;
public class Vetor04 {
    public static void main(String[] args) {
        int v[] = {0, 6, 3, 1, 4, 5, 9};
        for (int i: v){
            System.out.print(i +" ");
        }
        int p = Arrays.binarySearch(v, 1);
        System.out.println("\nEncontrei 1 na posição: " +p);
    }   
}