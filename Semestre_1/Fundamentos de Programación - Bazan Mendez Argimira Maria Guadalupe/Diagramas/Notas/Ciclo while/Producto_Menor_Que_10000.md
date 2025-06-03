# Producto_Menor_Que_10000
~~~pseint
//1*2*3*4*...*n mientras el produco sea menor que 10 000

Algoritmo ProductoMenorQue10000
    // Declarar variables
    Definir n, producto, i Como Entero

    // Inicializar las variables
    producto <- 1
    i <- 1

    // Calcular el producto hasta que sea mayor o igual a 10,000
    Mientras producto < 10000 Hacer
        producto <- producto * i  // Multiplicar el producto por el número actual
        i <- i + 1  // Incrementar el contador
    Fin Mientras

    // Mostrar el resultado
    Escribir "El producto es ", producto, " cuando el número fue ", i-1
FinAlgoritmo

~~~