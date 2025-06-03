# Contrase�a
~~~pseint
//Escribe un programa que pida al usuario una contraseña y le
//permita intentarlo hasta que ingrese la contraseña correcta
//(definida por ti). El programa debe dar un mensaje de éxito
//cuando la ingrese correctamente
Algoritmo VerificarContrasena
    // Definir la contraseña correcta
    Definir contrasena_correcta Como Cadena
    contrasena_correcta <- "mi_contrasena_secreta"

    // Variable para almacenar la contraseña ingresada por el usuario
    Definir contrasena_ingresada Como Cadena
    contrasena_ingresada <- ""

    // Bucle para permitir múltiples intentos
    Mientras contrasena_ingresada <> contrasena_correcta Hacer
        Escribir "Por favor, ingresa la contraseña:"
        Leer contrasena_ingresada

        // Verificar si es incorrecta
        Si contrasena_ingresada es igual que contrasena_correcta Entonces
            Escribir "Contraseña incorrecta. Intenta de nuevo."
        Fin Si
    Fin Mientras

    // Mensaje de éxito al ingresar la contraseña correcta
    Escribir "¡Acceso concedido! Contraseña correcta."
FinAlgoritmo

~~~