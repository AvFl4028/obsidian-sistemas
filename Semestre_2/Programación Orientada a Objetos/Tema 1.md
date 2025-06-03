# Introducción
- Abstracción
- Encapsulación
- Modularidad
- Herencia
- Polimorfismo 
# Clases y objetos
# Métodos
Los métodos son funciones asociadas a una clase o un objeto, los cuales permiten ejecutar tareas especificas, pueden ser estáticos o de instancia, permite interactuar entre otras funciones u objetos, como toda función pueden recibir parámetros y retornar valores según se declare el tipo.
## Estatico
Los metodos estaticos se acceden al llamar solo a la clase, sin constructor, se les da un valor y devuelven otro.
## Clase
Los metodos de clase se acceden al instanciar una clase en un objeto, solo modifica el objeto en si

Realizar un metodo que evalue si hay un minimo de stock del producto, es decir, debera evaluar que lo minimo aceptable del stock es 10; realizar un segundo metodo, para aplicar un porcentaje de descuento al producto.

Imagina que eres el dueño del restaurant "Cafecito" y requieres un programa para simular una orden en el restaurante, como tu eres programadar, has decidido programar, te has dado cuenta que necesitas una clase plato con los atributos: nombre, precio y categoria (entrada, plato fuerte y postre). 
Necesitas considerar que los miercoles hay descuento general del 10% y que hay un descuento ademas de ese del 3% en consumos superiores a 2000, ambos descuentos son excluyentes. El programa debera mostrar el siguiente menu:
1. Levantar pedido
2. Cerrar pedido
3. Salir

(Despues: con un arreglo de categorias)

## Herencia (extends)
~~~mermaid
classDiagram
class Empleado {
- nombre::String
- telefono::int
- sueldo::float
- horario::String
- getters / setters
}

class Mesero {
- num mesas
- bono:: float
- getter / setter
}

class Gerente {
- Metas::float
}

class Gerente General{
- Bono::float
}

Empleado <|-- Mesero
Empleado <|-- Gerente
Gerente <|-- Gerente General
~~~

Hay 2 tipos de herencia (multiple y simple)
- Simple: Solo hay un padre