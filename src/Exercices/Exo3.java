package Exercices;
import java.util.Scanner;
public class Exo3 {

    public static String multiply(int a){
        String table = "";
        for (int number = 0; number <= 10; number++) {
            table += a + " x " + number + " = " + a*number + "\n";
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre pour voir sa table de multiplication :");
        while(!scanner.hasNextInt()){
            System.out.println("\u001B[31mVeuillez entrer un nombre valide :\u001B[0m");
            scanner.next();
        }
        int a = scanner.nextInt();
        System.out.println(multiply(a));
    }
}
