# Distribución binomial
### 🔍 ¿Qué es una distribución binomial?

Es una distribución de probabilidad **discreta** que describe el número de éxitos en una cantidad fija de ensayos independientes, donde cada ensayo tiene sólo **dos posibles resultados**: **éxito** o **fracaso**.

---

### 📝 Datos del ejemplo:

- Un examen tiene **4 preguntas** de **Verdadero o Falso**.
- El estudiante **no sabe nada**, por lo tanto, responde **al azar**.
- Entonces, la probabilidad de **adivinar correctamente** una respuesta es:
  $$p = 0.5 \quad \text{(éxito)}$$
  y la de fallarla:
  $$q = 1 - p = 0.5 \quad \text{(fracaso)}$$
- El número total de preguntas (ensayos): \( n = 4 \)

---

### 📌 Fórmula de la distribución binomial:
$$
P(x) = \binom{n}{x} \cdot p^x \cdot q^{n-x}$$

Donde:
- $\binom{n}{x}$ = combinaciones (cuántas formas de obtener x éxitos)
- \( p \) = probabilidad de éxito
- \( q \) = probabilidad de fracaso
- \( x \) = número de éxitos

---

### ✅ a) Probabilidad de obtener **ninguna** respuesta correcta:

Aquí, \( x = 0 \)

$$
P(0) = \binom{4}{0} \cdot (0.5)^0 \cdot (0.5)^4 = 1 \cdot 1 \cdot 0.0625 = 0.0625
$$

👉 **6.25%** de probabilidad de no acertar ninguna pregunta.

---

### ✅ b) Probabilidad de obtener **una** respuesta correcta:

Aquí, \( x = 1 \)
$$
P(1) = \binom{4}{1} \cdot (0.5)^1 \cdot (0.5)^3 = 4 \cdot 0.5 \cdot 0.125 = 0.25
$$
👉 **25%** de probabilidad de acertar solo una pregunta.

---

### ✅ c) Probabilidad de obtener 0, 1, 2, 3 o 4 respuestas correctas:

Se calculan todas las probabilidades posibles:

| x (respuestas correctas) | $\binom{4}{x}$ | Cálculo                                    | Resultado |
| ------------------------ | -------------- | ------------------------------------------ | --------- |
| 0                        | 1              | $$1 \cdot (0.5)^0 \cdot (0.5)^4 = 0.0625$$ | 0.0625    |
| 1                        | 4              | $$4 \cdot (0.5)^1 \cdot (0.5)^3 = 0.25 $$  | 0.25      |
| 2                        | 6              | $$6 \cdot (0.5)^2 \cdot (0.5)^2 = 0.375$$  | 0.375     |
| 3                        | 4              | $$4 \cdot (0.5)^3 \cdot (0.5)^1 = 0.25 $$  | 0.25      |
| 4                        | 1              | $$1 \cdot (0.5)^4 \cdot (0.5)^0 = 0.0625$$ | 0.0625    |

📊 La suma total es:
$$0.0625 + 0.25 + 0.375 + 0.25 + 0.0625 = 1.00$$

Esto significa que **todas las probabilidades están bien calculadas**.

---

### 📈 ¿Qué muestra la distribución?

Dado que \( p = 0.5 \), la distribución binomial es **simétrica**. Es decir, es más probable tener 2 respuestas correctas que 0 o 4, y las probabilidades bajan hacia los extremos.
