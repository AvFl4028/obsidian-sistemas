Claro, aquí tienes un **resumen del subtema "Teorema del Límite Central"** con los puntos clave explicados de forma clara y concisa:

---

### **Resumen: Teorema del Límite Central (TLC)**

El **Teorema del Límite Central (TLC)** es uno de los conceptos fundamentales en estadística. Establece que:

> **La distribución de las medias muestrales tiende a ser normal** (campana de Gauss), **aunque la distribución original de la población no lo sea**, siempre que el tamaño de la muestra sea suficientemente grande.

---

### **Importancia del Teorema del Límite Central**

Conocer la distribución de los estadísticos (como la media muestral) permite:

* Inferir propiedades de la **población a partir de una muestra**.
* **Medir el error** que puede tener esa inferencia.
* **Cuantificar la confianza** de que ese sea el error real.

---

### **Condiciones del Teorema**

Si tomamos muchas muestras aleatorias de tamaño $n$, con media poblacional $\mu$ y varianza $\sigma^2$, entonces:

* La media de las muestras ($\overline{x}$) seguirá una **distribución aproximadamente normal**.
* La **media de esa distribución será $\mu$**.
* La **varianza será $\sigma^2/n$**.

Esto se cumple **independientemente de la forma original** de la población.

---

### **Tamaño de muestra recomendado**

El tamaño necesario para que se aplique el TLC depende de la forma de la población:

* **Distribución simétrica**: con $n = 5$ puede bastar.
* **Distribución asimétrica**: se recomienda $n \geq 30$ o más.
* **Distribución normal**: bastan muestras de $n \geq 10$.

---

### **Aplicación práctica**

* Permite aplicar técnicas estadísticas basadas en la normalidad a datos que originalmente no siguen una distribución normal.
* Se usa para **calcular el tamaño de muestra adecuado** y **construir intervalos de confianza**.
* Muy útil en investigación científica, encuestas, calidad industrial, etc.

---

### **Error estándar de la media**

Es la desviación estándar de la distribución de las medias muestrales:

$$
\sigma_{\overline{x}} = \frac{\sigma}{\sqrt{n}}
$$

Indica qué tanto puede variar la media muestral respecto a la media real $\mu$.

---

### **Versión formal del Teorema**

Para variables aleatorias $X_1, X_2, ..., X_n$ con media $\mu$ y varianza $\sigma^2$, el TLC dice que:

$$
\lim_{n \to \infty} P\left( \frac{S_n - n\mu}{\sigma\sqrt{n}} \le z \right) = \Phi(z)
$$

donde $\Phi(z)$ es la función de distribución normal estándar.

---

¿Te gustaría que te hiciera un mapa conceptual o cuadro sinóptico con esta información?

