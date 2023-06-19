package aula11pooheranca;
public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;

   
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }
    public void detalhes(){
        System.out.println
        ("Nome: " +this.getNome()+
        "\nIdade: " +this.getIdade()+
        "\nSexo: " +this.getSexo() +"\n");
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
}