package tema_3;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea șirului de caractere inițial
        System.out.print("Introduceți șirul de caractere: ");
        String inputString = scanner.nextLine();

        // Citirea șirului de caractere pentru inserare
        System.out.print("Introduceți șirul de caractere pentru inserare: ");
        String insertString = scanner.nextLine();

        // Citirea poziției de inserare
        System.out.print("Introduceți poziția de inserare: ");
        int insertPosition = scanner.nextInt();

        // Citirea poziției de început a ștergerii și numărului de caractere de șters
        System.out.print("Introduceți poziția de început a ștergerii: ");
        int deletePosition = scanner.nextInt();

        System.out.print("Introduceți numărul de caractere de șters: ");
        int deleteLength = scanner.nextInt();

        // Crearea unui obiect StringBuilder pe baza șirului de caractere inițial
        StringBuilder stringBuilder = new StringBuilder(inputString);

        // Inserarea șirului în poziția specificată
        stringBuilder.insert(insertPosition, insertString);

        // Ștergerea porțiunii specificate de text
        stringBuilder.delete(deletePosition, deletePosition + deleteLength);

        // Afișarea rezultatului final
        System.out.println("Rezultat: " + stringBuilder.toString());
    }
}

