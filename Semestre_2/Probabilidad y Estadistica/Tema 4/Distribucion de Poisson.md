# Distribucion de Poisson
### 🧠 **Primero: ¿Qué es la distribución de Poisson?**

Es una distribución de probabilidad que se usa para contar **el número de veces que ocurre un evento** en un **intervalo fijo** de tiempo o espacio, cuando:
- Ocurre en promedio cierta cantidad de veces por intervalo,
- Los eventos son independientes,
- No ocurren dos eventos a la vez (uno por uno),
- La tasa de ocurrencia es constante.

La fórmula es:

$$
P(x;\lambda) = \frac{\lambda^x \cdot e^{-\lambda}}{x!}
$$

Donde:
- \( x \) = número de eventos que quieres calcular,
- \( $\lambda$ \) = número promedio de eventos en el intervalo,
- \( $e \approx 2.71828$ \),
- \( $x!$ \) = factorial de x.

---

### 📘 **En este ejemplo:**

- **Llegan 24 autobuses por hora.**
- Queremos saber qué pasa en **5 minutos**.
- Entonces, necesitamos ajustar ese promedio de llegada a **5 minutos**.

$$
\lambda = \left(\frac{24 \text{ autobuses}}{60 \text{ minutos}}\right) \cdot 5 \text{ minutos} = 2 \text{ autobuses cada 5 minutos}
$$

---

## 🔢 A) ¿Cuál es la probabilidad de que **no llegue ningún autobús** en 5 minutos?

Usamos \( x = 0 \), \( $\lambda = 2$ \):
$$P(0;2) = \frac{2^0 \cdot e^{-2}}{0!} = \frac{1 \cdot 0.1353}{1} = 0.1353
$$

👉 **13.53% de probabilidad**

---

## 🚍 B) ¿Probabilidad de que lleguen **exactamente 2 autobuses**?

Usamos \( x = 2 \), \( $\lambda = 2$ \):
$$
P(2;2) = \frac{2^2 \cdot e^{-2}}{2!} = \frac{4 \cdot 0.1353}{2} = 0.2707$$

👉 **27.07% de probabilidad**

---

## ➕ C) ¿Probabilidad de que lleguen **más de 2 autobuses**?

Eso es:
$$P(x > 2) = 1 - [P(0) + P(1) + P(2)]
$$
Sabemos:
- \( P(0) = 0.1353 \)
- \( P(1) = $\frac{2^1 \cdot e^{-2}}{1!} = 0.2706$ \)
- \( P(2) = 0.2707 \)

Entonces:


$$P(x > 2) = 1 - (0.1353 + 0.2706 + 0.2707) = 1 - 0.6766 = 0.3234
$$

👉 **32.34% de probabilidad**

Esto también lo puedes calcular sumando desde \( x = 3 \) hasta el infinito, pero como los valores se hacen muy pequeños, basta con cortar en \( x = 24 \) en este ejemplo.

---

## 📊 D) Media, Varianza y Desviación Estándar

En la distribución de Poisson, **todos estos se relacionan directamente con \( \lambda \)**:

- **Media (Esperanza):**

$$  \mu = \lambda = 2
$$
- **Varianza:**

$$  \sigma^2 = \lambda = 2
$$
- **Desviación estándar:**
  $$
  \sigma = \sqrt{\lambda} = \sqrt{2} = 1.4142
$$
---

## ✅ Resumen:

| Pregunta | Resultado |
|---------|-----------|
| a) \( P(x=0) \) | 0.1353 |
| b) \( P(x=2) \) | 0.2707 |
| c) \( P(x > 2) \) | 0.3234 |
| Media (μ) | 2 |
| Varianza (σ²) | 2 |
| Desviación estándar (σ) | 1.4142 |
## 📘 **Ejemplo: Distribución de Poisson**

> Una librería recibe en promedio **3 clientes por hora**.  
> ¿Cuál es la **probabilidad de que lleguen exactamente 5 clientes en una hora**?

---

### ✅ Paso 1: Identifica los datos

- \( \lambda = 3 \): número promedio de clientes por hora  
- \( x = 5 \): número exacto de clientes que queremos calcular  
- Fórmula de Poisson:

$$P(x; \lambda) = \frac{\lambda^x \cdot e^{-\lambda}}{x!}
$$

---

### ✅ Paso 2: Sustituimos en la fórmula


$$P(5; 3) = \frac{3^5 \cdot e^{-3}}{5!}
$$

- \( $3^5 = 243$ \)  
- \( $e^{-3} \approx 0.0498$ \)  
- \( 5! = 120 \)


$$P(5; 3) = \frac{243 \cdot 0.0498}{120} \approx \frac{12.105}{120} \approx 0.1009$$
### ✅ Resultado:

> La **probabilidad de que lleguen exactamente 5 clientes en una hora** es aproximadamente **0.1009** o **10.09%**.

### 🧠 Interpretación:

Esto significa que, aunque en promedio llegan 3 clientes por hora, **es posible (10.09%) que en una hora lleguen exactamente 5 clientes**.