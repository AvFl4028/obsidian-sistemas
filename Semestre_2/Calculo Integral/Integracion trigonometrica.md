# Integracion Trigonometricas

Ejemplo:
$$
\int \sec^{3}(2x)dx = \int (\sec 2x)(\sec^{2}2x)dx
$$$u = \sec(2x)$
$dv = (\sec^{2}2x)dx$
$du = (2\sec 2x \tan 2x) dx$
$v = \frac{1}{2}\tan 2x + C$

$$
\int \sec^{3}(2x)dx = (\sec_{2}2x)\left( \frac{1}{2} \tan 2x\right) - \int \left( \frac{1}{2} \tan 2x\right)(2\sec 2x \tan 2x)dx
$$
$$
\int \sec^{3}(2x)dx = (\sec_{2}2x)\left( \frac{1}{2} \tan 2x\right) - \int (\sec 2x \tan^{2} 2x)dx
$$
$$
\int \sec^{3}(2x)dx = (\sec_{2}2x)\left( \frac{1}{2} \tan 2x\right) - \int (\sec 2x (\sec^{2} 2x - 1))dx
$$
$$
\int \sec^{3}(2x)dx = (\sec_{2}2x)\left( \frac{1}{2} \tan 2x\right) - \int (\sec^{3} 2x) dx  + \int (\sec 2x)dx
$$
$$
\int \sec^{3}(2x)dx + \int\sec^{3}(2x)dx = \frac{1}{2}\sec^{2}2x \tan 2x + \frac{1}{2}\ln |\sec 2x+ \tan 2x| + C
$$
$$
2\int \sec^{3}(2x)dx = \frac{1}{2}\sec^{2}2x \tan 2x + \frac{1}{2}\ln |\sec 2x+ \tan 2x| + C 
$$
$$
\int \sec^{3}(2x)dx = \frac{1}{4}\sec^{2}2x \tan 2x + \frac{1}{4}\ln |\sec 2x+ \tan 2x| + C
$$
## Integración trigonométrica
Ejemplo:
$$\int \sin^2\cos^3x\ dx$$
---
Por identidad trigonométrica
$$\sin^2A + \cos^2A = 1$$
$$\cos^2 A= 1 - \sin^2 A$$
---
$$
\int \sin^2x \cos^2 x\cos x\ dx
$$
$$
\int \sin^2x(1-\sin^2x)\cos x\ dx
$$
$$
\int \sin^2x-\sin^4x \cos x\ dx
$$
$$\int \sin ^2x\cos x\ dx - \int \sin^4 \cos x \ dx$$
---
$$
\int \sin^2 x \cos x \ dx = \frac{\sin^3 x}{3} + C
\ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \
\int \sin^3 x \cos x \ dx = \frac{\sin ^4 x}{4} + C
$$
---
$$
\int \sin ^2x\cos x\ dx - \int \sin^4 \cos x \ dx = \frac{1}{3}\sin^3 x - \frac{1}{4} \sin ^4 x + C
$$
---
Ejercicio
$$\int \tan ^4 x \ dx $$
---
Por identidad trigonométrica
$$\sec^2 A - \tan ^2 A= 1$$
$$
\tan^2A =  \sec^2A - 1
$$
---
$$
\int \tan ^2 x\tan ^2 x \ dx
$$
$$
\int \tan^2 x (\sec^2x - 1)dx
$$
$$
\int \tan^2 x \sec ^2 x - \tan^2x\ dx
$$
$$
\int \tan^2 x \sec ^2 x \ dx - \int (\sec^2x - 1) \ dx
$$
$$
\int \tan^2 x \sec ^2 x \ dx - \int \sec ^2 x \ dx + \int dx + C
$$
La primera integral ya esta balanceada
$$
= \frac{\tan ^3 x}{3} - \tan x + x + C
$$
---
$$
\int \frac{\cos ^3 x \ dx}{\sin ^4 x \ dx} = \int \sin ^{-4}x(\cos ^ 2 x \cos x)dx
$$
$$
\int \sin ^{-4}x(1-\sin^2x)\cos x\ dx
$$
$$
\int \sin ^{-4}x \cos x\ dx +
$$
---
$$
\int \cot ^34x\ dx = \int \cot^24x\cot 4x \ dx
$$
$$
\int (\csc^24x-1)\cot 4x \ dx = \int \cot 4x \csc^24x\ dx - \int \cot 4x \ dx
$$
$$
= -\frac{1}{4} \frac{\cot ^2 4x}{2} - \frac{1}{4} \ln |\sin 4x| + C= -\frac{1}{8}\cot^2 4x - \frac{1}{4}\ln|\sin 4x| + C
$$
