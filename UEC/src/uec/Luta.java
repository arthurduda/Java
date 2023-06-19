package uec;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;
  
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            System.out.println("Luta Aprovada");
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            System.out.println("Luta Inválida");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("============ RESULTADO DA LUTA ============");
            Random r = new Random();
            int vencedor = r.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() +" Ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:    
                    System.out.println(this.desafiante.getNome() +" Ganhou!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("===========================================");
            this.desafiado.status();
            this.desafiante.status();
        } else {
            System.out.println("Luta Inválida");
        }
    }
    
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}