# Cuestionario
**2.1 Técnicas de Conteo**
- Este subtema abarca diversas herramientas para determinar el número de resultados posibles en un experimento, lo cual es fundamental para calcular probabilidades.
**2.1.1 Principio Aditivo**
- Se utiliza cuando se tienen dos o más eventos mutuamente excluyentes y se desea conocer el número total de resultados posibles. Se suman las posibilidades de cada evento.
**2.1.2 Principio Multiplicativo**
- Se aplica cuando se tienen varios eventos que ocurren de forma secuencial y se desea conocer el número total de resultados posibles. Se multiplican las posibilidades de cada evento.
**2.1.3 Notación Factorial**
- Es una forma abreviada de representar la multiplicación de todos los números enteros positivos desde 1 hasta un número dado. Se utiliza en cálculos de permutaciones y combinaciones.
**2.1.4 Permutaciones**
- Se utilizan para contar el número de formas en que se pueden ordenar un conjunto de objetos, donde el orden es importante.
**2.1.5 Combinaciones**
- Se utilizan para contar el número de formas en que se pueden seleccionar un subconjunto de objetos de un conjunto mayor, donde el orden no es importante.
**2.1.6 Diagrama de Árbol**
- Es una herramienta gráfica que permite visualizar todos los posibles resultados de un experimento, especialmente útil cuando hay múltiples etapas.
**2.1.7 Teorema del Binomio**
- Este teorema proporciona una fórmula para expandir las potencias de un binomio.

**2.2 Teoría Elemental de Probabilidad**
- Estudia los fenómenos aleatorios y asigna números a los posibles resultados para cuantificar la probabilidad de que ocurran.

**2.3 Probabilidad de Eventos**
- Define conceptos clave como espacio muestral (todos los resultados posibles) y evento (subconjunto de resultados).
- Introduce la simbología y las operaciones de unión e intersección de eventos, así como los diagramas de Venn para visualizarlos.

**2.4 Probabilidad con Técnicas de Conteo**
- Combina las técnicas de conteo con los axiomas y teoremas de probabilidad para calcular la probabilidad de eventos.

**2.5 Probabilidad Condicional**
- Calcula la probabilidad de que ocurra un evento dado que otro evento ya ha ocurrido.
- Distingue entre eventos dependientes (la ocurrencia de uno afecta al otro) e independientes (la ocurrencia de uno no afecta al otro).

**2.6 Ley Multiplicativa**

- Se utiliza para calcular la probabilidad de que ocurran dos o más eventos de forma conjunta.
- Es especialmente útil para eventos dependientes.

**2.7 Eventos Independientes: Regla de Bayes**

- La regla de Bayes permite calcular la probabilidad condicional inversa, es decir, la probabilidad de que haya ocurrido un evento A dado que ocurrió un evento B, cuando se conoce la probabilidad de B dado A.
## Formulas
### **2.1 Técnicas de Conteo**

#### **2.1.1 Principio Aditivo**

Si dos eventos AA y BB son mutuamente excluyentes (no pueden ocurrir simultáneamente), el número total de maneras en que pueden ocurrir es:

$$n(A \cup B) = n(A) + n(B)$$

#### **2.1.2 Principio Multiplicativo**

Si un evento puede ocurrir de mm formas y otro evento puede ocurrir de nn formas de manera independiente, el número total de formas en que pueden ocurrir ambos eventos es:

$$n(A \cap B) = m \times n$$

#### **2.1.3 Notación Factorial**

La notación factorial n!n! se define como:

$$n! = n \times (n-1) \times (n-2) \times \dots \times 1$$
Por convención, $0! = 1$.

#### **2.1.4 Permutaciones**

El número de formas en que se pueden ordenar r elementos de un conjunto de n elementos es:

$$P(n, r) = \frac{n!}{(n - r)!}$$

#### **2.1.5 Combinaciones**

El número de formas en que se pueden seleccionar r elementos de un conjunto de n elementos sin importar el orden es:

$$C(n, r) = \binom{n}{r} = \frac{n!}{r!(n - r)!}$$

#### **2.1.6 Diagrama de Árbol**

No tiene una fórmula específica, pero representa visualmente todas las opciones posibles de un experimento paso a paso.

#### **2.1.7 Teorema del Binomio**

La expansión de un binomio de la forma $$(a + b)^n$$ se expresa como:

$$(a + b)^n = \sum_{k=0}^{n} \binom{n}{k} a^{(n-k)} b^k$$

---

### **2.2 Teoría Elemental de Probabilidad**

La probabilidad de un evento $A$ se define como:

$$P(A) = \frac{\text{Casos favorables}}{\text{Casos posibles}}$$

---

### **2.3 Probabilidad de Eventos**

- **Regla de la unión de dos eventos**: $$P(A \cup B) = P(A) + P(B) - P(A \cap B)$$
- **Si los eventos son mutuamente excluyentes** ($A \cap B = \emptyset$): $$P(A \cup B) = P(A) + P(B)$$

---

### **2.4 Probabilidad con Técnicas de Conteo**

Se usa en combinación con permutaciones y combinaciones para calcular probabilidades.

Ejemplo: si hay $$C(n, r)$$ maneras de elegir un subconjunto y queremos su probabilidad, se usa:

$$P(A) = \frac{C(\text{casos favorables})}{C(\text{casos posibles})}$$

---

### **2.5 Probabilidad Condicional**

La probabilidad de que ocurra $A$ dado que ocurrió $B$ es:

$$P(A | B) = \frac{P(A \cap B)}{P(B)}, \quad \text{si } P(B) \neq 0$$

- **Eventos independientes**:  
    Si $P(A | B) = P(A)$, los eventos son independientes.

---

### **2.6 Ley Multiplicativa**

Para eventos dependientes:

$$P(A \cap B) = P(A) \cdot P(B | A)$$

Para eventos independientes:

$$P(A \cap B) = P(A) \cdot P(B)$$

---

### **2.7 Regla de Bayes**

$$P(A | B) = \frac{P(B | A) P(A)}{P(B)}$$

Donde $P(B)$ se puede calcular como:

$$P(B) = P(B | A) P(A) + P(B | A^c) P(A^c)$$

---
## Ejemplos
### **1. Combinaciones**

**Ejercicio:**  
En un club hay **12 miembros** y se quiere formar un comité de **4 personas**. ¿De cuántas maneras se puede seleccionar el comité?

**Solución:**  
Como el orden no importa, usamos la fórmula de combinaciones:

C(n,r)=(nr)=n!r!(n−r)!C(n, r) = \binom{n}{r} = \frac{n!}{r!(n-r)!}

Sustituyendo los valores:

C(12,4)=12!4!(12−4)!=12!4!8!C(12, 4) = \frac{12!}{4!(12-4)!} = \frac{12!}{4!8!} =12×11×10×94×3×2×1=495= \frac{12 \times 11 \times 10 \times 9}{4 \times 3 \times 2 \times 1} = 495

**Respuesta:** Se pueden formar **495** comités diferentes.

---

### **2. Permutaciones**

**Ejercicio:**  
En una carrera de **8 corredores**, ¿de cuántas maneras pueden quedar ocupados los **primeros 3 lugares**?

**Solución:**  
Como el orden importa, usamos la fórmula de permutaciones:

P(n,r)=n!(n−r)!P(n, r) = \frac{n!}{(n - r)!}

Sustituyendo los valores:

P(8,3)=8!(8−3)!=8!5!P(8, 3) = \frac{8!}{(8-3)!} = \frac{8!}{5!} =8×7×61=336= \frac{8 \times 7 \times 6}{1} = 336

**Respuesta:** Hay **336** maneras diferentes de ocupar los primeros 3 lugares.

---

### **3. Conjuntos**

**Ejercicio:**  
En una escuela, **40 estudiantes** toman matemáticas, **30** estudian física y **15** estudian ambas materias. ¿Cuántos estudiantes hay en total si todos están en al menos una de las dos materias?

**Solución:**  
Usamos la fórmula de la unión de conjuntos:

∣A∪B∣=∣A∣+∣B∣−∣A∩B∣|A \cup B| = |A| + |B| - |A \cap B|

Sustituyendo los valores:

∣A∪B∣=40+30−15=55|A \cup B| = 40 + 30 - 15 = 55

**Respuesta:** Hay **55** estudiantes en total.

---

### **4. Teorema de Bayes**

**Ejercicio:**  
El **5%** de las piezas de una fábrica son defectuosas. Una máquina de inspección detecta defectos con un **90% de precisión** (si la pieza es defectuosa, la detecta el 90% de las veces). Sin embargo, **falsos positivos** ocurren en el **5%** de las piezas no defectuosas.

Si una pieza es marcada como defectuosa, ¿cuál es la probabilidad de que realmente esté defectuosa?

**Solución:**  
Usamos la **Regla de Bayes**:

P(D∣M)=P(M∣D)P(D)P(M)P(D | M) = \frac{P(M | D) P(D)}{P(M)}

Donde:

- P(D)=0.05P(D) = 0.05 (probabilidad de que una pieza sea defectuosa).
- P(M∣D)=0.90P(M | D) = 0.90 (probabilidad de que la máquina marque una defectuosa correctamente).
- P(ND)=0.95P(ND) = 0.95 (probabilidad de que una pieza no sea defectuosa).
- P(M∣ND)=0.05P(M | ND) = 0.05 (probabilidad de que la máquina marque una pieza no defectuosa por error).

Calculamos P(M)P(M):

P(M)=P(M∣D)P(D)+P(M∣ND)P(ND)P(M) = P(M | D) P(D) + P(M | ND) P(ND) P(M)=(0.90×0.05)+(0.05×0.95)P(M) = (0.90 \times 0.05) + (0.05 \times 0.95) P(M)=0.045+0.0475=0.0925P(M) = 0.045 + 0.0475 = 0.0925

Ahora aplicamos la fórmula de Bayes:

P(D∣M)=0.90×0.050.0925=0.0450.0925≈0.486P(D | M) = \frac{0.90 \times 0.05}{0.0925} = \frac{0.045}{0.0925} \approx 0.486

**Respuesta:** Si la máquina marca una pieza como defectuosa, la probabilidad de que realmente esté defectuosa es **48.6%**.

---

¡Espero que estos ejercicios te ayuden! 🚀💡
## Ejercicios de ejemplo
Aquí tienes **5 ejercicios** de cada tema (**Combinaciones, Permutaciones, Conjuntos y Teorema de Bayes**) con sus respectivas soluciones.

---

### **1. Combinaciones** (Cuando el orden **no** importa)

**Ejercicio 1:**  
Un equipo de baloncesto tiene **15 jugadores**, pero solo **5** pueden jugar al mismo tiempo. ¿De cuántas formas se puede elegir el equipo inicial?

💡 **Solución:**  
Usamos la fórmula de combinaciones:

C(n,r)=n!r!(n−r)!C(n, r) = \frac{n!}{r!(n - r)!} C(15,5)=15!5!(15−5)!=15!5!10!C(15,5) = \frac{15!}{5!(15-5)!} = \frac{15!}{5!10!} =15×14×13×12×115×4×3×2×1=3003= \frac{15 × 14 × 13 × 12 × 11}{5 × 4 × 3 × 2 × 1} = 3003

✅ **Respuesta:** **3,003** formas.

---

**Ejercicio 2:**  
En una clase hay **20 estudiantes** y se necesita seleccionar un comité de **3 personas**. ¿Cuántas formas hay de hacerlo?

✅ **Respuesta:**

C(20,3)=20!3!(20−3)!=20×19×183×2×1=1140C(20,3) = \frac{20!}{3!(20-3)!} = \frac{20 × 19 × 18}{3 × 2 × 1} = 1140

Hay **1,140** formas.

---

**Ejercicio 3:**  
Un grupo de **10 amigos** va al cine y compran **4 boletos**. ¿De cuántas maneras pueden elegir quiénes irán?

✅ **Respuesta:**

C(10,4)=10!4!(10−4)!=10×9×8×74×3×2×1=210C(10,4) = \frac{10!}{4!(10-4)!} = \frac{10 × 9 × 8 × 7}{4 × 3 × 2 × 1} = 210

Hay **210** formas.

---

**Ejercicio 4:**  
En una escuela hay **25 alumnos** en el club de ajedrez. ¿De cuántas formas pueden elegirse **5** representantes?

✅ **Respuesta:**

C(25,5)=25!5!(25−5)!=25×24×23×22×215×4×3×2×1=53130C(25,5) = \frac{25!}{5!(25-5)!} = \frac{25 × 24 × 23 × 22 × 21}{5 × 4 × 3 × 2 × 1} = 53130

Hay **53,130** formas.

---

**Ejercicio 5:**  
Se quiere formar un grupo de estudio con **6 personas** de un total de **14 estudiantes**. ¿Cuántas combinaciones posibles hay?

✅ **Respuesta:**

C(14,6)=14!6!(14−6)!=14×13×12×11×10×96×5×4×3×2×1=3003C(14,6) = \frac{14!}{6!(14-6)!} = \frac{14 × 13 × 12 × 11 × 10 × 9}{6 × 5 × 4 × 3 × 2 × 1} = 3003

Hay **3,003** combinaciones.

---

### **2. Permutaciones** (Cuando el orden **sí** importa)

**Ejercicio 1:**  
Un profesor quiere asignar **3 premios** distintos a **8 estudiantes**. ¿De cuántas maneras puede hacerlo?

✅ **Respuesta:**

P(8,3)=8!(8−3)!=8×7×61=336P(8,3) = \frac{8!}{(8-3)!} = \frac{8 × 7 × 6}{1} = 336

Hay **336** formas.

---

**Ejercicio 2:**  
¿Cuántas formas hay de acomodar **5 libros diferentes** en una estantería?

✅ **Respuesta:**

P(5,5)=5!=5×4×3×2×1=120P(5,5) = 5! = 5 × 4 × 3 × 2 × 1 = 120

Hay **120** formas.

---

**Ejercicio 3:**  
Un código de seguridad tiene **4 dígitos distintos** y hay **10 números** disponibles (0-9). ¿Cuántos códigos pueden crearse?

✅ **Respuesta:**

P(10,4)=10!(10−4)!=10×9×8×7=5040P(10,4) = \frac{10!}{(10-4)!} = 10 × 9 × 8 × 7 = 5040

Hay **5,040** códigos posibles.

---

**Ejercicio 4:**  
Se eligen **3 personas** de un grupo de **7** para ocupar **puestos específicos** de presidente, vicepresidente y secretario. ¿Cuántas maneras hay?

✅ **Respuesta:**

P(7,3)=7!(7−3)!=7×6×5=210P(7,3) = \frac{7!}{(7-3)!} = 7 × 6 × 5 = 210

Hay **210** maneras.

---

**Ejercicio 5:**  
Se tienen **9 banderas de colores distintos** y se deben colocar en **4 postes** en fila. ¿Cuántas maneras hay de ordenarlas?

✅ **Respuesta:**

P(9,4)=9!(9−4)!=9×8×7×6=3024P(9,4) = \frac{9!}{(9-4)!} = 9 × 8 × 7 × 6 = 3024

Hay **3,024** maneras.

---

### **3. Conjuntos**

**Ejercicio 1:**  
En un grupo de **50 estudiantes**, **30 estudian matemáticas**, **20 estudian física** y **10 estudian ambas materias**. ¿Cuántos estudian al menos una?

✅ **Respuesta:**

∣A∪B∣=∣A∣+∣B∣−∣A∩B∣|A \cup B| = |A| + |B| - |A \cap B| =30+20−10=40= 30 + 20 - 10 = 40

**40** estudiantes.

---

**Ejercicio 2:**  
En una biblioteca hay **300 libros** de matemáticas, **250 de física** y **100 de ambos temas**. ¿Cuántos libros hay en total si todos pertenecen al menos a un grupo?

✅ **Respuesta:**

∣A∪B∣=300+250−100=450|A \cup B| = 300 + 250 - 100 = 450

**450** libros.

---

**Ejercicio 3:**  
En una encuesta, **90 personas** comen hamburguesas, **60 comen pizza** y **30 comen ambos**. ¿Cuántas comen al menos una de las dos comidas?

✅ **Respuesta:**

90 + 60 - 30 = 120

**120** personas.

---

**Ejercicio 4:**  
De **200 personas**, **120** hablan inglés, **100** hablan francés y **50** hablan ambos idiomas. ¿Cuántas personas hablan al menos un idioma?

✅ **Respuesta:**

120 + 100 - 50 = 170

**170** personas.

---

**Ejercicio 5:**  
En un club hay **40 jugadores de fútbol**, **30 de voleibol** y **15 juegan ambos deportes**. ¿Cuántos juegan al menos un deporte?

✅ **Respuesta:**

40 + 30 - 15 = 55

**55** jugadores.

---

### **4. Teorema de Bayes**

**Ejercicio 1:**  
El **3%** de la población tiene una enfermedad. Un examen tiene una precisión del **95%** en positivos y un **4%** de falsos positivos. Si una persona da positivo, ¿qué probabilidad hay de que realmente tenga la enfermedad?

✅ **Respuesta:**  
Aplicamos la **Regla de Bayes**.

---

**Ejercicio 2:**  
Un producto es defectuoso en un **2%** de los casos. Una máquina detecta defectos con **98% de precisión** y genera **5% de falsos positivos**. ¿Cuál es la probabilidad de que un producto realmente sea defectuoso si fue marcado como tal?

✅ **Respuesta:**  
Se usa la fórmula de Bayes.

---

🔹 **¡Espero que estos ejercicios te ayuden!** 🚀 Déjame saber si necesitas más explicaciones.