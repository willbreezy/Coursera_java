import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        // Constantes et variables initiales
        final double g = 9.81;
        double v0 = 0.0;
        double t0 = 0.0;
        double surface = 2.0;
        double vitesse = v0;
        double accel = g;
        double hauteur = h0;
        double t = t0;
        double s = surface / masse;
        double q = Math.exp(-s*(t-t0));
        double v = ((g/s)*(1-q)+v0*q);
        double h = (h0-(g/s)*(t-t0)-((v0-(g/s))/s)*(1-q));
        double a = g-s*v;
        boolean vitesseSonAtteinte = false;
        boolean vitesseMaximaleAtteinte = false;
        boolean parachuteOuvert = false;

        // Affichage des valeurs initiales
        System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
        t++;

        while (h > 0.0) {
            s = surface/masse;
            q = Math.exp(-s*(t-t0));
            v = ((g/s)*(1-q)+v0*q);
            h = (h0-(g/s)*(t-t0)-((v0-(g/s))/s)*(1-q));
            a = g-s*v;

            if(v > 343.0 && vitesseMaximaleAtteinte == false) {
                vitesseMaximaleAtteinte = true;
                System.out.println("## Felix depasse la vitesse du son");
            }

            if (a < 0.5 && vitesseSonAtteinte == false) {
                vitesseSonAtteinte = true;
                System.out.println("## Felix a atteint sa vitesse maximale");
            }

            if (h < 2500 && parachuteOuvert == false) {
                System.out.println("## Felix ouvre son parachute");
                parachuteOuvert = true;
                surface = 25.0;
                v0 = v;
                t0 = t;
                h0 = h;
            }

            if (h > 0.0) {
                System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, h, v, a);
            }
            
            t++;
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}