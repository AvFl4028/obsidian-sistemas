# Validar_Numero_Positivo
~~~pseint
//Escribe un programa que solicite un número al usuario y valide
//que sea un número entero positivo. Si el usuario ingresa un valor
//no válido, el programa debe solicitar otro número hasta que sea
//válido

Algoritmo ValidarNumeroEnteroPositivo
    // Declarar variable
    Definir numero Como Entero

    // Inicializar el número con un valor no válido
    numero <- -1

    // Bucle para solicitar un número válido
    Mientras numero < 0 Hacer
        Escribir "Por favor, ingresa un número entero positivo:"
        Leer numero

        Si numero < 0 Entonces
            Escribir "El número ingresado no es válido. Intenta de nuevo."
        Fin Si
    Fin Mientras

    // Mensaje de confirmación
    Escribir "Número válido ingresado: ", numero
FinAlgoritmo

~~~