package uec;
public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    public Lutador(String nome, String nacionalidade, int idade, float altura,
    float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    
    public void apresentar() {
        System.out.println("===========================================");
        System.out.println("CHEGOU A HORA!");
        System.out.println("Apresentamos o lutador " +this.getNome() +"!!!");
        System.out.println("Diretamente de " +this.getNacionalidade());
        System.out.println("Com " +this.getIdade() +" anos e " +this.getAltura() +"m");
        System.out.println("Pesando " +this.getPeso() +"kg");
        System.out.println("Ganhou:  " +this.getVitorias());
        System.out.println("Perdeu:  " +this.getDerrotas());
        System.out.println("Empatou: " +this.getEmpates());
        System.out.println("===========================================");
        
    }
    public void status() {
        String v = null, d = null, e = null;
        if (this.getVitorias() == 1) {
            v = " Vitória";
        } else {
            v = " Vitórias";
        } if (this.getDerrotas() == 1) {
            d = " Derrota";
        } else {
            d = " Derrotas";
        } if (this.getEmpates() == 1) {
            e = " Empate";
        } else {
            e = " Empates";
        }
        System.out.println(this.getNome() +" é da categoria: " +this.getCategoria());
        System.out.println(this.getVitorias() +v);
        System.out.println(this.getDerrotas() +d);
        System.out.println(this.getEmpates()  +e);
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}