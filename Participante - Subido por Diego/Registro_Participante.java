
package quienquieresermillonariofinal;

import java.util.ArrayList;


public abstract class Registro_Participante {
    
    //Persona Clase Padre.. Atributos:
    ArrayList Nombre;
    ArrayList Edad;
    ArrayList Email;
    ArrayList Telefono;
    
    //Insertar Constructor
    public Registro_Participante(ArrayList Nombre, ArrayList Edad, ArrayList Email, ArrayList Telefono) {
        
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Email = Email;
        this.Telefono = Telefono;
    }
    
    //Insertar Getter and Setter

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getEdad() {
        return Edad;
    }

    public void setEdad(ArrayList Edad) {
        this.Edad = Edad;
    }

    public ArrayList getEmail() {
        return Email;
    }

    public void setEmail(ArrayList Email) {
        this.Email = Email;
    }

    public ArrayList getTelefono() {
        return Telefono;
    }

    public void setTelefono(ArrayList Telefono) {
        this.Telefono = Telefono;
    }
    
    
    //Ingresamos los Metodos que utilizaremos
    public abstract void IngresarNombre(String nombre);
    public abstract void IngresarEdad(int edad);
    public abstract void IngresarEmail(String email);
    public abstract void IngresarTelefono(int telefono);
    
    public abstract void EliminarNombre(String nombre);
    public abstract void EliminarEdad(int edad);
    public abstract void EliminarEmail(String email);
    public abstract void EliminarTelefono(int telefono);
    
    public abstract String BuscarNombre(String nombre);
    public abstract int BuscarEdad(int edad);
    public abstract String BuscarEmail(String email);
    public abstract int BuscarTelefono(int telefono);
    
    
}
