package Aula02;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Principal {
    
    public static void main(String args[]){
 
        AplicacaoGrafica1 app = new AplicacaoGrafica1();
        //AplicacaoGrafica2 app = new AplicacaoGrafica2();
        //AplicacaoGrafica3 app = new AplicacaoGrafica3();

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
