# Suma_Hasta_Negativo
~~~pseint
//Escribe un programa que pida un número entero y calcule la suma
//de sus dígitos. El ciclo debe repetirse hasta que el usuario ingrese
//un número negativo.

Algoritmo SumaDeDigitosHastaNumeroNegativo
    // Declarar variables
    Definir numero, suma, residuo Como Entero

    // Bucle que se repite hasta que el usuario ingrese un número negativo
    Repetir
        // Inicializar la suma en 0
        suma <- 0

        // Solicitar un número al usuario
        Escribir "Por favor, ingresa un número entero:"
        Leer numero

        // Si el número es negativo, terminar el ciclo
        Si numero < 0 Entonces
            Escribir "Programa terminado. ¡Hasta luego!"
            Salir
        Fin Si

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

    Hasta Que numero < 0 // El ciclo termina cuando el usuario ingresa un número negativo
FinAlgoritmo

~~~