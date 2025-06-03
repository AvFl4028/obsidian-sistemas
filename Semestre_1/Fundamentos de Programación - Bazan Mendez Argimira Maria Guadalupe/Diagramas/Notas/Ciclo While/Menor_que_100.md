# Menor_que_100
~~~pseint
//1+2+3+4+...+mientras la sumatoria sea menor que 100

Algoritmo SumarHasta100
    // Declarar variables
    Definir suma, i Como Entero

    // Inicializar las variables
    suma <- 0
    i <- 1

    // Realizar la suma hasta que la suma sea menor que 100
    Mientras suma < 100 Hacer
        suma <- suma + i  // Sumar el número actual a la suma
        i <- i + 1        // Incrementar el número
    Fin Mientras

    // Mostrar el resultado
    Escribir "La suma es: ", suma
FinAlgoritmo

~~~