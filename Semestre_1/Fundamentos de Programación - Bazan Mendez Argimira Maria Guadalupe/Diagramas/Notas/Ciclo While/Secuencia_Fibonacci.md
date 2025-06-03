# Secuencia_Fibonacci
~~~pseint
//Escribe un programa que imprima los primeros n números de la
//secuencia de Fibonacci

Algoritmo SecuenciaFibonacci
    // Declarar variables
    Definir n, a, b, siguiente Como Entero

    // Solicitar al usuario que ingrese el valor de n
    Escribir "Por favor, ingresa el valor de n (número de términos de Fibonacci):"
    Leer n

    // Inicializar los primeros dos términos de la secuencia
    a <- 0
    b <- 1

    // Verificar que n sea positivo
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
FinAlgoritmo

~~~