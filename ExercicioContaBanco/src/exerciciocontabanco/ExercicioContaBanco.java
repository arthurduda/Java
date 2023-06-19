package exerciciocontabanco;
public class ExercicioContaBanco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("Arthur", "CP", 1);
        c1.depositar(150);
        c1.sacar(350);
        c1.estadoAtual();
    }
}