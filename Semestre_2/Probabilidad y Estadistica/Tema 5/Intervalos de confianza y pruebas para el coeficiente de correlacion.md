# **Intervalos de Confianza y Pruebas para el Coeficiente de Correlación**
## **1. Coeficiente de Correlación de Pearson (𝑟)**

* Es una **medida adimensional** de la **fuerza y dirección** de la relación lineal entre dos variables.

* Se calcula con la fórmula:

  $$
  r = \frac{s_{xy}}{s_x \cdot s_y}
  $$

  Donde:

  * $s_{xy}$: covarianza entre X e Y
  * $s_x$, $s_y$: desviaciones estándar de X y Y

* **Interpretación del valor de r** (rango de -1 a 1):

  * $r = 1$: correlación perfecta positiva
  * $r = 0$: no hay correlación
  * $r = -1$: correlación perfecta negativa
  * Valores intermedios se interpretan como:

    * Baja: 0.00–0.30
    * Moderada: 0.31–0.60
    * Alta: 0.61–1.00 (positivo o negativo)
## **2. Intervalo de Confianza para ρ (correlación poblacional)**

* Un **intervalo de confianza (IC)** permite estimar el **valor verdadero** del coeficiente de correlación poblacional (ρ) a partir de la muestra.
* Se expresa como un rango en el cual se espera que esté ρ con un nivel de confianza (por ejemplo, 95%).
* La fórmula del IC incluye:
![[Pasted image 20250514083146.png]]
  * $\hat{y}$: valor estimado de Y
  * $t_{\alpha/2}$: valor crítico de la distribución t de Student
  * $Se$ o $S_{yx}$: error estándar de la estimación
  * $n$: tamaño de muestra
  * $\bar{x}$: media de X
  * $x_p$: valor puntual de X a evaluar
## **3. Prueba de Hipótesis para el Coeficiente de Correlación**

* Permite **verificar si hay relación entre las variables** o si esta es solo aparente (producto del azar).

* Se aplica una **prueba t de Student**:

  * **Hipótesis:**

    * $H_0: \rho = 0$ (no hay correlación)
    * $H_1: \rho \ne 0$ (sí hay correlación)

* **Estadístico de prueba:**

  $$
  t = \frac{r \sqrt{n-2}}{\sqrt{1 - r^2}}
  $$

* Se compara el valor calculado con el valor crítico de la **tabla t** con $n-2$ grados de libertad y un nivel de significancia α (por ejemplo, 0.05 para 95% de confianza).

* **Si |t\_calculado| > t\_crítico**, se **rechaza $H_0$** → hay correlación significativa.
## **Ejemplo de Aplicación**

* Se mide la longitud de lápices: media muestral = 52 mm, IC del 95% = (50, 54)
* Esto indica que hay un 95% de confianza de que la longitud media poblacional esté entre 50 y 54 mm.

## **Resumen gráfico de pasos para el análisis del coeficiente de correlación**

1. **Calcular $r$** (coeficiente de correlación de Pearson)
2. **Interpretar $r$** (intensidad y dirección)
3. **Estimar intervalo de confianza** para ρ
4. **Formular hipótesis** $H_0$ y $H_1$
5. **Calcular estadístico t**
6. **Comparar con t crítico** y tomar decisión
