
package Aula01;

public class Conta {
    
    String numero;
    double saldo;
    String nome;
    
    public Conta(String pNumero, double pSaldo) {
        this.numero = pNumero;
        this.saldo = pSaldo;
    }
    
    public Conta() {} 
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void depositar(double pValor){
        
        this.saldo = this.saldo + pValor;
        
    }
    
    public String sacar(double pValor){
        
        if(this.saldo >= pValor){
            
            this.saldo -= pValor;
            
            return "Saque efetuado com sucesso!";
            
        } else {
            
            return "Saldo insuficiente";
            
        }
    }
    
}
