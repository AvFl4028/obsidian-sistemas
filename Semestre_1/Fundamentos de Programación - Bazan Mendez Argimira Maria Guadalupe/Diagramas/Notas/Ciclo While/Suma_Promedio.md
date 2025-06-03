# Suma_Promedio
~~~pseint
//Escribe un programa que pida números enteros al usuario. El
//programa debe continuar pidiendo números y calculando el
//promedio de los números ingresados hasta que el usuario ingrese
//el número 0

Algoritmo Suma_Promedio
  num <- 1
  prom <- 0
  i <- 0
  Mientras num no es igual que 0 Hacer
    leer num
    sum <- sum + num
    i <- i + 1
  FinMientras
  prom <- sum / i
  Escribir "El promedio es: ", prom
FinAlgoritmo
~~~