
package quienquieresermillonariofinal.GENERAL;

import javax.swing.JOptionPane;


public class ErrorSeleccione {
    
    public static void casoSeleccioneUnaOpcion()        //Método que se invoca desde el botón "Jugar" del JFrame Form "Participante" al arrojar un error.
    {
        JOptionPane.showMessageDialog(null, "Tiene que seleccionar una de las opciones",
                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.ERROR_MESSAGE);
    }
    
}
