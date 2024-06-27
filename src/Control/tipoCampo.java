
package Control;

import java.awt.event.KeyEvent;

public class tipoCampo {

    public void soloLetras(KeyEvent e){
        char validar=e.getKeyChar();
        if(Character.isDigit(validar)){
            e.consume();
        }
    }
    
    public void soloNumeros(KeyEvent e){
        char validar=e.getKeyChar();
        if(Character.isLetter(validar)){
            e.consume();
        }
    }
}
