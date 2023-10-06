package tema_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {

        int NUMAR_JUDETE = 41;

        String[] judete = new String[NUMAR_JUDETE];

        Scanner my_scanner = new Scanner(new File("judete_in.txt"));

        int index = 0;
        while (my_scanner.hasNextLine()) {
            judete[index] = my_scanner.nextLine();
            index++;
        }



        Arrays.sort(judete);

        for (String s : judete) {
            System.out.println(s);
        }

        System.out.print("\n");

        // Conversia tuturor județelor la litere mari
        for (int i = 0; i < judete.length; i++) {
            judete[i] = judete[i].toUpperCase();
        }

        my_scanner.close();
        my_scanner = new Scanner(System.in);

        System.out.print("Introduceti judetul cautat: ");
        String input_judet = my_scanner.nextLine();

        // Convertim input-ul la litere mari
        input_judet = input_judet.toUpperCase();

        System.out.print("Judetul introdus se afla pe pozitia: ");
        System.out.println(Arrays.binarySearch(judete, input_judet));

        my_scanner.close();


    }
}
