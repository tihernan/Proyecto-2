
package Interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Fabricio Castro
 * @author Tiffany Hernández
 */
public class Add {

    static BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        java.io.File file1 = new java.io.File("Lista.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true));
        String add = "";

        try {

            System.out.println("Ingrese los datos que desea añadir");
            add = br2.readLine();
            bw.newLine();
            bw.write(add);
            bw.close();
            System.out.println("Se ha escrito en el archivo exitosamente");

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
            e.printStackTrace();
        }

    }
}
