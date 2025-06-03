## ¿Qué es la corrida de escritorio de trazado manual?
Una corrida de escritorio de trazado manual, también conocida como prueba de escritorio o "desk check", es una técnica manual utilizada para verificar el comportamiento de un algoritmo o programa, línea por línea, antes de su implementación o ejecución en una computadora.

**¿En qué consiste?**

1. **Selección del Algoritmo:** Se elige el algoritmo o programa que se va a probar.
2. **Preparación de Datos:** Se definen los datos de entrada que se utilizarán para la prueba.
3. **Creación de una Tabla:** Se elabora una tabla donde se registrarán los valores de las variables y la salida del programa en cada paso.
4. **Ejecución Manual:** Se simula la ejecución del programa paso a paso, siguiendo la lógica del código y registrando los cambios en las variables en la tabla.
5. **Análisis de Resultados:** Se examinan los valores obtenidos en la tabla para identificar posibles errores o inconsistencias en el algoritmo.

**¿Para qué sirve?**

- **Detección de Errores:** Permite encontrar errores lógicos y de programación antes de que el programa sea ejecutado en una computadora, lo que ahorra tiempo y esfuerzo.
- **Comprensión del Algoritmo:** Ayuda a entender mejor el funcionamiento del algoritmo y su lógica interna.
	- **Mejora de la Calidad del Código:** Facilita la identificación de áreas de mejora en el código y su optimización.

**¿Cómo se hace?**

1. **Documentación:** Se necesita tener el código del algoritmo o programa, ya sea en pseudocódigo o en un lenguaje de programación específico.
2. **Tabla de Seguimiento:** Se crea una tabla con columnas para las variables, la salida y cualquier otra información relevante.
3. **Datos de Prueba:** Se eligen datos de entrada representativos que permitan probar diferentes escenarios y casos límite.
4. **Simulación:** Se recorre el código línea por línea, simulando su ejecución y anotando los valores de las variables en la tabla.
5. **Verificación:** Se comparan los resultados obtenidos con los resultados esperados para identificar posibles errores.

**En resumen,** la corrida de escritorio de trazado manual es una herramienta útil para verificar la corrección y el comportamiento de un algoritmo antes de su implementación, lo que contribuye a mejorar la calidad del software y a reducir los errores.
Ejemplo:

**Problema:** Calcular el área de un rectángulo dadas su base y altura.

**Algoritmo (Pseudocódigo):**

```
INICIO
  LEER base
  LEER altura
  area = base * altura
  IMPRIMIR area
FIN
```

**Datos de Entrada:**

- base = 5
- altura = 3

**Tabla de Seguimiento:**

|Paso|Variable|Valor|
|---|---|---|
|1|base|5|
|2|altura|3|
|3|area|15|
|4|||

**Explicación:**

6. **Paso 1:** Se lee el valor de la base (5) y se almacena en la variable `base`.
7. **Paso 2:** Se lee el valor de la altura (3) y se almacena en la variable `altura`.
8. **Paso 3:** Se calcula el área multiplicando la base por la altura (5 * 3 = 15) y se almacena el resultado en la variable `area`.
9. **Paso 4:** Se imprime el valor del área (15).

**Resultado:**

La corrida de escritorio muestra que el algoritmo funciona correctamente para los datos de entrada proporcionados y produce el resultado esperado (15).
