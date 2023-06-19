package projetoyoutube;
public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    
    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equals("m")) {
            this.sexo = "Masculino";
        } else if (sexo.equals("f")) {
            this.sexo = "Feminino";
        }
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
}