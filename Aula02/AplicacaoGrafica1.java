package Aula02;

import javax.swing.*;

public class AplicacaoGrafica1 extends JFrame {
    
    public AplicacaoGrafica1() {
       
        super("Aplicação Gráfica 1");
    
        JFrame frame = new JFrame("Aplicação Gráfica 1");
    
        JButton botao = new JButton("Eu sou um botão em Swing");
    
        JLabel texto = new JLabel("Número de cliques: 0");
    
        JPanel painel = new JPanel();
    
        painel.add(botao);
    
        painel.add(texto);
    
        frame.getContentPane().add(painel);
    
        frame.pack();
    
        frame.show();
    }
    
}
