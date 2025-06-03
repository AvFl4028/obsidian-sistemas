# Tabla_Multiplicar
~~~pseint
//Escribe un programa que pida un número entero al usuario y
//luego imprima la tabla de multiplicar de ese número (del 1 al 10)

Algoritmo TablaDeMultiplicar
    // Variable para almacenar el número ingresado por el usuario
    Definir numero Como Entero

    // Solicitar el número al usuario
    Escribir "Por favor, ingresa un número entero:"
    Leer numero

    // Bucle para calcular e imprimir la tabla de multiplicar del 1 al 10
    Para i <- 1 Hasta 10 Hacer
        Escribir numero, " x ", i, " = ", numero * i
    Fin Para
FinAlgoritmo

~~~