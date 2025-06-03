# Regresion y Correlacion
## 🔍 **Resumen: Regresión y Correlación**

En la vida diaria y en el ámbito profesional, se toman decisiones basadas en **predicciones** de eventos futuros. Para hacer estas predicciones, se analiza la relación entre datos conocidos y valores por estimar.
### 📈 **Regresión**

- Es una técnica estadística que busca establecer una **ecuación matemática** entre dos o más variables.
- Se usa para **predecir el valor de una variable dependiente (Y)** con base en el valor conocido de una **variable independiente (X)**.
- La **ecuación de regresión lineal simple** es de la forma:
$$\hat{y} = a + b x$$
- Esta ecuación se obtiene ajustando la **recta que mejor se aproxima a los datos** del diagrama de dispersión.    
- El término “regresión” fue usado por **Francis Galton** al estudiar cómo los hijos de padres altos tendían a acercarse a la estatura media.
### 🔗 **Correlación**

- Una vez obtenida la ecuación de regresión, se analiza el **grado de relación** entre las variables con la **correlación**.
    
- El coeficiente de correlación mide:
    
    - **Fuerza** de la relación.
        
    - **Dirección** (positiva o negativa).
        
- Valores cercanos a **+1 o -1** indican relaciones fuertes; cercanos a **0**, indican relaciones débiles o nulas.
### ✅ **Importancia**
- Permite **tomar decisiones basadas en datos**.
- Se aplica en muchas áreas: negocios, salud, ingeniería, economía, etc.
- Se puede usar una o varias variables independientes para mejorar la precisión.
## 📌 **Conceptos Clave**

- **Variable independiente (X)**: conocida, usada para predecir.  
- **Variable dependiente (Y)**: se desea estimar.
- **Efecto de regresión**: tendencia de valores extremos a acercarse a la media con el tiempo.
## 🧮 **Ejemplo de Regresión y Correlación**

Supón que una empresa desea predecir las **ventas ($Y$ en miles de pesos)** en función de la **inversión en publicidad ($X$ en miles de pesos)** durante 5 semanas.

|Semana|Inversión en Publicidad (X)|Ventas (Y)|
|---|---|---|
|1|2|4|
|2|4|6|
|3|6|7|
|4|8|10|
|5|10|13|

---

### 🔢 **Paso 1: Calcular los valores necesarios**

Usamos estas fórmulas para calcular la **pendiente (b)** y el **intercepto (a)** de la recta de regresión:

$$b = \frac{n \sum xy - \sum x \sum y}{n \sum x^2 - (\sum x)^2}
$$
$$a = \frac{\sum y - b \sum x}{n}$$
Primero, completamos esta tabla:

| X     | Y      | XY      | X²      |
| ----- | ------ | ------- | ------- |
| 2     | 4      | 8       | 4       |
| 4     | 6      | 24      | 16      |
| 6     | 7      | 42      | 36      |
| 8     | 10     | 80      | 64      |
| 10    | 13     | 130     | 100     |
| **Σ** | **40** | **284** | **220** |

$n=5$,  
$\sum x = 30$,  
$\sum y = 40$,  
$\sum xy = 284$,  
$\sum x^2 = 220$

### 🧮 **Paso 2: Sustituimos en las fórmulas**
$$b = \frac{5(284) - 30(40)}{5(220) - 30^2} = \frac{1420 - 1200}{1100 - 900} = \frac{220}{200} = 1.1 
$$$$a = \frac{40 - 1.1(30)}{5} = \frac{40 - 33}{5} = \frac{7}{5} = 1.4
$$
### 📈 **Ecuación de la regresión**

$$\hat{y} = 1.4 + 1.1x$$
### 📊 **Paso 3: Pronóstico**
Supón que la empresa planea invertir **$7,000** (es decir, $x = 7$). ¿Cuáles serán las ventas esperadas?
$$\hat{y} = 1.4 + 1.1(7) = 1.4 + 7.7 = 9.1
$$
**✅ Las ventas estimadas serían $9,100.**
### 📈 **Paso 4: Calcular el coeficiente de correlación (r)**

$$r = \frac{n \sum xy - \sum x \sum y}{\sqrt{(n \sum x^2 - (\sum x)^2)(n \sum y^2 - (\sum y)^2)}}
$$
Primero necesitamos $\sum y^2$:

|Y|Y²|
|---|---|
|4|16|
|6|36|
|7|49|
|10|100|
|13|169|
|**Σ**|**370**|

$$r = \frac{5(284) - 30(40)}{\sqrt{(5(220) - 30^2)(5(370) - 40^2)}} = \frac{220}{\sqrt{200 \cdot 250}} = \frac{220}{\sqrt{50000}} = \frac{220}{223.6} \approx 0.984
$$

### 📌 **Interpretación final**

- La relación entre inversión y ventas es **positiva y muy fuerte** (r ≈ 0.984).
- La recta de regresión permite hacer predicciones con buena precisión.
- Una mayor inversión en publicidad está fuertemente asociada con un aumento en las ventas.