public class Functions {

    int addition(int a, int b) {
        return a + b;
    }
    public static void affichString(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        // Sous-programme effectuant une tâche ou un calcul et pouvant renvoyer un résultat ou pas.
        Functions functions = new Functions();

        affichString("Bonjour Alex");
        System.out.println(functions.addition(13,20));
    }
}