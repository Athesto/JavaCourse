# JavaCourse
 >Testing a course with Java

## Editing
 For editing the file, I'm using [grip](https://github.com/joeyespo/grip).  
 the code to start is:

 ```
 cd [project name]
 grip 3000
 ```

## Notas
### Plugins

|Name|URL|
| --- | --- |
|Dracula Theme|[link](http://plugins.netbeans.org/plugin/62424/darcula-laf-for-netbeans)|
|Vim interface|[link](http://plugins.netbeans.org/plugin/2802/jvi-vi-vim-editor-clone)|

### Instalación Ubuntu

instalación Java
```
sudo add-apt-repository ppa:linuxuprising javac
sudo apt-get update
sudo apt-get install oracle-java13-installer
sudo apt-get install oracle-java13-set-default
java --version
javac --version
```
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
`print o println` metodo
 

fin.

