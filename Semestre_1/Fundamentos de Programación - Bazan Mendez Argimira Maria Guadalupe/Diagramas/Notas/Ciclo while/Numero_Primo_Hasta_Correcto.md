# Numero_Primo_Hasta_Correcto
~~~pseint
//Escribe un programa que pida un número entero y determine si es
//un número primo. El ciclo debe repetirse mientras el usuario no
//ingrese un número primo.

Algoritmo NumeroPrimoHastaCorrecto
    // Declarar variables
    Definir numero, i, es_primo Como Entero

    // Repetir hasta que el usuario ingrese un número primo
    Repetir
        // Solicitar al usuario que ingrese un número
        Escribir "Por favor, ingresa un número entero:"
        Leer numero

        // Verificar si el número es primo
        es_primo <- 1  // Asumimos que el número es primo
        Si numero <= 1 Entonces
            es_primo <- 0 // Los números menores o iguales a 1 no son primos
        Sino
            Para i <- 2 Hasta Trunc(Sqrt(numero)) Hacer
                Si numero % i = 0 Entonces
                    es_primo <- 0 // El número no es primo
                    Salir // Si encontramos un divisor, terminamos el ciclo
                Fin Si
            Fin Para
        Fin Si

        // Informar si el número es primo o no
        Si es_primo = 1 Entonces
            Escribir "El número ", numero, " es primo."
        Sino
            Escribir "El número ", numero, " no es primo. Intenta de nuevo."
        Fin Si

    Hasta Que es_primo = 1 // El ciclo se repite hasta que el número sea primo

FinAlgoritmo

~~~