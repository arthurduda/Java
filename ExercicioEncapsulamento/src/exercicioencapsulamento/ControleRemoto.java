package exercicioencapsulamento;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    
    public ControleRemoto(){
        this.setVolume(0);
        this.setLigado(false);
        this.setTocando(false);
    }

    
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(0);
    }
    @Override
    public void abrirMenu() {
        String l = null ,t = null;      
        if (this.getLigado()){
            l = "Ligado";
        } else {
            l = "Desligado";
        }
        if (this.getTocando()){
            t = "Play";            
        } else {
            t = "Pause";
        }
        System.out.println("====== MENU ======");
        System.out.println("Ligado?: " +l);
        System.out.println("Tocando?: " +t);
        if (this.getVolume() == 0){
            System.out.print("Volume: 0");
        } else {
            System.out.print("Volume: ");
        }
        for (int i = 0; i < this.getVolume(); i += 10){
            if (this.getLigado()){
                System.out.print("|");
            }    
        }
        System.out.println("");
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 10);
            } else {
                System.out.println("Volume máximo");
            }
        } else {
            System.out.println("Dispositivo desligado");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 10);
            } else {
                System.out.println("Mudo");
            }
        } else {
            System.out.println("Dispositivo desligado");
        }
    }
    @Override
    public void mudo() {
        if (this.getLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(0);
                System.out.println("Mudo");
            }
        } else {
            System.out.println("Dispositivo desligado");
        }
    }
    @Override
    public void mudoOff() {
        if (this.getLigado()) {
            if (this.getVolume() == 0) {
                this.setVolume(50);
            }
        } else {
            System.out.println("Dispositivo desligado");
        }
    }
    @Override
    public void play() {
        if (this.getLigado()) {
            if (!this.getTocando()) {
                this.setTocando(true);
                System.out.println("Play");
            }
        } else {
            System.out.println("Dispositivo desligado");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado()) {
            if (this.getTocando()) {
                this.setTocando(false);
                System.out.println("Pause");
            }
        } else {
            System.out.println("Dispositivo desligado");
        }
    }
}