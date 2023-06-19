package aula12poopolimorfismo;
public class Aula12PooPolimorfismo {
    public static void main(String[] args) {
        Mamifero m   = new Mamifero (85.30f, 2, 4, "Caramelo");
        Canguru c    = new Canguru(55.57f, 3, 4, "Caramelo");
        Cachorro ca  = new Cachorro(23.7f, 5, 4, "Preto");
        Reptil r     = new Reptil(35.75f, 3, 4, "Verde");
        Cobra co     = new Cobra(9.35f, 3, 0, "Coral");
        Tartaruga t  = new Tartaruga(37, 56, 4, "Cinza");
        Peixe p      = new Peixe (0.35f, 1, 0, "Azul");
        Goldfish g   = new Goldfish(0.250f, 1, 0, "Dourado" );
        Ave a        = new Ave(0.89f, 2, 2, "Amarelo");
        Arara ar     = new Arara(1.23f, 4, 2, "Azul");
        
        m.detalhes(); m.pelo(); m.locomover(); m.alimentar(); m.emitirSom();
        c.detalhes(); c.pelo(); c.locomover(); c.alimentar(); c.emitirSom(); c.usarBolsa();
        ca.detalhes(); ca.pelo(); ca.locomover(); ca.alimentar(); ca.emitirSom(); ca.enterrarOsso(); ca.abanarRabo();
        r.detalhes(); r.escama(); r.locomover(); r.alimentar(); r.emitirSom();
        co.detalhes(); co.escama(); co.locomover(); co.alimentar(); co.emitirSom();
        t.detalhes(); t.escama(); t.locomover(); t.alimentar(); t.emitirSom();
        p.detalhes(); p.escama(); p.locomover(); p.alimentar(); p.emitirSom(); p.soltarBolha();
        g.detalhes(); g.escama(); g.locomover(); g.alimentar(); g.emitirSom(); g.soltarBolha();
        a.detalhes(); a.pena(); a.locomover(); a.alimentar(); a.emitirSom(); a.fazerNinho();
        ar.detalhes(); ar.pena(); ar.locomover(); ar.alimentar(); ar.emitirSom(); ar.fazerNinho();
    }
}