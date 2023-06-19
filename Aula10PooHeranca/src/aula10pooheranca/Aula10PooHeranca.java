package aula10pooheranca;
public class Aula10PooHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("m");
        p4.setSexo("f");
        p2.setIdade(18);
        
        p1.detalhes();
        p2.detalhes();
        p3.detalhes();
        p4.detalhes();
        
        p2.setCurso("Informática");
        p2.setMatricula();
        p4.setSetor("Estoque");
    }
}