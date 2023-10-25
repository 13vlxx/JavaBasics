package Exercices.Correction;

import java.util.Scanner;

public class Correction {
    public static void main(String[] args) {
//        exo1();
//        exo2();
//        exo3();
        exo4();
    }

    private static void exo1(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Rentrez un nombre entier :");
            int nb1 = scanner.nextInt();
            System.out.println("Rentrez un autre nombre entier :");
            int nb2 = scanner.nextInt();
            System.out.println(nb1 + " + " + nb2 + " = " + (nb1 + nb2));
            scanner.close();
        }catch (Exception e) {
            System.out.println("Sale merde");
        }
    }

    private static void exo2(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Rentrez votre nom :");
            String nom = scanner.nextLine();
            System.out.println("Rentrez votre âge :");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Bonjour " + nom + ", vous êtes " + (age < 18 ? "mineur" : "majeur"));
            scanner.close();
        }catch (Exception e) {}
    }

    private static void exo3(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Entrez un nombre pour voir sa table de multiplication :");
            int nb = scanner.nextInt();
            String output = "";
            for (int i = 1; i <= 10; i++) {
                output += nb + " x " + i + " = " + nb*i + "\n";
            }
            System.out.println(output);
            scanner.close();
        } catch (Exception e){

        }
    }

    private static void exo4(){
        Scanner scanner = new Scanner(System.in);
        try{
            int[] nbrs = new int[3];
            System.out.println("Entrez un nombre :");
            nbrs[0] = scanner.nextInt();
            System.out.println("Entrez 2e nombre :");
            nbrs[1] = scanner.nextInt();
            System.out.println("Entrez 3e nombre :");
            nbrs[2] = scanner.nextInt();
            scanner.nextLine();

            String afficheTab = "";
            int sum = 0;
            int valMax = Integer.MIN_VALUE;

            for (int nb: nbrs) {
                afficheTab += nb + ", ";
                sum += nb;
                if(nb > valMax)
                    valMax = nb;
            }

            System.out.println("Le tableau obtenu : " + afficheTab + "\n"
                    + "La valeur moyenne est : " + (double) sum / nbrs.length + "\n"
                    + "La plus grande valeur est : " + valMax);
        }catch (Exception e){}
    }
}
