# Examen de Programación

C.F.G.S Desarrollo de Aplicaciones Multiplataforma
Módulo: Programación
20 de marzo de 2018

# Instrucciones para la realización y entrega del examen

*	Haz un fork desde tu cuenta de GitHub del siguiente repositorio:

	https://github.com/examentes/20180320damprog.


*	Ejecuta Eclipse y clona el fork que acabas de realizar.


*	Importa el proyecto si no lo has hecho durante la clonación.


*	Abre el fichero README.md y leelo completamente antes de realizar el examen.


*	Resuelve los ejercicios realizando una confirmación cada vez que completes cada uno de ellos.

*	En el proyecto de Eclipse se ha creado un paquete para cada ejercicio. Por tanto, las clases e interfaces que se definan en cada ejercicio deberán pertenecer al paquete corresponidente.

### Ejercicio 1

Una empresa cualquiera desea desarrollar con Java una aplicación para gestionar el pago de las nomina será crear, utilizando las técnicas de programación orientada a objetos que corresponda, las clases e interfaces que se deducen de las especificaciones siguientes:

*	Existen dos tipos de empleados: asalariados y contratistas. Todos ellos se caracterizan por su nombre, apellidos, fecha de contratación y nº de cuenta bancaria. El valor de estos atributos se podrá consultar, pero no modificar, excepto el n.º de cuenta que se podrá tanto consultar como modificar.


*	Los contratistas se caracterizan además por poseer una o varias sociedades anónimas. Las sociedades anónimas son empresas especializadas en la realización de determinados trabajos para los que, por la razón que sea, los empleados asalariados no están cualificados. Una sociedad anónima se caracteriza por su nombre (se puede consultar, pero no modificar) y por la lista de trabajos en los que está especializada que podrá variar a lo largo del tiempo.


*	La empresa también contrata empresas de servicios (catering, telefonía, electricidad, limpieza, etc) que se caracterizan por su nombre, el tipo de servicio prestado (ambos se pueden consultar pero no modificar) y un número de cuenta bancaria (se puede modificar y consultar).


*	Tanto los empleados como las empresas de servicios tendrán una interfaz común para la realización del pago mediante ingreso en cuenta bancaria del importe de la nómina o del importe del servicio prestado. Simular el pago mediante mensajes por pantalla que indiquen que se realiza un ingreso en cuenta en concepto de lo que corresponda en cada caso (no es necesario especificar el importe del ingreso).

### Ejercicio 2

En el método main de una clase llamada `Ejercicio2`, poner a prueba las clases definidas en el ejercicio anterior con sentencias que pongan de manifiesto el uso de polimorfismo en el tratamiento de empleados y empresas de servicios, todos ellos almacenados en un mismo `ArrayList`.

### Ejercicio 3

Define la clase `StringUtil` con un único método de clase llamado `contarLetrasUnicas`, que reciba como parámetro un `String` y retorne el número de letras únicas en dicha cadena (no se hará distinción entre mayúsculas y minúsculas). Dado que es posible que durante la ejecución de un programa se invoque al método `contarLetrasUnicas` más de una vez pasándole la misma cadena, y teniendo en cuenta que contar el número de letras únicas dentro de una cadena es una operación costosa, se pide que el método mantenga una cache de cadenas ya procesadas de forma que cuando se le pase una cadena ya procesada obtenga el resultado de la cache en lugar de volver a calcularlo. Utilizar las colecciones y/o mapas que se consideren necesarias para que el método funcione de forma eficiente.

**Ejemplo**: si el método recibe la cadena `"Examen de Programación"`, retornará el valor 8, ya que las letras x, d, p, o, g, c, i y ó aparecen una sola vez.

### Ejercicio 4

Utilizando colecciones y/o mapas, crear un programa Java que establezca una concordancia entre los caracteres que aparecen en una cadena y las posiciones en las que aparecen y mostrarla por la pantalla en orden alfabético. La cadena se recibe a través de los parámetros de la línea de comando. No se procesarán los espacios en blanco ni se hará distinción entre mayúsculas y minúsculas.

A continuación se muestra un ejemplo de la salida que tendría que mostrar el programa si se le pasa la cadena "Hola Mundo":

	{a=[3], d=[8], h=[0], l=[2], m=[5], n=[7], o[1, 9], u=[6]}

# Criterios de calificación

La puntuación máxima de cada ejercicio será:

*	Ejercicio 1: 3 puntos.


*	Ejercicio 2: 1 punto.


*	Ejercicio 3: 3 puntos.


*	Ejercicio 3: 3 puntos.

Los ejercicios con errores de sintaxis tendrán una calificación de cero puntos.

Las soluciones parciales obtendrán un porcentaje de la puntuación máxima en función del grado de aproximación a alguna solución completa del problema siempre que no existan errores de sintaxis.

