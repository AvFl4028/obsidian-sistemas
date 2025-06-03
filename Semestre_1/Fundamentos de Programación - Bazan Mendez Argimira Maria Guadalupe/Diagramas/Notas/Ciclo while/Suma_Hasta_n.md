# Suma_Hasta_n
~~~pseint
//1+2+3+4+...+N

Algoritmo SumarHastaN
    // Declarar variables
    Definir N, suma, i Como Entero

    // Solicitar al usuario que ingrese un número N
    Escribir "Por favor, ingresa un número entero N:"
    Leer N

    // Inicializar las variables
    suma <- 0
    i <- 1

    // Sumar los números desde 1 hasta N
    Mientras i <= N Hacer
        suma <- suma + i  // Sumar el número actual a la suma
        i <- i + 1        // Incrementar el contador
    Fin Mientras

    // Mostrar el resultado
    Escribir "La suma de los números de 1 a ", N, " es: ", suma
FinAlgoritmo

~~~