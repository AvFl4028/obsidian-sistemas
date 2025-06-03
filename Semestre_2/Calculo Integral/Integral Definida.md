# Integral definida
## **Definición de la Integral Definida**

La integral definida de una función f(x) en un intervalo $[a, b]$ se denota como:

$$\int_{a}^{b} f(x) \,dx$$

y se define como el **límite de la suma de Riemann**, es decir:

$$\int_{a}^{b} f(x) \,dx = \lim_{{n \to \infty}} \sum_{i=1}^{n} f(x_i^*) \Delta x$$

donde:

- $[a,b]$ es el intervalo de integración.
- $\Delta x$ es la anchura de cada subintervalo.
- $xi∗x_i^*$ es un punto dentro de cada subintervalo.
- La suma de Riemann aproxima el área bajo la curva de f(x)f(x) en el intervalo dado.

---

## **Interpretación Geométrica**

La integral definida representa **el área bajo la curva** $y = f(x)$ en el intervalo $[a, b]$, con las siguientes consideraciones:

- Si f(x) es positiva en $[a,b]$, la integral representa el área bajo la curva y por encima del eje x.
- Si f(x) es negativa en $[a, b]$, la integral representa el área, pero con signo negativo.
- Si la función cruza el eje x, la integral suma las áreas positivas y negativas (por lo que puede dar cero sin que el área real sea cero).

---

## **Propiedades de la Integral Definida**

1. **Linealidad**
    
    $$\int_{a}^{b} [c f(x) + d g(x)] dx = c \int_{a}^{b} f(x) dx + d \int_{a}^{b} g(x) dx$$
    
    donde $c, d$ son constantes.
    
2. **Adición de intervalos**
    
    $$\int_{a}^{c} f(x) dx + \int_{c}^{b} f(x) dx = \int_{a}^{b} f(x) dx$$
3. **Si la función es constante**
    
    $$\int_{a}^{b} c \,dx = c(b - a)$$
4. **Cambio de límites de integración (Integral negativa)**
    
    $$\int_{a}^{b} f(x) dx = -\int_{b}^{a} f(x) dx$$
5. **Si f(x) es mayor o igual que g(x) en  $[a, b]$, entonces:**
    
    $$\int_{a}^{b} f(x) dx \geq \int_{a}^{b} g(x) dx$$
6. **Integral de una función impar en intervalos simétricos**  
    Si f(x) es impar $f(-x) = -f(x)$ y el intervalo es simétrico $[−a,a]$, entonces:
    
    $$\int_{-a}^{a} f(x) dx = 0$$

---

## **Métodos de Cálculo de Integrales Definidas**

Para resolver una integral definida, se siguen estos pasos:

7. **Encontrar la primitiva** F(x) de f(x).
8. **Evaluar** en los límites de integración usando la regla:$$ \int_{a}^{b} f(x) dx = F(b) - F(a)$$

Los métodos más usados para integrar incluyen:

- **Reglas básicas de integración**
- **Sustitución** (Cambio de variable)
- **Integración por partes**
- **Integrales trigonométricas y racionales**
- **Método de fracciones parciales**
