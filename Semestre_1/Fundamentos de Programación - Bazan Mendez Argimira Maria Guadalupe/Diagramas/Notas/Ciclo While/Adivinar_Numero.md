# Adivinar_Numero
~~~pseint
//El programa genera un número aleatorio entre 1 y 100, y el usuario
//debe adivinarlo. El programa debe seguir solicitando un número
//hasta que el usuario adivine el correcto, indicando si el número es
//mayor o menor que la respuesta correcta.

Algoritmo AdivinarNumero
    // Declarar variables
    Definir numero_aleatorio, intento Como Entero

    // Generar un número aleatorio entre 1 y 100
    AleatorioSemilla() // Inicializar semilla para números aleatorios
    numero_aleatorio <- Azar(100) // Genera un número aleatorio entre 1 y 100

    // Solicitar intentos hasta que el usuario adivine el número
    Escribir "¡He generado un número entre 1 y 100! Intenta adivinarlo."

    Repetir
        Escribir "Ingresa tu número:"
        Leer intento

        Si intento > numero_aleatorio Entonces
            Escribir "El número es menor. Intenta de nuevo."
        Sino
            Si intento < numero_aleatorio Entonces
                Escribir "El número es mayor. Intenta de nuevo."
            Fin Si
        Fin Si
    Hasta Que intento = numero_aleatorio

    // Mensaje de éxito
    Escribir "¡Felicidades! Has adivinado el número."
FinAlgoritmo

~~~