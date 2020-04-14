package test;

public class EjemploVarArgs {

    public static void main(String args[]) {
        imprimirNumeros(12, 14, 5, 15, 16);
        variosParametros("Juan", true, 13, 4, 1);
    }

    private static void variosParametros(String nombre, boolean bandera, int... numeros) {
        System.out.println("nombre: "+ nombre);
        System.out.println("bandera: "+ bandera);
        for (int i = 0; i < numeros.length; i++) {
           System.out.println("elemento: "+ numeros[i]);
        }
    }

    private static void imprimirNumeros(int... numeros) {
        //Recorrido de la cadena
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("Elemento[" + i + "]: " + elemento);
        }
    }
}
