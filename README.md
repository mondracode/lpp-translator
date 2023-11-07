# LPP to Go Translator

Este proyecto consiste en un traductor que convierte programas escritos en el lenguaje de programación LPP (Lenguaje de Programación para Principiantes) en programas en el lenguaje de programación Go. La traducción se realiza utilizando ANTLR, una herramienta de generación de analizadores léxicos y sintácticos.

Este proyecto se realiza en el curso lenguajes de programación de la Universidad Nacional de Colombia.

<!-- ## Instalación y Requisitos

Asegúrate de tener instalado ANTLR y Java en tu sistema antes de utilizar este traductor. Puedes seguir las instrucciones de instalación de ANTLR en [el sitio oficial de ANTLR](https://www.antlr.org/). -->

## Uso

1. Clona el repositorio de este proyecto:

   ```bash
   git clone https://github.com/tuusuario/tuproyecto.git
   ```

2. En el directorio del proyecto, utiliza ANTLR para generar el analizador léxico y sintáctico a partir de la gramática LPP:

   ```bash
   antlr4 lpp.g4
   ```

3. Compila el analizador generado:

   ```bash
   javac *.java
   ```

4. Ejecuta el traductor proporcionando un archivo de código fuente LPP como entrada:

   ```bash
   java org.antlr.v4.gui.TestRig lpp prog_main -tree -tokens entrada.lpp
   ```

   Donde `entrada.lpp` es el archivo LPP que deseas traducir.

El traductor generará el código equivalente en Go en la salida estándar.

## Ejemplo

Supongamos que tienes un archivo `ejemplo.lpp` con el siguiente contenido:

```lpp
registro estudiante
	cadena [10] nombre, segundo_nombre
	cadena [10] apellido
	entero edad
	caracter tipo_sangre
	enteRo matricula
	real promedio
	arreglo[2] de arreglo[3] de cadena[10] arreglo_cadenas
fin registro


// Es posible declarar más de una variable en la misma línea
entero my_integer, variableIwillNOTUse
real the_real_ONE
Booleano boolean
Caracter char
cadena[10] string
Estudiante student
entero n1, n2, numero, resultado, i, acumulador

entero resultado
funcion exponenciacion(entero base,entero exponente): entero
	inicio
		retorne base^exponente
	fin

procedimiento suma(entero n1,entero n2)
	entero resultado
	inicio
		resultado<-n1+n2
		escriba ("El resultado de la suma es: "),(resultado)
	fin

Inicio

// Las asignaciones no se realizan con =

my_integer <- 2 //para declarar números positivos no se antepone el signo +
the_REAL_ONE <- -4.5682 // para los negativos si se escribe el signo
BOOLEAN <- Verdadero
char <-'a'
striNg <- "Hola mundo"
other_integer <- mY_integer.field
operation <- (acumulador) mod 99
operation <- 5 mod 99
operation <- acumulamodor mod vara
test <- 5 div 3 mod 8
numero <- 123

condicion <- 23 <> numero

student.nomBre <- "Reinaldo Felipe"
nombrecito <- student.Nombre

// imprimimos los valores en consola y separados por un espacio
escriba my_integer," ",7.7, -5, the_real_one," ",Boolean," ",char," ",string,FalSo
escriba 88 <> 33

Escriba I

resultado <- exponenciacion(2,5)
resultado <- exponenciacion(2,5, 3, 2)
escriba "El resultado de la operacion es: ",resultado
escriba "22222 <> 6666"

caso variable
  1,2,3:
  	escriba("Es un número entero entre 1 y 3")
  4:
  	escriba("Lo verdadero es que es el número 4")
  5:
  	escriba("Es el número 5")
  sino:
  	escriba("No sé qué número es, ni modo :/")

fin caso

si (5^2 = 25)y(25 mod 5 = 0)o(aDd.field mod acuMulador = 3) entonces
    // Comentario corto

    /* Comentario
     de
     varias
     líneas
     */

    escriba "el 25 es poderoso"

fin si

si nuMero=100 entonces
    escriba "El número es 100"
sino si numero>100 entonces
    escriba "El número es mayor que 100"
    sino
        escriba "El número es menor que 100"
    fin si
fin si

si (5^2 = 25)y(25 mod 5 = 0)o(add.field mod acumulador = 3) entonces

    escriba "el 25 es poderoso"

fin si

mientras (I<=10)o(I mod add[3] = 0) haga
     escriba "Valor de i: ",(i)
     si i<>10 entonces
        llamar nueva_linea
     fin si
     i<-i+1
fin mientras

si string = "StRinG" entonces
fin si

repita
    escriba ("Valor del acumulador en la iteracion: "),(acumulador)
    llamar nueva_linea
    i<-i+1
    acumulador<-acumulador+(i*2)
hasta (i=20) o (acumulador mod 5=4)

/*
	Bloque de comentarios
	puedo poner lo que yo quiera y no va a afectar
	la compilación de mi programa ;)
*/

Para I<- 1 hasta 4 haga
    Para K<- 1 hasta 5 haga
        Escriba I
    Fin para
    Llamar nueva_linea
Fin para

    lea n1,n2

FIN
```

Puedes ejecutar el traductor de la siguiente manera:

```bash
java org.antlr.v4.gui.TestRig lpp prog_main -tree -tokens ejemplo.lpp
```

La salida será el código equivalente en Go:

```go
package main

import "fmt"
import "bufio"
import "os"

type Estudiante struct {
	nombre , segundo_nombre string
	apellido string
	edad int
	tipo_sangre rune
	matricula int
	promedio float32
	arreglo_cadenas [2][3]string
}

var my_integer , variableiwillnotuse int
var the_real_one float32
var boolean bool
var char rune
var string string
var student Estudiante
var n1 , n2 , numero , resultado , i , acumulador int
var resultado int


func exponenciacion(base int, exponente int) int {
	return base^exponente
}


func suma(n1 int, n2 int) {
	var resultado int
	resultado = n1+n2
	fmt.Print(("El resultado de la suma es: "), (resultado))
}

func main() {
	my_integer = 2
	the_real_one = -4.5682
	boolean = true
	char = 'a'
	string = "Hola mundo"
	other_integer = my_integer.field
	operation = (acumulador)  %  99
	operation = 5  %  99
	operation = acumulamodor  %  vara
	test = 5  /  3  %  8
	numero = 123
	condicion = 23!=numero
	student.nombre = "Reinaldo Felipe"
	nombrecito = student.nombre
	fmt.Print(my_integer, " ", 7.7, -5, the_real_one, " ", boolean, " ", char, " ", string, false)
	fmt.Print(88!=33)
	fmt.Print(i)
	resultado = exponenciacion(2, 5)
	resultado = exponenciacion(2, 5, 3, 2)
	fmt.Print("El resultado de la operacion es: ", resultado)
	fmt.Print("22222 <> 6666")

	switch variable {

		case 1, 2, 3:
			fmt.Print(("Es un número entero entre 1 y 3"))

		case 4:
			fmt.Print(("Lo verdadero es que es el número 4"))

		case 5:
			fmt.Print(("Es el número 5"))

		default:
			fmt.Print(("No sé qué número es, ni modo :/"))

	}

	if (5^2==25) && (25  %  5==0) || (add.field  %  acumulador==3) {
		fmt.Print("el 25 es poderoso")
	}

	if numero==100 {
		fmt.Print("El número es 100")
	}	 else 	if numero>100 {
		fmt.Print("El número es mayor que 100")
	}	 else  {
		fmt.Print("El número es menor que 100")
	}



	if (5^2==25) && (25  %  5==0) || (add.field  %  acumulador==3) {
		fmt.Print("el 25 es poderoso")
	}


	for (i<=10) || (i  %  add[3]==0) {
		fmt.Print("Valor de i: ", (i))
		if i!=10 {
			fmt.Println()
		}

		i = i+1
	}

	if string=="StRinG" {
	}

	for ok := true; ok; ok = (i==20)  ||  (acumulador  %  5==4) {
		fmt.Print(("Valor del acumulador en la iteracion: "), (acumulador))
		fmt.Println()
		i = i+1
		acumulador = acumulador+(i*2)
	}

	for i = 1; i <= 4; i++ {
		for k = 1; k <= 5; k++ {
			fmt.Print(i)
		}
		fmt.Println()
	}

	reader := bufio.NewReader(os.Stdin)
	n1, _ = reader.ReadString('\n')
	n2, _ = reader.ReadString('\n')

}
```

## Contacto

Para cualquier pregunta o comentario, no dudes en ponerte en contacto con nosotros:

- Camilo Andres Gonzalez Castro - correo [andgonzalezcas](mailto:andgonzalezcas@unal.edu.co)
- Santiago Mondragon Gomez: correo [smondragon](mailto:smondragon@unal.edu.co)
- Julio Andrés Rodríguez Fernández: correo [jurodriguezf](mailto:jurodriguezf@unal.edu.co)


---

¡Gracias por utilizar el traductor de LPP a Go basado en ANTLR! Esperamos que sea de utilidad para tus proyectos de traducción de código.