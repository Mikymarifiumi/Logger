
//author Michele Marisaldi

package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Logger {

    public static void main(String[] args) {

        FileWriter out;

        Scanner lettore = new Scanner(System.in);
        System.out.print("Inserisci la frase: ");
        String s = lettore.nextLine();

        try {
            out = new FileWriter("data/output.txt");
            out.write(s);
            out.close();
        } catch (IOException ex) {
            System.out.println("Errore: " + ex.getMessage());
        }
    }
}
