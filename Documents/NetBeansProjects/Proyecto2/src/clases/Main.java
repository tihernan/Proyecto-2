package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  
 * @author Fabricio Castro
 * @author Tiffany Hernández
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        java.io.File file1 = new java.io.File("Lista.txt");
        BufferedReader br = new BufferedReader(new FileReader("Lista.txt"));
        String data;

        try {
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
            e.printStackTrace();
        }

    }
}
