
package Aula01;

public class Corrente extends Conta {
    
    public Corrente(String pNumero, double pSaldo){
        super(pNumero, pSaldo);
    }
    
    public Corrente(){}
    
    public String sacar(double pValor){
        
        System.out.println("Saque na conta corrente");
        
        return super.sacar(pValor);
        
    }
    
    
}
