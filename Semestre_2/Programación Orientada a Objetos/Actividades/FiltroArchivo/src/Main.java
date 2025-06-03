//TIP Elaborar un programa que resiva un archivo de texto que contenga palabras, dicho programa debera eliminar el archivo de texto todas las palabras sonadas antisonantes (groserias), debera tener un segundo archivo de texto que almacene al menos 20 groserias.

public class Main {
    public static void main(String[] args) {
        FiltroArchivo docs = new FiltroArchivo("test");
        docs.filtrar();
    }
}