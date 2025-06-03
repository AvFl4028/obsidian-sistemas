# Multiplicar_Hasta_7
~~~pseint
// 1*2*3*4*...*7

Algoritmo ProductoHasta7
    // Declarar variables
    Definir producto, i Como Entero

    // Inicializar las variables
    producto <- 1
    i <- 1

    // Calcular el producto de los números de 1 a 7
    Mientras i <= 7 Hacer
        producto <- producto * i  // Multiplicar el número actual al producto
        i <- i + 1                // Incrementar el contador
    Fin Mientras

    // Mostrar el resultado
    Escribir "El producto de los números de 1 a 7 es: ", producto
FinAlgoritmo

~~~