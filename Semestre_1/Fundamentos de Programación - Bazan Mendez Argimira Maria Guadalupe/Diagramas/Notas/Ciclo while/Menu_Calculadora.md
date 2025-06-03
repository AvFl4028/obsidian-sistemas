# Menu_Calculadora
~~~pseint
Algoritmo Menu_Calculadora


//Crea un programa que muestre un menú con las siguientes
//opciones:

//1. Sumar dos números
//2. Restar dos números
//3. Multiplicar dos números
//4. Dividir dos números
//5. Salir
//El programa debe repetirse hasta que el usuario elija la opción de
//salir.

	a = 0
	b = 0
	c = 0
	Repetir
		Escribir "1. Sumar"
		Escribir "2. Restar"
		Escribir "3. Multiplicar"
		Escribir "4. Dividir"
		Escribir "5. Salir"

		Leer a

		Segun a Hacer
			1:
				Escribir "Numero 1: "
				Leer b
				Escribir "Numero 2: "
				Leer c
				Imprimir "Resultado: ", b+c
				Esperar 2 Segundos
				Limpiar Pantalla
			2:
				Escribir "Numero 1: "
				Leer b
				Escribir "Numero 2: "
				Leer c
				Imprimir "Resultado: ", b-c
				Esperar 2 Segundos
				Limpiar Pantalla
			3:
				Escribir "Numero 1: "
				Leer b
				Escribir "Numero 2: "
				Leer c
				Imprimir "Resultado: ", b*c
				Esperar 2 Segundos
				Limpiar Pantalla
			4:
				Escribir "Numero 1: "
				Leer b
				Escribir "Numero 2: "
				Leer c
				Si c no es igual que 0 Entonces
					Imprimir "Resultado: ", b/c
				SiNo
					Imprimir "Indeterminado"
				FinSi
				Esperar 2 Segundos
				Limpiar Pantalla
			5:
			De Otro Modo:
				a = 0
		Fin Segun
	Hasta Que a == 5
FinAlgoritmo

~~~