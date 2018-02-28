
package Aula01;

import javax.swing.JOptionPane;

public class Banco {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Corrente c2 = new Corrente();
        Poupanca c3 = new Poupanca();
        
        c2.nome = JOptionPane.showInputDialog("Qual seu nome?");
        c2.numero = "001";
        c2.saldo = 300.0;
        
        String valorSaque = JOptionPane.showInputDialog("Qual o valor do saque?");
        c2.sacar(Integer.parseInt(valorSaque));
        JOptionPane.showConfirmDialog(null, Double.toString(c2.saldo));
        


    }
    
}
