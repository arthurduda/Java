package aula11pooheranca;
public class Aula11PooHeranca {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        Professor p1 = new Professor();
        
        a1.setNome("Arthur"); a1.setIdade(22); a1.setSexo("m"); a1.detalhes(); 
        a1.setMatricula(1); a1.setCurso("Informática"); a1.pagarMensalidade();
        
        b1.setNome("Maria"); b1.setIdade(18); b1.setSexo("f"); b1.detalhes();
        b1.setMatricula(2); b1.setCurso("Jornalismo"); b1.setBolsa(25f);
        b1.pagarMensalidade();
        
        t1.setNome("Elizabeth"); t1.setIdade(25); t1.setSexo("f"); t1.detalhes();
        t1.setCurso("Análise e desenvolvimente de sistemas"); t1.praticar();
        
        p1.setNome("Aistein"); p1.setIdade(55); p1.setSexo("m"); p1.detalhes();
        p1.setEspecialidade("Físico"); p1.setSalario(7285f); p1.receberAumento(1115f);
        
        v1.setNome("Juvenal"); v1.setIdade(22); v1.setSexo("m"); v1.detalhes();
    }
}