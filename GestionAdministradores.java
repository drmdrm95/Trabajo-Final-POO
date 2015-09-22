
package quienquieresermillonariofinal.ADMINISTRADORES;
import java.io.*;

public class GestionAdministradores {
    
   FileInputStream entrada; //Permite un flujo de entrada de bytes.
   FileOutputStream salida; //Permite trabajar con el flujo de salida de bytes.
   File archivo;
    
   public GestionAdministradores(){
   
   
   
   }
   
   
   //Abrir archivo de texto
   public String AbrirPreguntas(File preguntas){ //Recibe un parametro de tipo File.
   
   String contenido = "";
   try{
       
       entrada = new FileInputStream(preguntas); //Recibe el archivo que se va mandar a dicho método
       int ascci;
       while((ascci = entrada.read()) !=-1){  //Lee el flujo de bytes y devuelve -1 cuando llegue al final de flujo.
       
           char caracter = (char)ascci;
           contenido += caracter;  //Se guarda en contenido cada caracter que se recupera del flujo de entrada.
       }
       
   } catch (Exception e){
   
   
   }
   
   return contenido; //Retorna el contenido dentro del TextArea del JFrme Administrador que es desde donde se llama este método
   }
   
   //Guardar archivo de texto
   public String GuardarPreguntas(File preguntas, String contenido){ //archivo donde se guarda el contenido del Text Area y su contenido.
   
       String respuesta = null;
       try{
       
           salida = new FileOutputStream(preguntas); //Recibe el archivo donde se va guardar el contenido.
           byte[] bytesTxt = contenido.getBytes(); //Arreglo de bytes, el contenido lo pasamos a un arreglo de bytes y se designa a los bytes del texto.
           salida.write(bytesTxt); //Se escribe el flujo de bytes con el arreglo de bytes.
           respuesta = "Las preguntas han sido modificadas"; //En caso de que se cumpla todo lo anterior.
       }catch (Exception e){
       
       } 
       return respuesta;
   
   }
           
    
   
           
           
           
           
           
           
           
           
}








