package exerciciocontabanco;

import java.text.NumberFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }


    public void estadoAtual(){
        String st = null, tp = null;
        if (this.getStatus() == true){
            st = "Aberta";
        } else {
            st = "Fechada";
        }
        if (this.getTipo() == "CC"){
            tp = "Conta Corrente";
        } else if (this.getTipo() == "CP"){
            tp = "Conta Poupança";
        }
        JOptionPane.showMessageDialog(null,
        "======================"+
        "\nConta: " +this.getNumConta()+
        "\nTipo: " +tp+
        "\nDono(a): " +this.getDono()+
        "\nSaldo: " +NumberFormat.getCurrencyInstance().format(this.getSaldo())+
        "\nStatus: " +st+
        "\n======================"        
        ,"Status", 1);  
    }
    public void abrirConta(String dono, String tipo, int numConta){
        this.setNumConta(numConta);
        this.setStatus(true);
        this.setDono(dono);
        this.setTipo(tipo);        
        if (tipo == "CC"){
            this.setSaldo(50);
            JOptionPane.showMessageDialog(null, 
            "Conta aberta no nome de " +this.getDono()+
            "\nSaldo de abertura: " +NumberFormat.getCurrencyInstance().format(this.getSaldo())
            , "Conta Corrente", 1);
        } else if (tipo == "CP"){
            this.setSaldo(150);
            JOptionPane.showMessageDialog(null, 
            "Conta aberta no nome de " +this.getDono()+
            "\nSaldo de abertura: " +NumberFormat.getCurrencyInstance().format(this.getSaldo())
            , "Conta Poupança", 1);
        }
    }
    public void fecharConta(){
        if (this.getStatus()){
            if (this.getSaldo() > 0){
                JOptionPane.showMessageDialog(null,
                "Conta possui saldo de " +NumberFormat.getCurrencyInstance().format(this.getSaldo())+
                "\nEfetue o saque!"
                , "Erro", 2);
            } else if (this.getSaldo() < 0){
                JOptionPane.showMessageDialog(null, 
                "Conta possui débito de " +NumberFormat.getCurrencyInstance().format(this.getSaldo())+
                "\nEfetue o pagamento!"
                , "Erro", 2);
            
            } else {    
                this.setStatus(false);
                JOptionPane.showMessageDialog(null, 
                "Conta de " +this.getDono() +" fechada!"
                , "Fechamento de conta", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta já se encontra fechada!"
            , "Erro", 2);
        }    
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            JOptionPane.showMessageDialog(null,
            "Depósito efetuado na conta de " +this.getDono()+
            "\nSaldo Atual: " +NumberFormat.getCurrencyInstance().format(this.getSaldo())
            , "Depósito", 1);
        } else {
            JOptionPane.showMessageDialog(null,
            "Conta Fechada!", "Erro", 2);
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                JOptionPane.showMessageDialog(null,
                "Saque efetuado na conta de " +this.getDono()+
                "\nSaldo Atual: " +NumberFormat.getCurrencyInstance().format(this.getSaldo())
                , "Saque", 1);
            } else {
                JOptionPane.showMessageDialog(null,
                "Saldo Insuficiente!", "Erro", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null,
            "Conta Fechada!", "Erro", 2);
        }
    }
    public void pagarMensal(){
        int m = 0;
        if (this.getTipo() == "CC"){
            m = 12;
        } else if (this.getTipo() == "CP"){
            m = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - m);
            JOptionPane.showMessageDialog(null,
            "Pagamento mensal efetuado na conta de " +this.getDono()+
            "\nSaldo Atual: " +NumberFormat.getCurrencyInstance().format(this.getSaldo())
            , "Mensaliadade", 1);
        } else {
            JOptionPane.showMessageDialog(null,
            "Conta Fechada!", "Erro", 2);
        }
    }
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        Random n = new Random(numConta);
        this.numConta = n.nextInt(99999);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }            
}