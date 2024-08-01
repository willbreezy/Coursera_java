class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        // Variable pour stocker l'élément le plus fréquent et son nombre d'occurrences
        int plusFrequent = tab1[0];
        int maxCount = 0;

        //parcourir chaque élément du tableau
        for (int i = 0; i < taille; i++) {
            int currentElement = tab1[i];
            int count = 0;

            // compter le nombre d'occurrences de l'élément courant 
            for (int j = 0; j < taille; j++) {
                if (currentElement == tab1[j]) {
                    count++;
                }
            }

            // Si le nombre d'occurrences de l'élément courant est supérieur au maxCount
            // on met à jour le mostFrequent et le maxCount
            if (count > maxCount) {
                maxCount = count;
                plusFrequent = currentElement;
            }
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(plusFrequent + " (" + maxCount + " x)");
        System.out.println();
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
