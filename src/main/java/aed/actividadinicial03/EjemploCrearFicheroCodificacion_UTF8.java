package aed.actividadinicial03;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class EjemploCrearFicheroCodificacion_UTF8 { 

    public static void main(String[] args) {
        
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("EjemploUTF8.txt"),
        StandardCharsets.UTF_8)) {
            writer.write("Hola, mundo! Esto es un ejemplo");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
