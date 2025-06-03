# Secuencia_Fibonacci_Hasta_Detener
~~~pseint
//Escribe un programa que imprima los primeros n números de la
//serie de Fibonacci, donde n es un número que ingrese el usuario.
//El programa debe continuar hasta que el usuario decida
//detenerlo.

Algoritmo FibonacciHastaDetener
    // Declarar variables
    Definir n, a, b, siguiente Como Entero
    Definir continuar Como Cadena

    // Bucle que permite continuar ejecutando el programa hasta que el usuario decida detenerlo
    Repetir
        // Solicitar al usuario que ingrese el valor de n
        Escribir "Por favor, ingresa el valor de n (número de términos de Fibonacci):"
        Leer n

        // Inicializar los primeros dos términos de la secuencia de Fibonacci
        a <- 0
        b <- 1

        // Verificar que n sea mayor que 0
        Si n <= 0 Entonces
            Escribir "Por favor, ingresa un número mayor a 0."
        Sino
            // Imprimir los primeros n términos de la secuencia de Fibonacci
            Escribir "Los primeros ", n, " números de la secuencia de Fibonacci son:"

            Para i <- 1 Hasta n Hacer
                Escribir a
                siguiente <- a + b
                a <- b
                b <- siguiente
            Fin Para
        Fin Si

        // Preguntar al usuario si quiere continuar
        Escribir "¿Deseas ingresar otro número? (si/no):"
        Leer continuar

    Hasta Que continuar = "no" // El bucle se repite hasta que el usuario ingrese "no"

    Escribir "Programa finalizado. ¡Hasta luego!"
FinAlgoritmo

~~~