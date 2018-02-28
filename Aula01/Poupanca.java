
package Aula01;

public class Poupanca extends Conta {
    
    public Poupanca(String pNumero, double pSaldo){
        super(pNumero, pSaldo);
    }
    public Poupanca(){}
    
    public String sacar(double pvalor){
        System.out.println("Saque na conta poupança");
        System.out.println("Rendimento do mês suspenso");
        return super.sacar(pvalor);
    }
    public String render(){
        return "Rendendo na conta poupança";
    }
}
