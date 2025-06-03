# Numero_Primo
~~~pseint
//Escribe un programa que determine si un número ingresado por el
//usuario es primo

Algoritmo NumeroPrimo
    // Declarar variables
    Definir numero, i, es_primo Como Entero
    es_primo <- 1 // Inicializar como primo (1 significa verdadero)

    // Solicitar al usuario que ingrese un número
    Escribir "Por favor, ingresa un número entero:"
    Leer numero

    // Verificar si el número es menor o igual a 1
    Si numero <= 1 Entonces
        es_primo <- 0 // No es primo si es 1 o menor
    Sino
        // Verificar si el número es divisible por algún número entre 2 y la raíz cuadrada del número
        Para i <- 2 Hasta Trunc(Sqrt(numero)) Hacer
            Si numero % i = 0 Entonces
                es_primo <- 0 // El número no es primo
                Salir // Terminar el bucle si se encuentra un divisor
            Fin Si
        Fin Para
    Fin Si

    // Mostrar el resultado
    Si es_primo = 1 Entonces
        Escribir "El número ", numero, " es primo."
    Sino
        Escribir "El número ", numero, " no es primo."
    Fin Si
FinAlgoritmo

~~~