package tema_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws FileNotFoundException {

        // Se deschide un scanner pentru citirea din fișierul "cantec_in.txt"
        Scanner my_scanner = new Scanner(new File("cantec_in.txt"));

        // Se deschide un flux de ieșire pentru scrierea în fișierul "out.txt"
        PrintStream flux_out = new PrintStream ("out.txt");

        // Se creează un obiect de tip Random pentru generarea de numere aleatoare
        Random my_random = new Random();

        Vers vers; // Se va folosi pentru a reprezenta un vers

        // Începe procesarea versurilor
        while(my_scanner.hasNextLine())
        {
            // Se creează un obiect de tip Vers pe baza liniei citite
            vers = new Vers(my_scanner.nextLine());

            // Dacă un număr aleatoriu este mai mic decât 0.1, se majusculizează versul
            if (my_random.nextFloat() < 0.1)
            {
                vers.makeUpperCase();
            }

            // Se scriu informațiile procesate în fișierul de ieșire
            flux_out.print(vers.getString() + " "); // Versul
            flux_out.print(vers.wordsCount() + " "); // Numărul de cuvinte
            flux_out.print(vers.vowelsCount() + " "); // Numărul de vocale

            // Dacă versul se termină cu "Rock", se adaugă o steluță
            if (vers.endsWith("Rock"))
                flux_out.print("* ");

            flux_out.print("\n"); // Trecem la linia următoare
        }

        // Se închid fluxul de ieșire și scanner-ul
        flux_out.close();
        my_scanner.close();
    }
}
