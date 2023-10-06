package tema_3_fisier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws FileNotFoundException {
        // Se deschide un scanner pentru citirea din fișierul "input.txt"
        Scanner scanner = new Scanner(new File("text.txt"));

        // Se citesc valorile din fișier
        String inputString = scanner.nextLine(); // Se citeste primul șir
        String insertString = scanner.nextLine(); // Se citește al doilea șir
        int insertPosition = scanner.nextInt(); // Se citește poziția de inserare
        int deletePosition = scanner.nextInt(); // Se citește poziția de ștergere
        int deleteLength = scanner.nextInt(); // Se citește numărul de caractere de șters

        // Se creează un obiect StringBuilder pe baza șirului inițial
        StringBuilder stringBuilder = new StringBuilder(inputString);

        // Inserarea șirului în poziția specificată
        stringBuilder.insert(insertPosition, insertString);

        // Ștergerea porțiunii specificate de text
        stringBuilder.delete(deletePosition, deletePosition + deleteLength);

        // Se afișează rezultatul final
        System.out.println("Rezultat: " + stringBuilder.toString());
    }
}

