# Métodos getter y setter
Los métodos getter y setter son la forma estandar de dar acceso a informacion en una clase de Java, permiten para un objeto contener variables privadas que pueden ser accesadas y cambiadas con restricciones.
## Getter
El método getter permite acceder al valor de una variable privada, al cual se le pueden poner ciertas restricciones para devolver el valor, por ejemplo: si una cadena de texto es menor o igual a 16 caracteres, devolvera la variable, de lo contrario devolverá un mensaje de error.
## Setter
El método setter permite modificar el valor de una variable privada al cual se le pueden poner ciertas restricciones, por ejemplo: que la variable no sea `Null` o que tenga más de 2 caracteres en el caso del tipo `String`.

Elaborar un programa que defina la clase producto con los siguientes atributos:
- nombre
- precio
- descripcion
- departamento al que pertenece
- cantidad en stock
Realice los metodos:
- vender
- reponer
- mostrar producto
No se podra vender si el stock es insuficiente