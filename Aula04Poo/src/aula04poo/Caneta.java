package aula04poo;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;    
    private boolean tampada;
    
    public Caneta(String m, String c, float p){ //construtor
        this.setModelo(m);
        this.setCor(c);        
        this.setPonta(p);
        this.tampar();        
    }
    
    public boolean getStatusTampa(){
        return this.tampada;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        String tp = "";
        if (this.getStatusTampa() == true){
            tp = "Sim";
        } else {
            tp = "Não";
        }
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " +getModelo());
        System.out.println("Ponta: " +getPonta() +"mm");
        System.out.println("Cor: " +getCor());
        System.out.println("Tampada: " +tp);
    }
}