# Investigación
### **Teorema del Valor Medio (TVM)**

Este teorema establece que si una función f(x)f(x) es continua en un intervalo cerrado [a,b][a, b] y diferenciable en el intervalo abierto (a,b)(a, b), entonces existe al menos un punto cc en (a,b)(a, b) donde la derivada de la función es igual a la pendiente de la secante que une los extremos del intervalo:

$$f'(c) = \frac{f(b) - f(a)}{b - a}$$

#### **Ejemplo**

Sea $f(x) = x^2$ en el intervalo $[1,3]$.

1. $f(1) = 1^2 = 1$
2. $f(3) = 3^2 = 9$
3. La pendiente de la secante es: $\frac{9 - 1}{3 - 1} = \frac{8}{2} = 4$ 
4. Derivamos $f(x)$: $f'(x) = 2x$
5. Igualamos con la pendiente: $2c = 4 \Rightarrow c = 2$

Por lo tanto, existe $c = 2$ en $(1,3)$ tal que $f'(c) = 4$, cumpliendo el TVM.

### **Función Primitiva**

Es una función $F(x)$ cuya derivada es igual a una función dada $f(x)$, es decir:

$F'(x) = f(x)$

Las funciones primitivas están relacionadas con la integración indefinida.

#### **Ejemplo**

Si $f(x) = 2x$, su función primitiva es:

$F(x) = \int 2x \,dx = x^2 + C$

donde CC es la constante de integración.
### **Teorema Fundamental del Cálculo (TFC)**

Conecta la derivación con la integración y tiene dos partes:

1. **Primera parte:** Si $f(x)$ es continua en $[a,b]$, entonces la integral definida de $f(x)$ se puede calcular con una función primitiva $F(x)$: $\int_a^b f(x) \,dx = F(b) - F(a)$
2. **Segunda parte:** Si $F(x)$ es una función definida como una integral de $f(x)$, entonces su derivada es la propia función $f(x)$:$\frac{d}{dx} \int_a^x f(t) \,dt = f(x)$

#### **Ejemplo (Primera parte)**

Calcular $\int_1^3 (2x) \,dx$.

1. La primitiva es $(x) = x^2$.
2. Evaluamos: $F(3) - F(1) = 3^2 - 1^2 = 9 - 1 = 8$

Por lo tanto, $\int_1^3 2x \,dx = 8$.
