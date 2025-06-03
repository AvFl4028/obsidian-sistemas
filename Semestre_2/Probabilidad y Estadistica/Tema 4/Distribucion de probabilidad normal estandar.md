# Distribucion de probabilidad normal estandar
La **distribución de probabilidad normal estándar** (o **normal tipificada**) es una **forma especial de la distribución normal** que tiene dos características clave:
### ✅ **Definición:**

> Es una **distribución normal** con **media (μ) igual a 0** y **desviación estándar (σ) igual a 1**.
### 📈 **Características principales:**

- **Simétrica** respecto al eje vertical que pasa por la media (0).
- **Campana perfecta**: los valores más cercanos a la media son los más probables.
- **Área total bajo la curva** = 1 (es una función de probabilidad).
- Se usa para **estandarizar datos** de cualquier distribución normal general.
### 🔢 **Fórmula de la distribución normal estándar:**

$$f(z) = \frac{1}{\sqrt{2\pi}} e^{-z^2/2}
$$

Donde:
- \( z \) es el **valor estandarizado** (z-score),
- \( e \) es la constante de Euler,
- \( $\pi$ \) es pi.
### 🧮 ¿Qué es el **z-score**?

El **z-score** permite convertir cualquier valor \( x \) de una distribución normal general en su equivalente en la normal estándar:

$$z = \frac{x - \mu}{\sigma}
$$

Donde:
- \( x \): valor original,
- \( $\mu$ \): media de la distribución original,
- \( $\sigma$ \): desviación estándar original.

---

### 🎯 ¿Para qué se usa?

- Para **calcular probabilidades** y áreas bajo la curva normal sin depender de la media y desviación estándar originales.
- Para consultar valores en la **tabla Z** (tabla de distribución normal estándar).
- Se usa ampliamente en estadística, control de calidad, pruebas estandarizadas, etc.

### ✅ **Ejemplo:**

> Supón que las alturas de los estudiantes de una universidad siguen una distribución normal con:
> - Media (μ) = 170 cm  
> - Desviación estándar (σ) = 10 cm  
>
> ¿Cuál es la **probabilidad de que un estudiante mida menos de 180 cm**?

#### 🔹 Paso 1: Estandarizar el valor con la fórmula del z-score

Queremos saber la probabilidad de que **X < 180 cm**.
$$z = \frac{x - \mu}{\sigma} = \frac{180 - 170}{10} = 1.0
$$
Entonces:  
$$P(X < 180) = P(Z < 1.0)
$$
#### 🔹 Paso 2: Usar la **tabla Z** o una calculadora

Buscamos el valor de \( P(Z < 1.0) \) en la **tabla de distribución normal estándar**.

📘 En la tabla, para **Z = 1.0**, la probabilidad es:

$$
P(Z < 1.0) = 0.8413$$
#### ✅ **Resultado final:**

> La **probabilidad de que un estudiante mida menos de 180 cm** es de **0.8413**, o sea, **84.13%**.
#### 🧠 ¿Qué significa esto?

- Si eliges un estudiante al azar, **hay un 84.13% de probabilidad** de que su altura sea menor a 180 cm.
- Como 180 cm está por encima del promedio (170 cm), tiene sentido que sea un valor probable pero no el más común.