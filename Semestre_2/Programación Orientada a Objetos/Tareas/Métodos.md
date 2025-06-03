# Métodos
En programación, un **método** es una función asociada a una clase o un objeto. Se utiliza para definir comportamientos específicos que los objetos pueden ejecutar.

Se llaman desde una asignacion, impresion o condicion

Sobrecargas de metodos: Es cuando se tienen 2 o más metodos con el mismo nombre pero diferentes parametros
### **Características de un método:**

1. **Pertenencia a una clase u objeto** → Un método está vinculado a una clase (método de clase) o a una instancia de una clase (método de instancia).
2. **Encapsulación** → Puede acceder a los atributos del objeto y modificarlos si es necesario.
3. **Modificadores de acceso** → Puede ser **público (public), privado (private) o protegido (protected)**, dependiendo de su visibilidad en el código.
4. **Parámetros y retorno** → Puede recibir argumentos y devolver un resultado.
5. **Sobrecarga** → En algunos lenguajes, como Java y C++, se pueden definir múltiples métodos con el mismo nombre pero diferentes parámetros.
6. **Polimorfismo** → Un método puede comportarse de manera distinta en diferentes clases si es sobrescrito (override).
7. **Métodos estáticos** → Pertenecen a la clase en sí, no a una instancia, y se llaman sin crear un objeto.
8. **Herencia** → Un método de una clase padre puede ser heredado y reutilizado en una clase hija.
### **Ejemplo:**

```java
class Persona {
    private String nombre; // Atributo de la clase

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método de instancia
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    // Método estático
    public static void mensaje() {
        System.out.println("Este es un mensaje desde un método estático.");
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Carlos");
        persona1.saludar(); // Llamada al método de instancia

        // Llamada al método estático sin necesidad de crear un objeto
        Persona.mensaje();
    }
}
```
