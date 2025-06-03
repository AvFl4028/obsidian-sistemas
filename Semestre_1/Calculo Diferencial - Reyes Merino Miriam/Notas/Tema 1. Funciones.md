# Tema 1. Funciones
## 1.1 Los números y sus subconjuntos
Los números reales se denotan por la letra *$R$* y son un conjunto de números creados para transmitir mediante un lenguaje unificado distintas cantidades expresadas por una serie de símbolos y 10 dígitos. Los números e subdividen en 2 grande grupos que son lo números racionales y los irracionales.
### 1.1.1 Números racionales
Se denotan por la letra *$Q$* y son todos aquellos que se pueden escribir en forma de fracción como ($\frac{p}{q}$), donde *$p$* y *$q$* son enteros y *$q$* es distinto a $0$. Dentro de los números racionales se encuentran lo enteros, las fracciones y los decimales.

### 1.1.2 Números irracionales
Son aquellos números que no se pueden expresar en forma de fracción. Se dividen en irracionales algebraicos e irracionales trascendentales.

## 1.2 Recta numérica
Es una linea recta que se dirige hacia la derecha, en el centro se encuentra el numero $0$, a su izquierda los números negativos y a su derecha los números positivos. Su intervalo se representa $(-\infty;+\infty)$.
### 1.2.1 Intervalos
Un intervalo es un conjunto definido de valores que tienen orden. Están acotados por extremos $(a;b)$ respectivamente y e representan de 3 maneras:

|             Tipo              | Notación<br>Intervalo<br> |    Desigualdad    | Gráficamente                  |    Extremos    |
|:-----------------------------:|:-------------------------:|:-----------------:| ----------------------------- |:--------------:|
|            Abierto            |          $(a;b)$          |      $a<x<b$      | ![[abierto.svg]]              | No se incluyen |
|            Cerrado            |          $[a;b]$          | $a \leq x \leq b$ | ![[cerrado.drawio.svg]]       |  Se incluyen   |
| Semi-abierto<br>Extremo a<br> |          $(a;b]$          |   $a< x \leq b$   | ![[semiabierto_a.drawio.svg]] | Se incluye $b$ |
| Semi-abierto<br>Extremo b<br> |          $[a;b)$          |   $a \leq x<b$    | ![[semiabierto_b.drawio.svg]] | Se incluye $a$ |
## [[Primer Semestre/Calculo Diferencial - Reyes Merino Miriam/Notas/Tareas/Tarea 1]]
## 1.3 Desigualdades lineales
De la misma manera que las ecuaciones lineales tienen solo una solución, las desigualdades lineales solo pueden tener un intervalo de soluciones.
### Resolver, gráficas y dar el intervalo resultante en:

1. $x+3 < 14-3x$
     $x+3x<14-3$
     $4x<11$
     $x<\frac{11}{4}$
     
	--------------|----|---------->
	 $-\infty$              0     $\frac{11}{4}$                $\infty$

	$(-\infty; \frac{11}{4})$
	
	 _**si**_ $x=-2$
   $-2+3 < 14-3(-2)$
	$1<14+6$
	$1<20$ 
	
	**_si_** $x=2.6$
	$2.6+3<14-3(2*6)$
	$5.6<14-7.8$
	$5.6<6.2$
	
	**_si $x=\frac{11}{4}$_**
	$\frac{11}{4}<14-3(\frac{11}{4})$
	$\frac{23}{4}<14-\frac{33}{4}$
	$\frac{23}{4}< \frac{23}{4}$

2. $11x+8\geq 3x+1$ 
	1. $11x-3x \geq 1.8$
	2. $8x \geq -7$
	3. $x\geq -\frac{7}{8}$
		
	---------|------|-------------->
	 $-\infty$   $-\frac{7}{8}$        0                     $\infty$

	$[-\frac{7}{8};\infty)$

3. $x+5\leq 7x-13$
	1. $x-7x\leq -13-5$
	2. $-6x\leq-18$
	3. $18\leq 6x$
	4. $\frac{18}{6} \leq x$
	5. $3 \leq x$
	---------------|---|----------->
	 $-\infty$                0    $3$                $\infty$

	$[3;\infty)$

4. $4(x+2)>7x-3$
	1. $4x+8>7x-3$
	2. $8+3>7x-4x$
	3. $11>3x$
	4. $\frac{11}{3}>x$
	---------------|----|----------->
	 $-\infty$                0    $\frac{11}{3}$                $\infty$

	$(-\infty; \frac{11}{3})$
## Desigualdades cuadráticas
Las desigualdades cuadráticas pueden tener 1 o 2 intervalos de solución si esta toca o corta al eje x como si se tratase de una ecuación cuadrática, solo que sus soluciones son intervalos y no números completos. Si la ecuación cuadrática corta al eje x tiene 2 soluciones; si solo toca el vértice tiene una solución.
### Teorema I
$( )( ) > 0$
#### Caso 1
$( )> 0;( ) > 0$
#### Caso 2
$()<0;()<0$
### Teorema II
$()()<0$
#### Caso 1
$( ) > 0;()<0$
#### Caso 2
$()<0; ( ) > 0$
### Teorema III
$()()\geq 0$
#### Caso 1
$()\geq 0; ()\geq 0$
#### Caso 2
$()\leq 0;()\leq 0$
### Teorema IV
$()()\leq 0$
#### Caso 1
$() \geq 0; () \leq 0$
#### Caso 2
$() \leq 0; () \geq 0$

### Ejemplos
$x^{2}-9x-36 \leq 0$
$(x+3)(x-12) \leq 0$
$(x+3) \leq 0;(x-12) \geq 0$
