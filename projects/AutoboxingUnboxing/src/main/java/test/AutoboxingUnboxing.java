package test;

public class AutoboxingUnboxing{
	public static void main(String args[]){
		//Autoboxing (envolvemos tipos primitivos en clase wrappers)
		Integer enteroObj = 10;
		System.out.println("enteroObj: " + enteroObj);

		//Unboxing
		int entero = enteroObj;
		System.out.println("entero: " + entero);
                
		//FloatObj
		Float floatObj = 15.4F;
		System.out.println("entero: " + floatObj);
		float flotante = floatObj;
		System.out.println("float = " + flotante);

		System.out.println("entero del flotante: " + floatObj.intValue());
		
        
                

	}
}

