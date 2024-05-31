package main.java.conversor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivos {
  public void guardarJson(List<String> lista) {
    try {
      FileWriter fileWriter = new FileWriter("Historial de conversiones.txt");
      for (String resultado : lista) {
        fileWriter.write(resultado);
        fileWriter.write("\n");
      }
      fileWriter.close();
      System.out.println("Historial de conversiones guardado en 'Historial de conversiones.txt'");
    } catch (IOException e) {
      System.out.println("Error al guardar el historial de conversiones: " + e.getMessage());
    }
  }
}