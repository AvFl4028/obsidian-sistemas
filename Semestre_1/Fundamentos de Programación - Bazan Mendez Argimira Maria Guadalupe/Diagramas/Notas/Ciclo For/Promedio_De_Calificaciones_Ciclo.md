<<<<<<< HEAD
# Promedio_De_Calificaciones_Ciclo
~~~pseint
Algoritmo Promedio_De_Calificaciones_Ciclo
	// Promedio de 6 calificaciones de 20 alumnos contar acreditados y no acreditados
	i es Entero
	j es Entero
	e es Entero
	
	promedio es Numero
	calificacion es Numero
	
	num_alum = 20
	num_calif = 6
	
	Dimension promedios[num_alum]
	
	Escribir "Ingrese sus calificaciones"
	
	Para i = 1 Hasta num_alum Con Paso 1 Hacer
		Escribir "Calificaciones del alumno ", i
		Para j = 1 Hasta num_calif Con Paso 1 Hacer
			Leer calificacion
			Si calificacion es menor que 0 o calificacion es mayor que 100 Entonces
				j = j - 1
				Escribir "Ingrese una calficacion valida"
			SiNo
				promedio = promedio + calificacion
			Fin Si
		Fin Para
		promedios[i] = promedio / num_calif
		promedio = 0
	Fin Para
	
	Escribir "Los promedios son"
	Para e = 1 Hasta num_alum Con Paso 1 Hacer
		Si promedios[e] es mayor que 70 Entonces
			Escribir e, ") ", promedios[e], "y esta Acreditado"
		SiNo
			Escribir e, ") ", promedios[e], "y no esta Acreditado"
		Fin Si
	Fin Para
FinAlgoritmo

=======
# Promedio_De_Calificaciones_Ciclo
~~~pseint
Algoritmo Promedio_De_Calificaciones_Ciclo
	// Promedio de 6 calificaciones de 20 alumnos contar acreditados y no acreditados
	i es Entero
	j es Entero
	e es Entero
	
	promedio es Numero
	calificacion es Numero
	
	num_alum = 20
	num_calif = 6
	
	Dimension promedios[num_alum]
	
	Escribir "Ingrese sus calificaciones"
	
	Para i = 1 Hasta num_alum Con Paso 1 Hacer
		Escribir "Calificaciones del alumno ", i
		Para j = 1 Hasta num_calif Con Paso 1 Hacer
			Leer calificacion
			Si calificacion es menor que 0 o calificacion es mayor que 100 Entonces
				j = j - 1
				Escribir "Ingrese una calficacion valida"
			SiNo
				promedio = promedio + calificacion
			Fin Si
		Fin Para
		promedios[i] = promedio / num_calif
		promedio = 0
	Fin Para
	
	Escribir "Los promedios son"
	Para e = 1 Hasta num_alum Con Paso 1 Hacer
		Si promedios[e] es mayor que 70 Entonces
			Escribir e, ") ", promedios[e], "y esta Acreditado"
		SiNo
			Escribir e, ") ", promedios[e], "y no esta Acreditado"
		Fin Si
	Fin Para
FinAlgoritmo

>>>>>>> 2e762fd9b358a1d81084f63e43da99e86ef2847d
~~~