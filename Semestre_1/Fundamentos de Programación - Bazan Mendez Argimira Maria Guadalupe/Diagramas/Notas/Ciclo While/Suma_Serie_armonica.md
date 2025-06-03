# Suma_Serie_armonica
~~~pseint
// 1 + 1/2 +1/3 + 1/4 + ... + 1/N

Algoritmo SumarSerieHarmonicas
    // Declarar variables
    Definir N, suma, i Como Real

    // Solicitar al usuario que ingrese el valor de N
    Escribir "Por favor, ingresa un número entero N:"
    Leer N

    // Inicializar la variable suma en 0
    suma <- 0

    // Sumar los términos de la serie armónica
    Para i <- 1 Hasta N Con Paso 1 Hacer
        suma <- suma + (1 / i)  // Sumar el término 1/i
    Fin Para

    // Mostrar el resultado
    Escribir "La suma de la serie armónica hasta ", N, " es: ", suma
FinAlgoritmo

~~~