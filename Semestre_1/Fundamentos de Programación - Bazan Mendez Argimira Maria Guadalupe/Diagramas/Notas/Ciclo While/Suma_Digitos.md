# Suma_Digitos
~~~pseint
//Escribe un programa que lea un número entero y calcule la suma
//de sus dígitos

Algoritmo SumaDeDigitos
    // Declarar variables
    Definir numero, suma, residuo Como Entero
    suma <- 0 // Inicializar la suma en 0

    // Solicitar un número al usuario
    Escribir "Por favor, ingresa un número entero:"
    Leer numero

    // Asegurar que el número sea positivo para evitar problemas con los dígitos
    numero <- Abs(numero)

    // Bucle para calcular la suma de los dígitos
    Mientras numero > 0 Hacer
        residuo <- numero % 10      // Obtener el último dígito
        suma <- suma + residuo      // Sumar el dígito a la variable suma
        numero <- Trunc(numero / 10) // Eliminar el último dígito del número
    Fin Mientras

    // Mostrar el resultado
    Escribir "La suma de los dígitos es: ", suma
FinAlgoritmo

~~~