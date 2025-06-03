import clase.*;

public class App {
    public static void main(String[] args) throws Exception {
        String titulo = "Compila un codigo en java";
        String contenido = "Si compilo el codigo en java";
        String autor = "Yo";

        Noticia noti = new Noticia(
            titulo, 
            contenido, 
            autor, 
            "11 de marzo del 2025", 
            "De los deseos");
        
        Blog blog = new Blog(titulo, contenido, autor, true);
        blog.anadirComentario("Yo: si");
        blog.anadirComentario("Yo: tal vez");
        Articulo arti = new Articulo(titulo, contenido, autor, "Panchito", false);

        System.out.println(noti.getInfo() + "\n\n");
        System.out.println(blog.getInfo() + "\n\n");
        System.out.println(arti.getInfo() + "\n\n");
    }
}
