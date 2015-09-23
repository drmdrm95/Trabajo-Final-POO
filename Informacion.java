
package quienquieresermillonariofinal.GENERAL;

import javax.swing.JOptionPane;


public class Informacion {
    
     public static void casoInformacion() //Método que muestra en una ventana emergente los premios correspondientes a cada pregunta, y se ejecuta desde la opción #2 "Información", luego de presionar el botón "Jugar" 
    {
        JOptionPane.showMessageDialog(null, "TABLA DE PREMIOS:\n" +
                
                "1a  Pregunta  $100,000      \n" +
                "2a  Pregunta  $200,000      \n" +
                "3a  Pregunta  $500,000      \n" +
                "4a  Pregunta  $1,000,000    \n" +
                "5a  Pregunta  $2,000,000    \n Queda en Seguridad \n" +
                "6a  Pregunta  $5,000,000    \n" +
                "7a  Pregunta  $10,000,000   \n" +
                "8a  Pregunta  $15,000,000   \n" +
                "9a  Pregunta  $20,000,000   \n" +
                "10a Pregunta  $30,000,000   \n Queda en Seguridad \n" +
                "11a Pregunta  $100,000,000  \n" +
                "12a Pregunta  $150,000,000  \n" +
                "13a Pregunta  $200,000,000  \n" +
                "14a Pregunta  $250,000,000  \n" +
                "15a Pregunta  $500,000,000  \n",
                "¿QUIÉN QUIERE SER MILLONARIO?", JOptionPane.QUESTION_MESSAGE);
    }
    
}
