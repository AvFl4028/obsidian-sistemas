# Invertir_Digitos
~~~pseint
//Escribe un programa que invierta los dígitos de un número entero
//ingresado por el usuario

Algoritmo InvertirDigitos
    // Declarar variables
    Definir numero Como Entero
    Definir numero_invertido, residuo Como Entero
    numero_invertido <- 0

    // Solicitar el número al usuario
    Escribir "Por favor, ingresa un número entero:"
    Leer numero

    // Bucle para invertir los dígitos
    Mientras numero <> 0 Hacer
        residuo <- numero % 10         // Obtener el último dígito
        numero_invertido <- numero_invertido * 10 + residuo // Formar el número invertido
        numero <- Trunc(numero / 10)  // Eliminar el último dígito del número original
    Fin Mientras

    // Mostrar el número invertido
    Escribir "El número invertido es: ", numero_invertido
FinAlgoritmo

~~~