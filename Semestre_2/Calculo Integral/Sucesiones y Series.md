# Sucesiones y series
## Sucesiones
Una sucesion es una funcion cuyo dominio es el conjunto de los enteros positivos y en donde en lugar de emplear la notacion funcional de costumbre $f(n)$, se denota $a_{n}$ de la sucesion (elementos de rango) se forman haciendo que $n$ tome los valores de $1, 2, 3, \dots, n$ en el termino general de $a_{n}$, por lo tanto $a_{n}$ es el equivalente a $a_{1}, a_{2}, a_{3}, \dots a_{n}$.

Todo lo que tenga sub indice $n$ es una sucesion

Ejemplo:
> Escribir los 4 primeros terminos de la sucesion cuyo termino general son:
>
> 
>$$
a_{n} = \frac{1}{2n+3}
$$
$$
a_{1} = \frac{1}{2(1)+3} = \frac{1}{5}
$$
$$
a_{2} = \frac{1}{2(2)+3} = \frac{1}{7}
$$
$$
a_{3} = \frac{1}{2(3)+3} = \frac{1}{9}
$$
>$$
a_{n} = \frac{(-1)^nn^2}{n+1}
$$
$$
a_{1} = \frac{(-1)^{1}1^2}{1+1} = \frac{-1(1)}{2} = -\frac{1}{2}
$$
$$
a_{2} = \frac{(-1)^{2}2^2}{2+1} = \frac{4}{3}
$$
$$
a_{3} = \frac{(-1)^{3}3^2}{3+1} = \frac{(-1)(9)}{4} = -\frac{9}{4}
$$
$$
a_{4} = \frac{(-1)^{4}4^2}{4+1} = \frac{(1)(16)}{5} = \frac{16}{5}
$$
>$$a_{n} = \frac{(-1)^{n+1}(n+1)}{2n+1}$$

Se dice que una sucesion $a_{n}$ converge a un N°L si para toda $\epsilon>0$ existe un entero positivo N tal que n>N $|a_{n} - 1|< \epsilon$ siempre que n>N si $a_{n}$ es una sucesion convergente significa que los terminos $a_{n}$ se pueden acercar arbitrariamente a L para n suficientemente grande, indicamos que una sucesion es convergente escribiendo
$$
\lim_{  n \to \infty } a_{n} = L 
$$
Si no existe $L$ la sucesion es divergente.
Ejemplo:
> Determine si las siguiente convergen o divergen
> $$\frac{n}{2n-1}$$

$$
\lim_{ n \to \infty } \frac{n}{2n-1} = \lim_{ n \to \infty} \frac{\frac{n}{n}}{\frac{2n}{n}-\frac{1}{n}} = \lim_{ n \to \infty } \frac{1}{2-0} = \frac{1}{2}  
$$
## Series
### Notacion
$$\sum \text{sigma}$$
Es simplemente un metodo abreviado para designar **sumar** asi como:
$$x_{1} + x_{2} + x_{3}+ x_{4} + x_{5} = \sum_{i=1}^{5} x_{i}$$
---
Una serie es la suma de los terminos de una sucesion.

Entonces $a_{n}$ es una sucesion infinita ya con la sumatoria se le llama *serie infinita*
Una serie puede expresarse como la suma infinita de los elementos de una sucesion

$a_{n}$ -> sucesion infinita
$\sum_{n=1}^{\infty}a_{n}$ -> serie infinita

Cada numero $a_{i}$ se llama un termino de la serie, $a_{n}$ es el termino general o el termino enesimo
La enesima suma parcial de la serie anterior es
$$S_{n} = \sum_{n=1}^{\infty}a_{n}$$
Ejemplo:
Determinar la suma de secesiones parciales
$$
\sum_{n=1}^{\infty} \frac{3}{10^{n}}
$$
$S_{1} = \frac{3}{10¹}$
$S_{2} = \frac{3}{10¹}+\frac{3}{10^{2}}$
$S_{3} = \frac{3}{10¹}+\frac{3}{10^{2}}+\frac{3}{10^{3}}$
$S_{n} = \frac{3}{10¹}+\frac{3}{10^{2}}+\frac{3}{10^{3}}+\dots+\frac{3}{10^{n}}$

De este ejemplo vemos que cuando $n$ es muy grande dara una aproximacion a $\frac{1}{3}$ y de esta manera parece razonable escribir:
$$\frac{1}{3} = \lim_{ n \to \infty } S_{n} = \lim_{ n \to \infty } \sum_{k=1}^{n} \frac{3}{10^k}$$
Lo anterior conduce a la siguiente definicion
Se dice que una serie infinita es convergente si converge la sucesion de sumas parciales 

[Foto]

El numero $S$ es la suma de la serie; si este limite no existe entonces la serie es divergente y no tiene suma
Ejemplos:
Demostrar que 
$$
\sum_{k=1}^{\infty} \frac{1}{(k+4)(k+5)}
$$

A = 1;     B = -1

---
$$\sum_{n=1}^{\infty} \frac{1}{(3n-2)(3n+1)}$$
$$\frac{1}{(3n-2)(3n+1)} = \frac{A}{3n-2}+\frac{B}{3n+1}$$
$$\frac{1}{(3n-2)(3n+1)} = \frac{A(3n+1) + B(3n-2)}{(3n-2)(3n+1)}$$
$$1 = 3An+A+3Bn-2B$$
$$1=n(3A+3B) + A-2B$$
$3A+3B = 0$
$A-2B=1$
---
$A=1+2B$
$3(1+2B)+3B=0; \ \ 3+6B+3B=0$
$9B=-3$
$B = -\frac{1}{3}$
---
$A = 1 + 2(-\frac{1}{3}) = 1 - \frac{2}{3} = \frac{1}{3}$
$A=\frac{1}{3}$
$$\frac{1}{(3n-2)(3n+1)} = \frac{\frac{1}{3}}{3n-2}+\frac{-\frac{1}{3}}{3n+1}$$
$$\frac{1}{(3n-2)(3n+1)} = \frac{1}{3}\frac{1}{3n-2}-\frac{1}{3}\frac{1}{3n+1}$$
$$\frac{1}{(3n-2)(3n+1)} = \frac{1}{3}\left[ \frac{1}{3n-2}-\frac{1}{3n+1} \right]$$
$$S_{n} = \frac{1}{3}\left[ \frac{1}{3(1)-2}-\frac{1}{3(1)+1} \right]$$
$$S_{n} = \frac{1}{3}\left[ \frac{1}{1} - \frac{1}{4} \right] $$
$$S_{n} = \frac{1}{3}-\frac{1}{12}$$
$$S_{n}= \frac{3}{12}$$
