package test;
import enumeraciones.*;



public class EjemploEnum {

    public static void main(String args[]) {
        System.out.println("Día 1: " + Dias.LUNES);
        
        System.out.println("Continente no4: " + Continentes.AMERICA);
        
        System.out.println("Cantidad de paises: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no1: " + Continentes.AFRICA);
        
        System.out.println("Cantidad de paises: " + Continentes.AFRICA.getPaises());
        
        
        indicaDia(Dias.DOMINGO);
        
        
        
    }
    
    private static void indicaDia(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Día 1");
                break;
            case DOMINGO:
                System.out.println("Día 1");
                break;
                
        }
        
    }
    
    

}
