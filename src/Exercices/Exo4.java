package Exercices;
import java.util.Scanner;

public class Exo4 {

    public static void displayNotes(int first, int second, int third) {
        System.out.println("Les trois notes sont : " + first + ", " + second + ", " + third);
    }

    public static void displayAverage(int first, int second, int third) {
        double average = (first + second + third) / 3.0;
        System.out.println("La moyenne des notes est : " + average);
    }

    public static void displayMaxNote(int first, int second, int third) {
        int max = Math.max(first, Math.max(second, third));
        System.out.println("La note la plus grande est : " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la première note :");
        int firstNumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("\u001B[31mVeuillez entrer un nombre valide :\u001B[0m");
            scanner.next();
        }
        firstNumber = scanner.nextInt();

        System.out.println("Entrez la deuxième note :");
        int secondNumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("\u001B[31mVeuillez entrer un nombre valide :\u001B[0m");
            scanner.next();
        }
        secondNumber = scanner.nextInt();

        System.out.println("Entrez la troisième note :");
        int thirdNumber = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("\u001B[31mVeuillez entrer un nombre valide :\u001B[0m");
            scanner.next();
        }
        thirdNumber = scanner.nextInt();

        displayNotes(firstNumber, secondNumber, thirdNumber);
        displayAverage(firstNumber, secondNumber, thirdNumber);
        displayMaxNote(firstNumber, secondNumber, thirdNumber);
    }
}
