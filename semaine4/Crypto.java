import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

         // on filtre la chaine d'entrée pour ne garder que les lettres de l'alphabet et les espaces
         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ALPHABET.indexOf(c) != -1 || c ==' ') {
                aCoder += c;
            }
         }

        for (int i = 0; i < aCoder.length(); i++) {
            char c = aCoder.charAt(i);

            if (c == ' ') {
                chaineCodee += c;
            } else {
                int oldindex = ALPHABET.indexOf(c);
                int newindex = (DECALAGE + oldindex) % ALPHABET.length();
                chaineCodee += ALPHABET.charAt(newindex);
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}