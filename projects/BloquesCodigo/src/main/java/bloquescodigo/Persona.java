package bloquescodigo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tavo
 */
public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicialización estático 
    static {
        contadorPersonas = 10;
        System.out.println("Ejecución del bloque estatico");
    }
    
    //Bloque no estático
    {
        System.out.println("Ejecución del bloque no estático");
        this.idPersona = ++contadorPersonas;
    }
    
    public Persona(){
        System.out.println("Ejecución del contructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
}
    