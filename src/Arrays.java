public class Arrays {
    public static void main(String[] args) {
        // String[] array = new String[] {"A", "B", "C"};
        // String[] array = new String[3];
        /* String[] array = {"A", "B", "C"};
        String[] array2 = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) array2[i] = array[i];
        array2[array.length] = "D";

        for (String el : array2) output += el + "\n";
        System.out.println(output); */

        String output = "";
        String[][] array = new String[2][3];
        array[0][0] = "A";
        array[0][1] = "B";
        array[0][2] = "C";
        array[1][0] = "D";
        array[1][1] = "E";
        array[1][2] = "F";

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                output += array[row][col] + " ";
            }
                output += "\n";
        }

        System.out.println(output);

        /* for (String[] el : array) {
            int cpt = 0;
            for (String el2 : el) {
                boolean n = false;
                cpt++;
                if(cpt == 3) {
                    n = true;
                }
                output += el2 + " " + (n ? "\n" : "");
            }
        }
        System.out.println(output); */
    }
}