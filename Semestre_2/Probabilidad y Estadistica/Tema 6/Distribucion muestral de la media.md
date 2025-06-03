Aquí tienes un **resumen claro y completo** del subtema **Distribución muestral de la media**:

---

### **Distribución Muestral de la Media – Resumen**

**1. Concepto General**
La **distribución muestral de la media** es la distribución de todas las posibles medias que se pueden obtener al tomar muestras del mismo tamaño (n) de una población. Cada muestra tiene su propia media, y al analizarlas como una variable aleatoria, se forma una nueva distribución: **la distribución muestral**.

---

**2. Características Clave**

* **Media de la distribución muestral**: es igual a la media poblacional (μ).
* **Desviación estándar de la distribución muestral (error típico)**: se calcula como

  $$
  \sigma_{\bar{x}} = \frac{\sigma}{\sqrt{n}}
  $$

  donde σ es la desviación típica de la población y n el tamaño de la muestra.

---

**3. Forma de la Distribución**

* Si la población tiene distribución normal, la distribución muestral de la media también será normal, independientemente del tamaño de la muestra.
* Si la población **no es normal** pero el tamaño de la muestra es **mayor a 30 (n > 30)**, por el **Teorema Central del Límite**, la distribución muestral de la media se aproxima a una normal.

---

**4. Ejemplo Práctico**
Dada una población normal con **μ = 5.8** y **σ = 2.4**, y una muestra de **n = 16**, la distribución muestral será:

$$
\bar{x} \sim N\left(5.8, \frac{2.4}{\sqrt{16}} \right) = N(5.8, 0.6)
$$

Se busca la probabilidad de que la media de una muestra esté entre 5 y 7. Se transforma a valores Z:

$$
z_1 = \frac{5 - 5.8}{0.6} = -1.33,\quad z_2 = \frac{7 - 5.8}{0.6} = 2
$$

Con tabla Z:

$$
P(5 \leq \bar{x} \leq 7) = P(-1.33 \leq Z \leq 2) = 0.9772 - 0.0918 = 0.8854
$$

**Resultado**: Hay un **88.54% de probabilidad** de que la media de las notas de una muestra aleatoria de 16 estudiantes esté entre 5 y 7.

---

¿Te gustaría que prepare una hoja de fórmulas o un resumen visual (tipo mapa o cuadro) sobre este tema?
