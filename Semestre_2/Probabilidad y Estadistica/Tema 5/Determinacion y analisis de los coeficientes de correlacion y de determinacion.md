# Determinación y análisis de los coeficientes de correlación y de determinación
## **1. Coeficiente de determinación muestral (r²):**

* **Definición**: Es una medida que indica qué proporción de la variación total de la variable dependiente (Y) puede explicarse por su relación lineal con la variable independiente (X), mediante la línea de regresión.

* **Representación**: $r^2$, y su valor está entre 0 y 1:

  * **r² cercano a 1** → fuerte relación lineal.
  * **r² cercano a 0** → débil relación lineal.

* **Cálculo**: Se obtiene comparando dos tipos de variación en Y:

  1. Variación de Y respecto a la línea de regresión estimada.
  2. Variación de Y respecto a su media.

* **Interpretación**:

  * Si $r^2 = 0.85$, significa que el 85% de la variación en Y se explica por X.
  * El otro 15% se debe a factores no considerados.
* **Fórmula**:
![[Pasted image 20250514082002.png]]
## **2. Coeficiente de correlación muestral (r):**

* **Definición**: Es la **raíz cuadrada de r²** y mide tanto la **fuerza como la dirección** de la relación lineal entre dos variables cuantitativas.

* **Representación**: $r$, conocido como **coeficiente de Pearson**.

* **Rango de valores**:

  * $r = +1$: correlación positiva perfecta.
  * $r = -1$: correlación negativa perfecta.
  * $r = 0$: no hay correlación lineal.
  * Cuanto más cercano a +1 o -1, más fuerte es la relación.

* **Signo de r**:

  * Positivo → relación directa (cuando X sube, Y también).
  * Negativo → relación inversa (cuando X sube, Y baja).
  * El signo depende de la pendiente de la recta de regresión (b).

* **Fórmulas comunes**:

  * $r = \sqrt{r^2}$, considerando el signo de la pendiente.
  * Fórmula completa para cálculo con datos muestrales:

    $$
    r = \frac{n(\sum XY) - (\sum X)(\sum Y)}{\sqrt{[n\sum X^2 - (\sum X)^2][n\sum Y^2 - (\sum Y)^2]}}
    $$
## **3. Diagramas de dispersión y análisis visual:**

* Muestran gráficamente la relación entre X y Y.
* Una relación **fuerte** → puntos cercanos a una línea recta.
* Una relación **débil** → puntos muy dispersos.
* Sirven para **visualizar la intensidad y la dirección** de la correlación.
![[Pasted image 20250514081926.png]]
## **4. Consideraciones finales:**

* Aunque r y r² miden la relación entre variables, **no garantizan una relación causal**.
* La **dispersión** en los datos influye en la precisión de las predicciones.
* **No toda correlación implica predicción perfecta**.
