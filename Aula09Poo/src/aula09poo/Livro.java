package aula09poo;
public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    public void detalhes() {
        String ab = null, sexo = null;
        if (this.isAberto()) {
            ab = " aberto";
        } else {
            ab = " fechado";
        }
        if (this.leitor.getSexo() == "M") {
            sexo = "Masculino";
        } else if (this.leitor.getSexo() == "F") {
            sexo = "Feminino";
        }
        System.out.println("Título: " +this.getTitulo()+
        "\nAutor: " +this.getAutor()+
        "\nTotal de páginas: " +this.getTotPaginas()+
        "\nPágina atual: " +this.getPagAtual()+
        "\nAberto ou fechado:" +ab+
        "\nLeitor: " +this.leitor.getNome()+
        "\nIdade do leitor: " +this.leitor.getIdade()+
        "\nSexo do leitor: " +sexo);
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

     
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro aberto\n");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechado\n");
    }

    @Override
    public void folhear(int pag) {
        if (this.isAberto()) {
            if (pag <= this.getTotPaginas()) {
                this.setPagAtual(pag);
            }
        } else {
            System.out.println("Livro fechado\n");
        }
    }

    @Override
    public void avançarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() != this.getTotPaginas())
                this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Livro fechado\n");
        }    
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() != 0)
                this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Livro fechado\n");
        }    
    }
}