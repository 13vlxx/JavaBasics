public class Main {
    public static void main(String[] args) {
        int cpt = 10;
        String output = "";
        /* while(cpt >= 0) {
            //System.out.println(cpt);
            output += cpt + "\n";
            cpt--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(output);
        */
        for(int count = 10; count >= 0; count--)
            output += count + "\n";
        System.out.println(output);

        // La portée d'une variable va de l'endroit d'ou on initialise la variable jusqu'à la fermeture de son block
    }
}