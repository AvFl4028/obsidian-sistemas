# Distribucion Hipergeometrica
Vamos a **explicar paso a paso este ejemplo** de distribución **hipergeométrica**, que es ideal cuando:

- Tienes una **población finita**.
- Se hace una **selección sin reemplazo**.
- Y hay una **categoría de interés** ("éxito").

---
### 🔷 Situación:
Hay 8 personas:  
- 3 **informáticos** (éxitos)  
- 5 **de sistemas** (no éxitos)

Se selecciona un comité de 5 personas al azar.

---

## a) **Distribución de probabilidad:**
Queremos saber la probabilidad de que haya **0, 1, 2 o 3 informáticos** en el comité.

### 🔹 Fórmula de la distribución hipergeométrica:
$$P(X = x) = \frac{\binom{a}{x} \cdot \binom{N - a}{n - x}}{\binom{N}{n}}
$$
Donde:
- \( N = 8 \): Total de personas
- \( a = 3 \): Total de informáticos (éxitos)
- \( n = 5 \): Tamaño del comité
- \( x \): Número de informáticos en el comité

---

### 🔸 Cálculos:

| x (informáticos) | Fórmula aplicada                                          | Resultado (fracción)      | Probabilidad        |
| ---------------- | --------------------------------------------------------- | ------------------------- | ------------------- |
| 0                | $$\frac{\binom{3}{0} \cdot \binom{5}{5}}{\binom{8}{5}}$$  | $$\frac{1 \cdot 1}{56}$$  | **0.0178** (1.78%)  |
| 1                | $$\frac{\binom{3}{1} \cdot \binom{5}{4}}{\binom{8}{5}} $$ | $$\frac{3 \cdot 5}{56}$$  | **0.2678** (26.78%) |
| 2                | $$\frac{\binom{3}{2} \cdot \binom{5}{3}}{\binom{8}{5}}$$  | $$\frac{3 \cdot 10}{56}$$ | **0.5357** (53.57%) |
| 3                | $$\frac{\binom{3}{3} \cdot \binom{5}{2}}{\binom{8}{5}}$$  | $$\frac{1 \cdot 10}{56}$$ | **0.1785** (17.85%) |

🔹 **Verifica**:  
La suma total de probabilidades es casi 1 (por redondeo):  
$$0.0178 + 0.2678 + 0.5357 + 0.1785 = 0.9998 \approx 1$$

---

## b) **Media o valor esperado**:

$$
\mu = E(X) = n \cdot \frac{a}{N}
$$
$$\mu = 5 \cdot \frac{3}{8} = 1.875
$$

🔹 **Interpretación**: En promedio, se espera que haya **1.875 informáticos** por comité.

---

## c) **Varianza y desviación estándar**:
$$\text{Var}(X) = \sigma^2 = \frac{n \cdot a \cdot (N - a) \cdot (N - n)}{N^2 (N - 1)}
$$

$$\sigma^2 = \frac{5 \cdot 3 \cdot 5 \cdot 3}{8^2 \cdot 7} = \frac{225}{448} = 0.5022
$$
$$
\sigma = \sqrt{0.5022} = 0.7086$$

---

### ✅ Interpretación:
> La varianza (0.5022) y la desviación estándar (0.7086) nos indican qué tanto varía el número de informáticos en el comité. Como la desviación estándar es menor a 1, eso significa que la cantidad de informáticos no varía demasiado y la mayoría de los comités tendrán entre 1 y 3 informáticos.
