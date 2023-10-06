package tema_4; // Aceasta specifică că această clasă se află în pachetul "tema_4".

import java.util.Scanner; // Importăm clasa Scanner pentru a permite citirea de la tastatură.

public class MainApp { // Definim clasa MainApp.

    public static void main(String[] args) { // Metoda principală a programului.
        Scanner scanner = new Scanner(System.in); // Creăm un obiect de tip Scanner pentru citirea de la tastatură.

        System.out.print("Introduceți numărul de persoane: "); // Afișăm un mesaj pentru a solicita numărul de persoane.
        int n = scanner.nextInt(); // Citim numărul de la tastatură.
        scanner.nextLine(); // Consumăm newline pentru a evita probleme la citirea ulterioară a șirurilor de caractere.

        Persoana[] persoane = new Persoana[n]; // Creăm un vector de obiecte de tip Persoana pentru a stoca informațiile.

        for (int i = 0; i < n; i++) { // Iterăm pentru fiecare persoană.
            System.out.print("Introduceți numele persoanei " + (i + 1) + ": "); // Afișăm un mesaj pentru a solicita numele.
            String nume = scanner.nextLine(); // Citim numele de la tastatură.

            String cnp;
            while (true) { // Intrăm într-un buclu infinit.
                System.out.print("Introduceți CNP-ul persoanei " + (i + 1) + ": "); // Afișăm un mesaj pentru a solicita CNP-ul.

                cnp = scanner.nextLine(); // Citim CNP-ul de la tastatură.

                if (validareCNP(cnp)) { // Verificăm dacă CNP-ul este valid folosind metoda validareCNP.
                    break; // Dacă este valid, ieșim din buclu.
                } else {
                    System.out.println("CNP invalid. Reintroduceți."); // Dacă nu este valid, afișăm un mesaj de eroare.
                }
            }

            persoane[i] = new Persoana(nume, cnp); // Creăm un obiect Persoana cu numele și CNP-ul și îl stocăm în vector.
        }

        for (Persoana persoana : persoane) { // Iterăm prin fiecare Persoana din vector.
            System.out.println(persoana.toString()); // Afișăm informațiile despre fiecare persoană.
        }
    }

    public static boolean validareCNP(String cnp) { // Metodă pentru validarea CNP-ului.
        return cnp.matches("[0-9]+") && cnp.length() == 13 && "1256".contains(cnp.substring(0, 1)); // Returnăm true dacă CNP-ul respectă regulile.
    }
}
