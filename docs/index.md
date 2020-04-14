# JavaCourse
 >Testing a course with Java

## Introduction

**Profesor**: Ubaldo Acosta [webpage](https://www.udemy.com/user/ubaldoacosta/)  
url: https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master  

## Workspace
 For editing the file, I'm using [grip](https://github.com/joeyespo/grip).  
 the code to start is:

 ```
 cd [project name]
 grip 3000
 ```

For compiling I use the [tutorialpoint](https://www.tutorialspoint.com/compile_java_online.php) online compiler

## Notas
### Plugins

|Name|URL|
| --- | --- |
|Dracula Theme|[link](http://plugins.netbeans.org/plugin/62424/darcula-laf-for-netbeans)|
|Vim interface|[link](http://plugins.netbeans.org/plugin/2802/jvi-vi-vim-editor-clone)|

### Instalación Ubuntu

instalación Java
```
sudo add-apt-repository ppa:linuxuprising/javac
sudo apt-get update
sudo apt-get install oracle-java14-installer
sudo apt-get install oracle-java14-set-default
java --version
javac --version
```
[How to install java14](https://computingforgeeks.com/how-to-install-java-14-on-ubuntu-debian/)


Instalación NetBeans

```
sudo snap install netbeans --clasic
```

### Lecciones

#### Hello World
 - definiciones de dependencias


```java
/*
esto es un comentario
*/

//esto tambien

public static void main(String args[]){
	System.out.println("mensaje");
}
```

`public` modificador de acceso desde otras clases java  
`static` ejecutar un metodo sin necesidad de crear un objeto  
`void` no regresa ninguna informacion  
`main` es el nombre del metodo y sera **el principal**  
`()` argumentos de entradas  
`String` Tipo de entrada de cadena de caracteres  
`args` nombre de la variable  
`[]` es un arreglo  
`System` Es una clase que se conecta con la consola de JAVA  
`out` variable  
`print` o `println` metodo de escritura

#### Codigos

`scanner.nextLine()` Lectura de la sgte linea


#### Notas
Cuando se asigna un valor a una variable se le conoce como valor en código duro o [hard-code](https://es.wikipedia.org/wiki/Hard_code)

el metodo `toString` se llama automáticamente cuando se usa la función 
```java
println(object)
```

En herencia se utiliza el `super` para acceder al atributo o metodo del padre
 - `super` debe estar en la primera linea del contructor.


La página [UMLet](https://www.umlet.com/) permite hacer diagramas de UML

No se debe tener en cuenta de que los literales octales son con solo poner un `0` antes del número, es decir que `012` es un `10` en base decimal

Cuando se hace sobrecarga de constructor y se quiere llamar al constructor vacío, se usa el codigo `this()`

```java
public class Persona(){
  private static int contadorPersonas;
  private int idPersona;
  private String nombre;
  private int edad;
 
  public Persona(){
    this.idPersona = ++contadorPersonas;
    }
 
  public Persona(String nombre, int edad){
    this(); // se esta llamando a Persona();
    this.nombre = nombre;
    this.edad = edad;
    }
  }
```
Nota: `this()` debe ser la primera función que se utliza en el constructor

###### Super

Se usa super cuando se quiere acceder a alguna caractarística de la clase padre

```java
public class Empleado extends Persona{
  private double sueldo;

  public Empleado(String nombre, int edad, double sueldo){
    super(nombre, edad);
    this.sueldo = sueldo;
    }
  }

```

#### argumentos variables variables

el término `varargs`

```java
/** EdadClientes */
public class tienda{
public static void main(String [] args){
	edadClientes(21,24,46,23,21);
}


public static void edadClientes(int ... edades){
	for(int i = 0; i<edades.length; i++)
		System.out.println(edades[i]);

}
}
```

### foreach (for(:))
```java
/** foreach */
public class kills{
public static void main(String[] args){
	total(12,3,1,1);
}


public static void total(int ... kills){
	int total = 0;
	for(int kill : kills){
		total += kill;
	}
	System.out.println(total);

}
}
```
el formato de foreach permite recorrer un array sin necesidad de conocer su tamaño

los `varargs` siempre deben estar al final. El compilador revisara cada argumento para emprezar a contar cuando empieza el `vararg`

```java
/** 
 * Prueba del argumentos variables con multiple entrada
 */
public class Game{
public static void main(String[] args){
	mostrar(true, "vanessa", 1, 2, 3, 4);
}

public static void mostrar(boolean isOK, String name , int ... scores){
	int total=0;
	if(isOK){
		for(int score : scores){
			total += score;
		}
	System.out.println(name + ": " + total);
	}
}
}
```
en el caso 






fin.

