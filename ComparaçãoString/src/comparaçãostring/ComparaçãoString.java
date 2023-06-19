package comparaçãostring;
public class ComparaçãoString {
    public static void main(String[] args) {
        String nome1 = "Arthur";
        String nome2 = "Arthur";
        String nome3 = new String("Arthur");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}