# Suma_Pares_N
~~~pseint
// 2+4+6+8+...+N

Algoritmo SumarNumerosPares
    // Declarar variables
    Definir N, suma, i Como Entero

    // Solicitar al usuario que ingrese el valor de N
    Escribir "Por favor, ingresa un número entero N:"
    Leer N

    // Inicializar la variable suma en 0
    suma <- 0

    // Sumar los números pares de 2 hasta N
    Para i <- 2 Hasta N Con Paso 2 Hacer
        suma <- suma + i  // Sumar el número par actual
    Fin Para

    // Mostrar el resultado
    Escribir "La suma de los números pares hasta ", N, " es: ", suma
FinAlgoritmo

~~~