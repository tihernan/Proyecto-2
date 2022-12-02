package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Fabricio Castro
 * @author Tiffany Hernández
 */
public class Main {

    static BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
    private static final int LIMIT = 6;

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner sc=  new Scanner(System.in);
        java.io.File file1 = new java.io.File("Lista.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));
        int counter = 1;
        String data;
        String add = "";
        String nameFile = "";
        String sheetName= "";
        String url = "";

        try {
            
            System.out.println("Ingrese los datos que desea añadir");
            add = br2.readLine();
            bw.newLine();
            bw.write(add);
            bw.close();
            System.out.println("Se ha escrito en el archivo exitosamente");
            System.out.println("");
            System.out.println("Ingrese la ruta donde quiere almacenar el archivo txt nuevo");
            System.out.println("Ejemplo: C:\\Users\\Omar\\Downloads\\Doc");
            url = sc.nextLine();
            
            while ((data = br.readLine()) != null) {
                String[] columns = data.split("\n"); 
                sheetName = columns[0]; 
                
                //Crea un nuevo archivo cuando el contador vuelve a 1
                if (counter == 1) {
                    nameFile = getFileName(url);
                    try {
                        if (bw != null) 
                            bw.close();
                    } catch (Exception e) {
                        System.out.println("Error al cerrar archivo: " + nameFile + "--->" + e);
                    }
                    bw = new BufferedWriter(new FileWriter(nameFile));
                    
                }
                 
                //Escribe la información en el txt generado
                bw.write(data);

                //Cada que el contador llega a su limite, el contador se reinicia
                if (counter == LIMIT) {
                    counter = 1;
                } else {
                    counter++;
                }
            }
            
            
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
            e.printStackTrace();
        } finally {
            System.out.println("Archivos generados exitosamente");

            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al finalizar");
            }
        }

    }

    //Método que crea el archivo txt
    private static String getFileName(String url) {
        String name = url + "\\archivoGenerado" + ".txt";
        return name;
    }
}
