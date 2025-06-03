# Menu_Ciclo_Do
~~~pseint
Algoritmo Menu_Ciclo_Do

//Escribe un programa que muestre un menú con las opciones:
//1. Imprimir "Hola"
//2. Imprimir "Adiós"
//3. Salir
//El menú debe repetirse hasta que el usuario elija la opción de
//salir.

	a <- 0
	Repetir
		Escribir '1. Imprimir Hola'
		Escribir '2. Imprimir Adios'
		Escribir '3. Salir'
		Leer a
		Segun a Hacer
			1:
				Limpiar Pantalla
				Escribir 'Hola'
				Esperar 2 Segundos
				Limpiar Pantalla
			2:
				Limpiar Pantalla
				Escribir 'Adios'
				Esperar 2 Segundos
				Limpiar Pantalla
			3:
				Limpiar Pantalla
				a <- 3
			De Otro Modo:
				Limpiar Pantalla
				a <- 0
		FinSegun
	Hasta Que a==3
FinAlgoritmo

~~~