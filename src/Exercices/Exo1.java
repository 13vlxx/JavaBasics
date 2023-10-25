package Exercices;
import java.util.Scanner;

public class Exo1 {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre entier :");
        while (!scanner.hasNextInt()) {
            System.out.println("\u001B[31mVeuillez entrer un nombre entier valide :\u001B[0m");
            scanner.next();
        }
        int premierNombre = scanner.nextInt();

        System.out.println("Entrez un second nombre :");
        while (!scanner.hasNextInt()) {
            System.out.println("\u001B[31mVeuillez entrer un nombre entier valide :\u001B[0m");
            scanner.next();
        }
        int secondNombre = scanner.nextInt();

        System.out.println(premierNombre + " + " + secondNombre + " = " + addition(premierNombre, secondNombre));
    }
}
