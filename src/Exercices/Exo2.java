package Exercices;
import java.util.Scanner;

public class Exo2 {

    public static boolean isMajor(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comment vous appelez-vous ?");
        while (!scanner.hasNext()) {
            System.out.println("\u001B[31mVeuillez entrer un nom valide :\u001B[0m");
            scanner.next();
        }
        String prenom = scanner.nextLine();
        System.out.println("Quel âge avez-vous ?");
        while (!scanner.hasNextInt()) {
            System.out.println("\u001B[31mVeuillez entrer un âge valide :\u001B[0m");
            scanner.next();
        }
        int age = scanner.nextInt();
        System.out.println("Bonjour " + prenom + ", vous êtes " + (isMajor(age) ? "majeur" : "mineur"));
    }
}
