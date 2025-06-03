# Regresión lineal simple
Aquí tienes un **resumen claro y completo del subtema "Regresión Lineal Simple"**:

---

### **Regresión Lineal Simple: Resumen**

La **regresión lineal simple** es una técnica estadística que permite **estimar o predecir** el valor de una **variable dependiente (Y)** con base en el valor de una **variable independiente (X)**. Esta relación se representa mediante una **línea recta** cuya ecuación es:

$$
\hat{Y} = a + bX
$$

* **a**: Intersección o "ordenada al origen", donde la línea cruza el eje Y.
* **b**: Pendiente de la línea, indica cuánto cambia Y cuando X varía en una unidad.
* **X**: Variable independiente o explicativa.
* **Y**: Variable dependiente o explicada.
* **$\hat{Y}$**: Valor estimado de Y.

### **Tipos de relación**

* **Directa**: la pendiente $b > 0$; cuando X aumenta, Y también.
* **Inversa**: la pendiente $b < 0$; cuando X aumenta, Y disminuye.

---

### **Cálculo de la recta de regresión: Método de Mínimos Cuadrados (MMC)**

Este método encuentra la línea que **mejor se ajusta a los datos**, minimizando la suma de los cuadrados de los errores (distancias verticales entre puntos reales y estimados).

Fórmulas clave:

* Pendiente $b$:

  $$
  b = \frac{n\sum XY - \sum X \sum Y}{n\sum X^2 - (\sum X)^2}
  $$
* Intersección $a$:

  $$
  a = \bar{Y} - b\bar{X}
  $$

Una vez calculados a y b, se sustituye en la ecuación general para predecir valores de Y con cualquier valor de X.

---

### **Ejemplo práctico**

Dado un conjunto de ambulancias con datos de **edad (X)** y **costos de reparación (Y)**, se obtuvo la ecuación:

$$
\hat{Y} = 3.75 + 0.75X
$$

Si una ambulancia tiene 4 años:

$$
\hat{Y} = 3.75 + 0.75(4) = 6.75
$$

Se estima un gasto de reparación de **\$675.00**.

---

### **Error estándar de estimación (Se)**

Mide qué tan dispersos están los puntos reales respecto a la línea de regresión:

$$
Se = \sqrt{ \frac{\sum Y^2 - a\sum Y - b\sum XY}{n - 2} }
$$

Interpretación:

* Si **Se = 0**, todos los puntos están sobre la recta: estimación perfecta.
* Cuanto mayor el Se, **mayor la dispersión** y menor precisión en las predicciones.

**Suposiciones** del modelo:

1. Los errores tienen distribución normal.
2. La varianza es constante para todos los valores de X.
3. Las observaciones son independientes entre sí.

---

Este resumen incluye lo esencial para entender, aplicar y calcular una regresión lineal simple en un contexto práctico y estadístico. ¿Te gustaría que lo transforme en un cuadro sinóptico o mapa conceptual?
