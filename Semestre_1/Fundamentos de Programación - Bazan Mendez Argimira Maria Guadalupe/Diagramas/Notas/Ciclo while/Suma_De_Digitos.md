# Suma_De_Digitos
~~~pseint
//Escribe un programa que lea un número entero y calcule la suma
//de sus dígitos. Ejemplo: Si el número es 123, la suma sería 6.

Algoritmo SumaDeDigitos
    // Declarar variables
    Definir numero, suma, residuo Como Entero

    // Solicitar al usuario que ingrese un número
    Escribir "Por favor, ingresa un número entero:"
    Leer numero

    // Inicializar la suma en 0
    suma <- 0

    // Asegurar que el número sea positivo para evitar problemas con los dígitos
    numero <- Abs(numero)

    // Calcular la suma de los dígitos
    Mientras numero > 0 Hacer
        residuo <- numero % 10        // Obtener el último dígito
        suma <- suma + residuo        // Sumar el dígito a la variable suma
        numero <- Trunc(numero / 10)  // Eliminar el último dígito del número
    Fin Mientras

    // Mostrar la suma de los dígitos
    Escribir "La suma de los dígitos es: ", suma
FinAlgoritmo

~~~