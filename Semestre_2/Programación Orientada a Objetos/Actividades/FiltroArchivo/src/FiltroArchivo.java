import java.io.*;

public class FiltroArchivo {
    private final File archivo_original;
    private final File archivo_esperado;
    private final File db;

    public FiltroArchivo(String archivo_original) {
        this.archivo_original = new File(archivo_original + ".txt");
        this.archivo_esperado = new File(archivo_original+"_esperado.txt");
        this.db = new File("Palabras.txt");

        try {
            if (!this.archivo_esperado.exists()) this.archivo_esperado.createNewFile();
            if (!this.archivo_original.exists()) this.archivo_original.createNewFile();
            if (!this.db.exists()) this.db.createNewFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void filtrar() {
        String[] db = obtenerDb();
        String[] data = obtenerTexto();
        String linea = "";

        for(String frase: data) {
            for (String palabra : frase.split(" "))
                if (!esGroseria(palabra, db))
                    linea += palabra + " ";
            try(BufferedWriter doc = new BufferedWriter(new FileWriter(archivo_esperado, true)))
            {
                doc.write(linea + "\n");
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
            linea = "";
        }/**
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        archivo_original.delete();
        /*try{
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        archivo_esperado.renameTo(archivo_original);
    }

    public String[] obtenerDb(){
        String result = "";
        try(BufferedReader br = new BufferedReader(new FileReader(db))){
            String linea;
            while ((linea = br.readLine()) != null)
                result += linea + "\n";
        }catch (IOException e){
            System.out.println("Archivo no encontrado");
        }
        return result.split("\n");
    }

    private boolean esGroseria(String palabra, String[] groserias) {
        for (String groseria : groserias) {
            if (groseria.trim().equalsIgnoreCase(palabra.trim())) {
                System.out.println("Grosería detectada: " + palabra);
                return true;
            }
        }
        return false;
    }

    public String[] obtenerTexto(){
        String data = "";
        try(BufferedReader br = new BufferedReader(new FileReader(archivo_original))){
            String line;
            while( (line = br.readLine()) != null){
                data += line + "\n";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return data.split("\n");
    }
}
