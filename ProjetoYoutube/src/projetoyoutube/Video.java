package projetoyoutube;

import javax.swing.JOptionPane;

public class Video implements AcoesVideo {
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    
    public void detalhes() {
        JOptionPane.showMessageDialog(null, 
        toString()        
        , this.getTitulo(), 1);
    }
    @Override
    public void play() {
        this.setReproduzindo(true);
        this.setViews(this.getViews() + 1);
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        String r;
        if (this.isReproduzindo()) {
            r = "Sim";
        } else {
            r = "Não";
        }
        return  "\nTítulo: " + titulo + 
                "\nAvaliação: " + avaliacao + 
                "\nViews: " + views + 
                "\nCurtidas: " + curtidas + 
                "\nReproduzindo: " + r;
    }
}