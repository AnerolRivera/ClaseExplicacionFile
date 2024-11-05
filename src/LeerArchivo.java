import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
    public static void main(String[] args) {


        // Definir la ruta del archivo
        String ruta = "D:\\Git\\Test.txt";

        // Verifica si el archivo existe en la ruta especificada
        if (!Files.exists(Paths.get(ruta))) {
            System.out.println("La ruta no es correcta.");
            return;
        }
        // Se Crea un arreglo para almacenar las notas
        List<Integer> notas = new ArrayList<>();
        int sum = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Intenta leer el archivo
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
        // Lee el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                try {
         // Se convierten los números enteros y se eliminan los espacios en blanco
                    int nota = Integer.parseInt(linea.trim());
                    notas.add(nota);
                    sum += nota;

         // Actualiza el numero mayor y el menor
                    mayor = Math.max(mayor, nota);
                    menor = Math.min(menor, nota);
                } catch (NumberFormatException e) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Calcula y muestra los resultados
        if (!notas.isEmpty()) {
            double promedio = (double) sum / notas.size();
            System.out.println("Promedio: " + promedio);
            System.out.println("Número mayor: " + mayor);
            System.out.println("Número menor: " + menor); 
        } else {
            // Se imprime este mensaje si la lista está vacía
            System.out.println("No se encontraron notas en el archivo.");
        }
    }
}
