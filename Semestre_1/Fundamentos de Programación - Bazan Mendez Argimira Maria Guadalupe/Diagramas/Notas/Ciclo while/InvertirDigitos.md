# InvertirDigitos
~~~pseint
//Escribe un programa que invierta los dígitos de un número entero
//ingresado por el usuario. Ejemplo: si el usuario ingresa 1234, el
//programa debe devolver 4321

Algoritmo InvertirDigitos
    // Declarar variables
    Definir numero, invertido, residuo Como Entero

    // Solicitar al usuario que ingrese un número
    Escribir "Por favor, ingresa un número entero:"
    Leer numero

    // Inicializar la variable invertido en 0
    invertido <- 0

    // Asegurar que el número sea positivo
    numero <- Abs(numero)

    // Invertir los dígitos del número
    Mientras numero > 0 Hacer
        residuo <- numero % 10        // Obtener el último dígito
        invertido <- invertido * 10 + residuo // Añadir el dígito al número invertido
        numero <- Trunc(numero / 10)  // Eliminar el último dígito del número
    Fin Mientras

    // Mostrar el número invertido
    Escribir "El número invertido es: ", invertido
FinAlgoritmo

~~~