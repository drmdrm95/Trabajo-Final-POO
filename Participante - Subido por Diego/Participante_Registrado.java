

package quienquieresermillonariofinal;

import java.util.ArrayList;


public class Participante_Registrado extends Registro_Participante {
    
    //Extendemos a la Clase Padre Persona e insertamos el constructor
    
    public Participante_Registrado(ArrayList Nombre, ArrayList Edad, ArrayList Email, ArrayList Telefono) {
        
        super(Nombre, Edad, Email, Telefono);
        
    }
    
    @Override
    public void IngresarNombre(String nombre) {
        
        //Add Agrega elementos
        super.Nombre.add(nombre);
        
    }

    @Override
    public void IngresarEdad(int edad) {
        
        
        super.Edad.add(edad);
        
    }
    
    @Override
    public void IngresarEmail(String email) {
        
        super.Email.add(email);
        
    }

    @Override
    public void IngresarTelefono(int telefono) {
        
        super.Telefono.add(telefono);
        
    }

    @Override
    public void EliminarNombre(String nombre) {
        
        //Remove Elimina elementos
        //IndexOf Obtiene la ubicación del elemento y con Remove los elimina
        super.Nombre.remove(super.Nombre.indexOf(nombre));
                
    }

    @Override
    public void EliminarEdad(int edad) {
        
        super.Edad.remove(super.Edad.indexOf(edad));
        
    }
    
    @Override
    public void EliminarEmail(String email) {
        
        super.Email.remove(super.Email.indexOf(email));
        
    }

    @Override
    public void EliminarTelefono(int telefono) {
         
        super.Telefono.remove(super.Telefono.indexOf(telefono));
        
    }

    @Override
    public String BuscarNombre(String nombre) {
        
        //Se declara una variable
        String BuscarNombre = "";
        //Si existe el participante es true
        if(super.Nombre.contains(nombre) == true){
            //Busca el Nombre, lo identifica y lo convierte en texto
            BuscarNombre = super.Nombre.get(super.Nombre.indexOf(nombre)).toString();
            
        }else{
            //En caso de que no exista
            BuscarNombre = "No existe el tal participante";
        
        }
        
        return BuscarNombre;
    }

    @Override
    public int BuscarEdad(int edad) {
         
        int BuscarEdad = 0;
        if (super.Edad.contains(edad) == true){
        
            BuscarEdad = Integer.parseInt(super.Edad.get(super.Edad.indexOf(edad)).toString());
            
        }else{
        
            BuscarEdad = 0;
            
        }
        return BuscarEdad;
        
    }

    @Override
    public String BuscarEmail(String email) {
        
        //Se declara una variable
        String BuscarEmail = "";
        //Si existe el participante es true
        if(super.Email.contains(email) == true){
            //Busca el Nombre, lo identifica y lo convierte en texto
            BuscarEmail = super.Email.get(super.Email.indexOf(email)).toString();
            
        }else{
            //En caso de que no exista
            BuscarEmail = "Email no encontrado";
        
        }
        
        return BuscarEmail;
        
    }

    @Override
    public int BuscarTelefono(int telefono) {
        
        int BuscarTelefono = 0;
        if (super.Telefono.contains(telefono) == true){
        
            BuscarTelefono = Integer.parseInt(super.Telefono.get(super.Telefono.indexOf(telefono)).toString());
            
        }else{
        
            BuscarTelefono = 0;
            
        }
        return BuscarTelefono;
        
    }
   
    
}
