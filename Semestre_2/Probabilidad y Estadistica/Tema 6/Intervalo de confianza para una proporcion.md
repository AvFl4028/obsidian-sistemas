Aquí tienes un resumen claro y directo del subtema **6.2.4 Intervalo de Confianza para una Proporción**:

---

## **Intervalo de Confianza para una Proporción (p)**

### **¿Qué se busca?**

Estimar la proporción **p** de una población (por ejemplo, defectuosos, votos, preferencias, etc.) a partir de una muestra de tamaño **n** con proporción observada **p'**.

---

### **Distribución muestral:**

Cuando el tamaño de la muestra es grande (**n > 100**), la distribución muestral de la proporción se aproxima a una **distribución normal**:

$$
p' \sim N\left(p, \sqrt{\frac{p \cdot q}{n}}\right)
$$

Donde:

* $p'$ = proporción muestral
* $p$ = proporción poblacional (desconocida)
* $q = 1 - p$
* Como **p** es desconocido, se usa **p'** para estimarlo
* $\sqrt{\frac{p' \cdot q'}{n}}$ = error estándar de la proporción

---

### **Fórmula del intervalo de confianza:**

$$
p \in \left(p' - z_{\alpha/2} \cdot \sqrt{\frac{p' \cdot q'}{n}},\; p' + z_{\alpha/2} \cdot \sqrt{\frac{p' \cdot q'}{n}}\right)
$$

Donde:

* $z_{\alpha/2}$ = valor crítico de z para el nivel de confianza deseado (por ejemplo, 1.96 para 95%)
* $p'$ = proporción observada en la muestra
* $q' = 1 - p'$

---

### **Ejemplo aplicado:**

* Muestra: 7 defectuosos de 200 piezas → $p' = 0.035$
* $q' = 1 - 0.035 = 0.965$
* Nivel de confianza: 99% → $z_{\alpha/2} = 2.575$
* Error estándar: $\sqrt{(0.035)(0.965)/200} \approx 0.013$

$$
IC = (0.035 - 2.575 \cdot 0.013,\; 0.035 + 2.575 \cdot 0.013) = (0.002,\; 0.068)
$$

→ Con un **99% de confianza**, la proporción real de piezas defectuosas está entre **0.2% y 6.8%**.

---

### **Valores críticos comunes (zα/2):**

| Nivel de confianza | α    | α/2   | zα/2  |
| ------------------ | ---- | ----- | ----- |
| 90%                | 0.10 | 0.05  | 1.645 |
| 95%                | 0.05 | 0.025 | 1.960 |
| 99%                | 0.01 | 0.005 | 2.576 |

---

¿Quieres que te una todos los subtemas (media con σ conocida, σ desconocida y proporción) en una sola tabla o ficha final?

