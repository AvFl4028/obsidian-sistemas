# Suma_Impar_Hasta_15
~~~pseint
//1 + 3 + 5 + 7 + 9 + ...+ 15

Algoritmo SumarImparesHasta15
    // Declarar variables
    Definir suma, i Como Entero

    // Inicializar las variables
    suma <- 0
    i <- 1

    // Sumar los números impares hasta 15
    Mientras i <= 15 Hacer
        suma <- suma + i  // Sumar el número impar actual
        i <- i + 2        // Incrementar en 2 para obtener el siguiente número impar
    Fin Mientras

    // Mostrar el resultado
    Escribir "La suma de los números impares hasta 15 es: ", suma
FinAlgoritmo

~~~