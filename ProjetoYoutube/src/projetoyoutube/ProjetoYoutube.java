package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        g[0] = new Gafanhoto("Jubileu", 22, "m", "juba");
        g[1] = new Gafanhoto("Creuza", 18, "f", "creuzita");
        
        Visualizacao vs[] = new Visualizacao[5];
        vs[0] = new Visualizacao(g[0], v[2]);
        vs[0].avaliar();
        vs[1] = new Visualizacao(g[0], v[1]);
        vs[1].avaliar(87f);
        /*g[0].detalhes();
        g[1].detalhes();
        v[0].play();
        v[0].detalhes();*/
        vs[0].detalhes();
        vs[1].detalhes();
    }
}