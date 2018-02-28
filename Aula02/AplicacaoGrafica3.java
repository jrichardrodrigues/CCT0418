package Aula02;

import java.awt.*;
import javax.swing.*;

public class AplicacaoGrafica3 extends JFrame {
    
    private final Button butOK;
    private final  TextField campo1;
    private final  TextField campo2;
    private final  TextField campoR;
    private final  Label texto1;
    private final  Label texto2;
    private final  Label textoR;
    private final  Panel p1 = new Panel();
    private final  Panel p2 = new Panel();
  
    public AplicacaoGrafica3( ){
      
        super("Aplicação gráfica 3");
    
        // CRIANDO COMPONENTES
        texto1  = new Label("Nome:");   
        campo1  = new TextField(15);
        texto2  = new Label("Telefone:");     
        campo2  = new TextField(15);
        butOK   = new Button("OK");
        textoR  = new Label("Texto:");    
        campoR  = new TextField(20);
    
        // DEFINIÇÃO DE LAYOUT BÁSICO
        setLayout(new GridLayout(2,1));
    
        // DEFINIÇÃO DE LAYOUT DE PANELS
        p1.setLayout(new GridLayout(2,2));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
    
        // ADICIONA COMPONENTE AO PANEL
        p1.add(texto1); p1.add(campo1);
        p1.add(texto2); p1.add(campo2);
        p2.add(butOK);
        p2.add(textoR); p2.add(campoR); 
    
        // ADICIONA PANEL AO CONTAINER BÁSICO
        add(p1); add(p2);
    
        // DEFINIÇÃO DO TAMANHO DA JANELA
        setSize(425, 150);
        
        show();
    
    }
  
}