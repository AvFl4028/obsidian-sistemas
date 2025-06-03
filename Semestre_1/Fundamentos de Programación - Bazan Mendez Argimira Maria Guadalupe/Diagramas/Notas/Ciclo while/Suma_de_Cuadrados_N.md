# Suma_de_Cuadrados_N
~~~pseint
// 1^2+2^2+3^2+...+N^2

Algoritmo SumarCuadrados
    // Declarar variables
    Definir N, suma, i Como Entero

    // Solicitar al usuario que ingrese el valor de N
    Escribir "Por favor, ingresa un número entero N:"
    Leer N

    // Inicializar la variable suma en 0
    suma <- 0

    // Sumar los cuadrados de los números de 1 a N
    Para i <- 1 Hasta N Con Paso 1 Hacer
        suma <- suma + (i * i)  // Sumar el cuadrado del número actual
    Fin Para

    // Mostrar el resultado
    Escribir "La suma de los cuadrados de los números hasta ", N, " es: ", suma
FinAlgoritmo

~~~