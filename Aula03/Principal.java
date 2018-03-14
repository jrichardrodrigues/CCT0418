package Aula03;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Principal {
    
    public static void main(String args[]){
 
        AplicacaoGrafica4 app = new AplicacaoGrafica4();


        app.addWindowListener(
             new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e){               
                    System.exit( 0 ); 
                }  
            }  
        );
    }
    
}
