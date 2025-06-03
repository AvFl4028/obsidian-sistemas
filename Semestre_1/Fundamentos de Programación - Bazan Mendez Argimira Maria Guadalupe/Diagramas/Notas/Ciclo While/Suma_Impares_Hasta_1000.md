# Suma_Impares_Hasta_1000
~~~pseint
// 1 + 3 + 5 + 7 + 9 + ...+ n hasta que la sumatoria supere los 1000

Algoritmo SumarImparesHasta1000
    // Declarar variables
    Definir suma, i Como Entero

    // Inicializar las variables
    suma <- 0
    i <- 1  // Primer número impar

    // Sumar los números impares hasta que la suma supere 1000
    Mientras suma <= 1000 Hacer
        suma <- suma + i  // Sumar el número impar actual
        i <- i + 2  // El siguiente número impar
    Fin Mientras

    // Mostrar el resultado
    Escribir "La suma de los números impares es ", suma
FinAlgoritmo

~~~