
package Aula03;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class AplicacaoGrafica4 extends JFrame implements ActionListener {
    
    private JPanel painel = new JPanel();
    
    private JLabel label = new JLabel("Nome:");
    
    private JButton botao = new JButton("Enviar");
    
    private JTextField texto =  new JTextField();
    
    public AplicacaoGrafica4() {
       
        super();
 
        setSize(350,200);
        setLocation(100,100);
        setLayout(null);
        setTitle("Aplicação Gráfica 4");
       
        label.setBounds(new Rectangle(10,10,50,25));
        botao.setBounds(new Rectangle(70,40,75,25));
    
        botao.addActionListener(this);
        texto.setBounds(new Rectangle(70,10,200,25));
       
        painel.setBounds(new Rectangle(20,20,350,200));
        painel.setLayout(null);
        painel.add(label);
        painel.add(texto);
        painel.add(botao);
       
        Container c = this;
        
        c.add(painel);
       
        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e){
        
        this.setTitle("Botão foi pressionado");
        
        JOptionPane.showMessageDialog(null,"Seu nome é: " + texto.getText());
        
    }
}

