
package visualizacao;

import controlador.Tarefa;
import java.awt.Rectangle;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdicionarTarefa extends JFrame implements ActionListener {
    
    private final JPanel painel = new JPanel();
    
    private final  JLabel nomeLb = new JLabel("Nome:");
    private final JTextField nomeTf =  new JTextField();
    
    private final JLabel descricaoLb = new JLabel("Descrição:");
    private final JTextField descricaoTf =  new JTextField();
    
    private final JLabel prioridadeLb = new JLabel("Prioridade:");
    private final JComboBox prioridadeCb =  new JComboBox();
    
    private final JCheckBox statusChb =  new JCheckBox();
    
    private JButton botao = new JButton("Salvar");
    
    public AdicionarTarefa() {
       
        super();
        setSize(350,200);
        setLocation(100,100);
        setLayout(null);
        setTitle("Adicionando Tarefa");
        
        //Retangle(height, width, x, y)
        //https://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html
        
        nomeLb.setBounds(new Rectangle(10,10,80,25));
        nomeTf.setBounds(new Rectangle(80,10,200,25));
        
        descricaoLb.setBounds(new Rectangle(10,40,80,25));
        descricaoTf.setBounds(new Rectangle(80,40,200,25));
        
        prioridadeLb.setBounds(new Rectangle(10,70,80,25));
        prioridadeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opção...", "Normal", "Importante"}));
        prioridadeCb.setBounds(new Rectangle(80,70,200,25));
        
        statusChb.setText("Concluído");
        statusChb.setBounds(new Rectangle(80,100,100,25));
        
        botao.setBounds(new Rectangle(180,100,75,25));
        botao.addActionListener(this);
        
        painel.setBounds(new Rectangle(20,20,350,200));
        
        painel.setLayout(null);
        
        painel.add(nomeLb);
        painel.add(nomeTf);
        
        painel.add(descricaoLb);
        painel.add(descricaoTf);
        
        painel.add(prioridadeLb);
        painel.add(prioridadeCb);
        
        painel.add(statusChb);
        
        painel.add(botao);
        
        Container c = this;
        
        c.add(painel);
        
        setVisible(true);  
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        setTitle("Tarefa adicionada!");
 
        JOptionPane.showMessageDialog(null, "TAREFA ADICIONADA COM SUCESSO! \n" + nomeTf.getText() + "\n" + 
                descricaoTf.getText() + "\n" +
                prioridadeCb.getSelectedIndex() + "\n" +
                statusChb.isSelected());
        

        
        String prioridade;
        
        if (prioridadeCb.getSelectedIndex() == 1){
            prioridade = "Normal";
        } else { prioridade = "Imporatante"; }
        
        Tarefa t = new Tarefa(1, nomeTf.getText(), descricaoTf.getText(), prioridade, statusChb.isSelected());

    }
 
 
}

