Aquí tienes el **resumen del subtema 6.2.3: Intervalo de confianza para una media**:

---

## **6.2.3 Intervalo de Confianza para una Media**

Cuando se desconoce la **media poblacional (μ)**, se puede **estimar** a partir de la **media de una muestra (𝑥̄)**.

### **Condiciones para aplicar el método:**

* Si la población es **normal** o si **n > 30**, se puede aplicar la distribución muestral de la media.
* Si **no se conoce la desviación típica poblacional (σ)**, se puede usar la **desviación estándar muestral (s)** cuando **n > 100**.

### **Fórmula del Intervalo de Confianza para la Media (con σ conocida):**

$$
\mu \in \left( \bar{x} - z_{\alpha/2} \cdot \frac{\sigma}{\sqrt{n}},\; \bar{x} + z_{\alpha/2} \cdot \frac{\sigma}{\sqrt{n}} \right)
$$

Donde:

* $\bar{x}$ = media muestral
* $\sigma$ = desviación típica de la población
* $n$ = tamaño de la muestra
* $z_{\alpha/2}$ = punto crítico según el nivel de confianza

> Este intervalo significa que **con un nivel de confianza (1 - α)**, el verdadero valor de la media poblacional está dentro del rango calculado.

---

### **Ejemplo práctico:**

**Datos:**

* $\bar{x} = 167 \, \text{cm}$
* $s = 8 \, \text{cm}$ (σ conocida)
* $n = 81$
* Nivel de confianza: 95% → $z_{\alpha/2} = 1.96$

**Cálculo del error estándar:**

$$
\frac{8}{\sqrt{81}} = \frac{8}{9} = 0.89
$$

**Intervalo de confianza:**

$$
167 \pm 1.96 \cdot 0.89 = 167 \pm 1.74
$$

$$
\Rightarrow \text{IC: } (165.26 \, \text{cm}, 168.74 \, \text{cm})
$$

---

Este intervalo indica que **con un 95% de confianza**, la estatura media de toda la población está entre **165.26 cm y 168.74 cm**.

¿Te gustaría que también te resuma el caso donde **σ es desconocida y se usa la distribución t de Student**?


Perfecto, aquí tienes el **resumen del caso cuando la desviación típica poblacional (σ) es desconocida** y se usa la **distribución t de Student**:

---

## **Intervalo de Confianza para una Media (con σ desconocida)**

Cuando no se conoce la desviación típica de la población (lo más común en la práctica), se sustituye **σ** por la **desviación estándar de la muestra (s)**, y en lugar de usar la distribución normal se utiliza la **distribución t de Student**, siempre que:

* La población sea normal o aproximadamente normal.
* O bien, el tamaño muestral **n ≤ 30**.
* Para muestras grandes (**n > 30**), se puede seguir usando z, pero también es válido usar t con más precisión.

---

### **Fórmula del intervalo de confianza (σ desconocida):**

$$
\mu \in \left( \bar{x} - t_{\alpha/2,\,df} \cdot \frac{s}{\sqrt{n}},\; \bar{x} + t_{\alpha/2,\,df} \cdot \frac{s}{\sqrt{n}} \right)
$$

Donde:

* $\bar{x}$ = media muestral
* $s$ = desviación estándar muestral
* $n$ = tamaño de la muestra
* $df = n - 1$ = grados de libertad
* $t_{\alpha/2, df}$ = valor crítico t para el nivel de confianza deseado y los grados de libertad

---

### **Interpretación:**

Este intervalo indica que, con un nivel de confianza (por ejemplo, 95%), el **verdadero valor de la media poblacional** está dentro del intervalo calculado usando la distribución t, lo cual **considera la variabilidad extra por no conocer σ**.

---

### **Nota importante:**

* Para encontrar el valor $t_{\alpha/2, df}$, se utiliza la **tabla t de Student** con el valor de **α/2** y **df = n – 1**.
* Cuanto más pequeña es la muestra, **más ancho** será el intervalo comparado con el que se obtiene usando la z.

---

¿Te gustaría que te resuma todo lo visto hasta ahora en una sola página o ficha de repaso rápida?

