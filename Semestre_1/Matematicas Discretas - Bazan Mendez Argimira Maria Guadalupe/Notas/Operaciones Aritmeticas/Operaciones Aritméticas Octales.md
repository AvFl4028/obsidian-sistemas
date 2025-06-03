# Operaciones Aritméticas Octales
## Suma
### Método 1
La suma con octales es lo mismo que la suma en decimales, solo que el numero máximo que llega es el 7 y el mínimo es el 0.
**Ejemplo:**

| $B_{8}$ |    *743* |     |     |    *767* |
| ------: | -------: | --- | --: | -------: |
|       + |    *125* |     |   + |    *547* |
|         | **1070** |     |     |    *325* |
|         |          |     |     | **2063** |

| $B_{8}$ | Posición |
| ------- | -------- |
| 0       |          |
| 1       |          |
| 2       |          |
| 3       |          |
| 4       |          |
| 5       |          |
| 6       |          |
| 7       |          |
### Método 2
Consiste básicamente en sumar el numero en base 10 y después dividirlo entre 8, el residuo sera lo que quedara en la suma, las veces que de al dividir va a ser el acarreo del siguiente número.

$$
7647_{8}+777_{8}+10646_{8}
$$

|     |    *7647* |
| --: | --------: |
|   + |     *777* |
|     |   *10646* |
|     | **21414** |
1. $7 + 7 + 6 = 20 / 8 = 2$ y sobra 4
2. $4+7+4+2 = 17 / 2 = 8$ y sobra 1
3. $6+7+6+1 = 20 / 8 = 2$ y sobra 4
4. $7+0+2 = 9 / 8 = 1$ y sobra 1
5. $1+1 = 2 / 8 = 0$ y sobran 2
### Ejercicio

|     |    *732* |
| --: | -------: |
|   + |    *447* |
|     |    *637* |
|     | **2240** |
