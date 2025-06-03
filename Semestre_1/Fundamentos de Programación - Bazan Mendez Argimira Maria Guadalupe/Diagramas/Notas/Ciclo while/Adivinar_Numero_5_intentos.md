# Adivinar_Numero_5_intentos
~~~pseint
//Modifica el problema "Adivina el número" para que el usuario solo
//tenga 5 intentos. Si el usuario no acierta el número en esos
//intentos, el programa debe terminar e indicar el número correcto.

Algoritmo AdivinarNumeroCon5Intentos
    // Declarar variables
    Definir numero_aleatorio, intento, intentos_restantes Como Entero
    intentos_restantes <- 5 // Inicializar el número de intentos permitidos

    // Generar un número aleatorio entre 1 y 100
    AleatorioSemilla() // Inicializar semilla para números aleatorios
    numero_aleatorio <- Azar(100) // Genera un número aleatorio entre 1 y 100

    // Mensaje inicial
    Escribir "¡He generado un número entre 1 y 100!"
    Escribir "Tienes ", intentos_restantes, " intentos para adivinarlo."

    // Bucle con límite de intentos
    Mientras intentos_restantes > 0 Hacer
        Escribir "Te quedan ", intentos_restantes, " intentos. Ingresa tu número:"
        Leer intento

        Si intento = numero_aleatorio Entonces
            Escribir "¡Felicidades! Has adivinado el número."
            FinAlgoritmo // Finaliza si el usuario acierta
        Sino
            Si intento > numero_aleatorio Entonces
                Escribir "El número es menor. Intenta de nuevo."
            Sino
                Escribir "El número es mayor. Intenta de nuevo."
            Fin Si
        Fin Si

        // Restar un intento
        intentos_restantes <- intentos_restantes - 1
    Fin Mientras

    // Mensaje si se agotan los intentos
    Escribir "Lo siento, no lograste adivinar el número."
    Escribir "El número correcto era: ", numero_aleatorio
FinAlgoritmo

~~~