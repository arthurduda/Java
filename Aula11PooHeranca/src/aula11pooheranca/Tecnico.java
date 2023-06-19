package aula11pooheranca;
public class Tecnico extends Aluno {
    
    private boolean registroProfissional;


    public void praticar() {
        this.setRegistroProfissional(!this.isRegistroProfissional());
        System.out.println(this.getNome() +" está apto a praticar " +this.getCurso() +"\n");
    }
    public boolean isRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}