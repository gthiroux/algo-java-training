public class Main {
    public static void main(String[] args) {
        System.out.println("=== CHALLENGE FINAL ===\n");

        // Partie 1 : Traçage avec références
        System.out.println("--- Partie 1 : References ---");
        Noeud a = new Noeud(1);
        Noeud b = new Noeud(2);
        Noeud c = new Noeud(3);

        a.suivant = b;
        b.suivant = c;

        Noeud courant = a;
        while (courant != null) {
            System.out.print(courant.valeur + " -> ");
            courant = courant.suivant;
        }
        System.out.println("null");

        // Partie 2 : Récursion
        System.out.println("\n--- Partie 2 : Recursion ---");
        System.out.println("sommeRecursive(a) = " + sommeRecursive(a));

        // Partie 3 : Pattern + Bug
        System.out.println("\n--- Partie 3 : Trouver le bug ---");
        int[] valeurs = {5, 2, 8, 2, 9, 2, 1};
        System.out.println("compterOccurrences(valeurs, 2) = " + compterOccurrences(valeurs, 2));
        System.out.println("Attendu : 3");

        // Partie 4 : Architecture
        System.out.println("\n--- Partie 4 : Architecture ---");
        Liste liste = new Liste();
        liste.ajouter(10);
        liste.ajouter(20);
        liste.ajouter(30);

        System.out.println("Somme liste : " + liste.somme());
        liste.doubler();
        System.out.println("Apres doubler : " + liste.somme());
    }

    public static int sommeRecursive(Noeud n) {
        if (n == null) {
            return 0;
        }
        return n.valeur + sommeRecursive(n.suivant);
    }

    // Cette fonction contient un bug !
    public static int compterOccurrences(int[] t, int val) {
        int count = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                count++;
                // break;
            }
        }
        return count;
    }
}
