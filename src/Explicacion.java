import java.io.*;


public class Explicacion {
    public static void main(String[] args) {

        String ruta = "E:\\\\Proyectos_BanBta\\\\I-Test-AI\\\\ManejoArchivos\\\\Data\\\\"; // Asegúrate de que la ruta termina con '/'


        String ruta1 = "E:/Proyectos_BanBta/I-Test-AI/ManejoArchivos/Data/";
        try (
                FileWriter fw = new FileWriter(ruta + "test.txt");
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            bw.write("Holamundo");
            bw.newLine();
            bw.write("Holamundo2");
            bw.newLine();
            bw.write("Jorge ");
            bw.newLine();
            bw.write("Celedon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

