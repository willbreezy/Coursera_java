import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        for (int i = debut; i <= fin; i++) {
            int n = i;
            int steps = 0;
            
            while (n != 0) {
                if (n % 3 == 0) {
                    n += 4;
                } else if (n % 4 == 0) {
                    n /= 2;
                } else {
                    n -= 1;
                }
                steps++;
            }

            System.out.println(i + " -> " + steps);
        }

        /*******************************************
         * Ne rien modifier apres cette ligne
         *******************************************/
        clavier.close();
    }
}