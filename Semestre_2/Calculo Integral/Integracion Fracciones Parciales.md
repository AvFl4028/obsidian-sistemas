# Integracion por fracciones parciales
Si $P(x)$ y $Q(x)$ sean polinomios, su cociente $R(x) = \frac{P(x)}{Q(x)}$ es una funcion racional sea $R(x)$ siendo funcion racional propia 
Para obtener $\int R(x)\ dx$. Revisar $Q(x)$
Existen 4 tipos:
Factores lineales repetidos. Para cada factor escribe el termino $\frac{A}{ax + b}$
Ejemplo:
$$
\int \frac{2x -4}{x^2 + 3x + 2}\ dx
$$
$$
\int \frac{2x -4}{(x+2)(x+1)}\ dx
$$
$$
\frac{2x -4}{(x+2)(x+1)} = \frac{A}{x+2} + \frac{B}{x+1}
$$
$$
\frac{A}{x+2} + \frac{B}{x+1} = \frac{A(x+1)+B(x+2)}{(x+2)(x+1)} = \frac{Ax + A + Bx + 2B}{(x+2)(x+1)}
$$
$$
\frac{2x -4}{(x+2)(x+1)}=\frac{Ax + A + Bx + 2B}{(x+2)(x+1)}
$$
$$
\frac{2x -4}{(x+2)(x+1)}=\frac{Ax + Bx+ A + 2B}{(x+2)(x+1)}
$$
$$
(x+2)(x+1)\frac{2x -4}{(x+2)(x+1)}=Ax + Bx+ A + 2B
$$
$$
2x -4=x(A + B)+ A + 2B
$$
---
Se resuelve las ecuaciones
$A+B = 2$
$A+2B = -4$

$-A-B=-2$
$A+2B = -4$

$B = -6$

$A = 2-B$
$A = 2-(-6)=2+6=8$

---
Sustituir e integrar
$$\frac{2x -4}{(x+2)(x+1)} = \frac{8}{x+2} - \frac{6}{x+1}$$

$$\int \frac{2x -4}{(x+2)(x+1)}\ dx = \int \frac{8}{x+2}\ dx - \int \frac{6}{x+1}\ dx$$
$$\int \frac{2x -4}{(x+2)(x+1)}\ dx = 8 \ln (x+2) - 6\ln (x+1)+ C$$
$$\int \frac{2x -4}{(x+2)(x+1)}\ dx = \ln (x+2)^{8} - \ln (x+1)^{6}+ C$$
$$\int \frac{2x -4}{(x+2)(x+1)}\ dx = \ln \frac{(x+2)^{8}}{(x+1)^{6}} + C$$
---
$$
\int \frac{-3x + 5}{x^2-5x+6}\ dx = \int \frac{-3x + 5}{(x-2)(x-3)}\ dx
$$
$$
\frac{-3x + 5}{(x-2)(x-3)} = \frac{A}{x-2} + \frac{B}{x-3}
$$
$$
\frac{A}{x-2} + \frac{B}{x-3} = \frac{A(x-3)+B(x-2)}{(x-2)(x-3)} = \frac{Ax-3A+Bx-2B}{(x-2)(x-3)}
$$
$$
\frac{Ax-3A+Bx-2B}{(x-2)(x-3)} = \frac{x(A+B)-3A-2B}{(x-2)(x-3)}
$$
$$
\frac{-3x + 5}{(x-2)(x-3)}=\frac{x(A+B)-3A-2B}{(x-2)(x-3)}
$$
$$
(x-2)(x-3)\frac{-3x + 5}{(x-2)(x-3)}=x(A+B)-3A-2B
$$
$$
-3x + 5=x(A+B)-3A-2B
$$
---
$A+B = -3$
$-3A-2B=5$

$2A+2B=-6$
$-3A-2B=5$

$-A = -1$
$A = 1$

$B = -3-A = -3 - 1 = -4$
$B = -4$
---
$$
\frac{-3x + 5}{(x-2)(x-3)} = \frac{1}{x-2} - \frac{4}{x-3}
$$
$$
\int \frac{-3x + 5}{(x-2)(x-3)}\ dx = \int \frac{1}{x-2}\ dx - \int \frac{4}{x-3}\ dx
$$
$$
\int \frac{-3x + 5}{(x-2)(x-3)}\ dx = \ln (x-2) - 4\ln(x-3) + C = \ln(x-2)-\ln(x-3)^4
$$
$$
\int \frac{-3x + 5}{x^2-5x+6}\ dx = \ln \frac{x-2}{(x-3)^4}+ C
$$

## Division sintetica
$$
\int \frac{3x+7}{x^{2}-2x-3}
$$
$$\frac{3x+7}{(x-3)(x+1)} = \frac{A}{x-3} + \frac{B}{x+1}$$
$q = 1, p = -3$
$$
1, -2, -3 / -3
$$
$$
\ \ -3 \ \ \ \ \  15
$$
$$---------$$
Factores cuadraticos
## Factores Cuadraticos diferentes
Cuando el denominador se puede factorizar, le corresponden fracciones de la forma $$\frac{Ax+B}{2x^2+bx+c}$$
Ejemplo:
$$\int \frac{4x^{2}+x+1}{x^3-1}\ dx$$
$$
\frac{4x^2+x+1}{(x-1)(x^2+x+1)} = \frac{A}{x-1}+\frac{Bx+C}{x^2+x+1}
$$
$$
\frac{A}{x-1}+\frac{Bx+C}{x^2+x+1} = \frac{A(x^2+x+1)+(Bx+C)(x-1)}{(x-1)(x^2+x+1)}
$$
$$
\frac{A(x^2+x+1)+(Bx+C)(x-1)}{(x-1)(x^2+x+1)} = \frac{Ax^2+Ax+A+Bx^2+Cx-Bx-C}{(x-1)(x^2+x+1)}
$$
$$
\frac{Ax^2+Ax+A+Bx^2+Cx-Bx-C}{(x-1)(x^2+x+1)} = \frac{x^2(A+B)+x(A-B+C)+A-C}{(x-1)(x^2+x+1)}
$$
$$
\frac{4x^2+x+1}{(x-1)(x^2+x+1)} = \frac{x^2(A+B)+x(A-B+C)+A-C}{(x-1)(x^2+x+1)}
$$
$$
4x^2+x+1 = x^2(A+B)+x(A-B+C)+A-C
$$
$A+B=4$
$A-B+C=1$
$A-C=1$

$A = 4-B$; $A=4-2 = 2$
$4-B-B+C=1$ ; $-2B+C =-3$; $C=2B-3$; $C=2(2)-3=1$

$4-B-(2B-3)=1$; $-3B+7=1$; $B=\frac{-6}{-3} = 2$

$A = 2$
$B=2$
$C=1$

$$
\int \frac{4x^2+x+1}{(x-1)(x^2+x+1)} \ dx= \int (\frac{2}{x-1}+\frac{2x+1}{x^2+x+1})\ dx
$$
$$
2\int \frac{dx}{x-1} + \int \frac{2x+1\ dx}{x^2+x+1} = 2\ln (x-1) + \ln(x^2+x+1)+C  
$$
## Tipo 4: Factores cuadraticos iguales
Cuando el denominador no se puede factorizar, le corresponde una suma de fracciones. Por ejemplo:
$$
\frac{1}{(x^2 + 3)^3} = \frac{Ax+B}{x^2+3} + \frac{Cx+D}{(x^2+3)^2} + \frac{Ex+F}{(x^2+3)^3}
$$
En los tipos 2 y 4, el exponente indica cuantos deben ser. A, B, C, etc., Son incognitas a determinar. Ejemplo:
$$
\int \frac{x^3+x^2+x+3}{(x^2+1)(x^2+3)}\ dx
$$
Demostracion:
$$
\frac{x^3+x^2+x+3}{(x^2+1)(x^2+3)} = \frac{Ax+B}{x^2+1}+\frac{Cx+D}{x^2 + 3} = \frac{(Ax+B)(x^2+3)+(Cx+D)(x^2+1)}{(x^2+1)(x^2+3)}
$$

$$
x^3+x^2+x+3 = Ax^3+3Ax+Bx^2+3B+Cx^3+Cx+Dx^2+D
$$
$$
x^3+x^2+x+3 = x^3(A+C)+x^2(B+D)+x(3A+C) + 3B+D
$$
$A+C = 1$
$B+D = 1$
$3A+C=1$
$3B+D=3$

$3A+C-A-C=1-1; \ \ 2A=0$
$A=0$

$0+C=1$
$C=1$

$3B+D-B-D=3-1; \ \ 2B=2$
$B=1$

$3(1)+D=3$
$D=0$

$$
\frac{0x+1}{x^2+1}+\frac{1x+0}{x^2 + 3}
$$
$$
\int \frac{x^3+x^2+x+3}{(x^2+1)(x^2+3)}\ dx=\int (\frac{1}{x^2+1}+\frac{x}{x^2+3})\ dx
$$
$$
\int \frac{dx}{x^2+1}+\frac{1}{2}\int \frac{2x\ dx}{x^2+3} = \arctan x + \frac{1}{2} \ln (x^2+3)+C
$$
$$
\int \frac{x^3+x^2+x+3}{(x^2+1)(x^2+3)}\ dx = \arctan x + \frac{1}{2} \ln (x^2+3)+C
$$
