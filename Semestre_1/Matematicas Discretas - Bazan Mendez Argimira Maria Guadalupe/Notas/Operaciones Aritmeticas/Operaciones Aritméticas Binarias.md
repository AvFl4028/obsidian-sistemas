# Operaciones Aritméticas Binarias
## Suma

| Operación |   Resultado    |
|:---------:|:--------------:|
|   $0+0$   |      $0$       |
|   $0+1$   |       1        |
|   $1+0$   |       1        |
|   $1+1$   | 0 y llevamos 1 |
**Ejemplo:**

|   $10111$ |
| ---------:|
| _+_$1011$ |
|  $100010$ |
## Resta

| Operación |     Resultado     |
| :-------: | :---------------: |
|   $0-0$   |        $0$        |
|   $0-1$   | $1$ pedir acarreo |
|   $1-0$   |        $1$        |
|   $1-1$   |        $0$        |
**Ejemplo:**

| Minuendo   |       $111110111$ |         $101110$ |      $10101$ |
| ---------- | ----------------: | ---------------: | -----------: |
| Sustraendo | _**-**_  $111001$ | _**-**_  $10011$ | _-_  $10011$ |
| Resultado  |       $110111110$ |         $011011$ |      $00010$ |
### Complementos de 1 y 2
#### Complemento a 1
Es donde el numero binario es el opuesto, ejemplo: $101110$ a $010001$
#### Complemento a 2
Solo se suma 1 al complemento 1

|     | $010001$ |
| :-: | -------: |
|  +  |      $1$ |
|     | $010010$ |

| Numero $B_{2}$  | $101111$              |
| --------------- | --------------------- |
| Complemento a 1 | $010000$              |
| Complemento a 2 | $010000 + 1 = 010001$ |
Bit de paridad es 1, resultado positivo
Es 0, resultado negativo
## Multiplicación

| Operación | Resultado |
| :-------: | :-------: |
|   $0*0$   |    $0$    |
|   $0*1$   |    $0$    |
|   $1*0$   |    $0$    |
|   $1*1$   |    $1$    |
$1010*110 = 0000 + 10100 + 101000 = 111100$
$11011*101=11011+000000+1101100$

$111011*110 = 000000 + 1110110+11101100 = 101100010$

## Division
$$\frac{101110010110 _{2}}{101_{2}}  = 1001010001$$ y sobra 1