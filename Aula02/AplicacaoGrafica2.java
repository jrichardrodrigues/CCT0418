
package Aula02;

import java.awt.*;
import javax.swing.*;

public class AplicacaoGrafica2 extends JFrame {
    
   private final JPanel buttonPanel;
   private final JButton buttons[ ];
   
   public AplicacaoGrafica2() {
       
      super("Aplicação Gráfica 2");
      
      Container c = getContentPane();
      
      buttonPanel = new JPanel();
      
      buttons = new JButton[5];
      
      buttonPanel.setLayout(new GridLayout(1, buttons.length));
      
      for(int i=0; i<buttons.length;i++) {
          
          buttons[i] = new JButton("Botão " + (i + 1));
          
          buttonPanel.add(buttons[i]);
          
      }
      
      c.add(buttonPanel, BorderLayout.SOUTH);
      
      setSize(425, 150);
      
      show();
      
   }

}