public class Main {
    public static void main(String[] args) {
        int[] nombres = {3, 7, 2, 8, 5, 1, 9, 4 };

        System.out.println("moyenneInef : " + moyenneInef(nombres));
        System.out.println("moyenneEff : " + moyenneEff(nombres));
        System.out.println("contientDoublonInef : " + contientDoublonInef(nombres));
        System.out.println("contientDoublonEff : " + contientDoublonEff(nombres));
        System.out.println("premierEtDernierInef : " + premierEtDernierInef(nombres));
        System.out.println("premierEtDernierEff: " + premierEtDernierEff(nombres));
        System.out.println("rechercheInef(5) : " + rechercheInef(nombres, 5));
        System.out.println("rechercheEff(5) : " + rechercheEff(nombres, 5));
    }

    // PROBLEME 1 : Calcule la somme à chaque itération
    public static double moyenneInef(int[] t) {
        double moyenne = 0;
        for (int i = 0; i < t.length; i++) {
            int somme = 0;
            for (int j = 0; j <= i; j++) {
                somme = somme + t[j];
            }
            moyenne = (double) somme / (i + 1);
        }
        return moyenne;
    }

    public static double moyenneEff(int[] t) {
        double somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme = somme + t[i];
        }
        return somme / t.length;

    }

    // PROBLEME 2 : Compare chaque paire deux fois
    public static boolean contientDoublonInef(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i != j && t[i] == t[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contientDoublonEff(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < i; j++) {
                if (t[i] == t[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // PROBLEME 3 : Parcourt le tableau deux fois
    public static String premierEtDernierInef(int[] t) {
        int premier = 0;
        for (int i = 0; i < t.length; i++) {
            premier = t[i];
            break;
        }
        int dernier = 0;
        for (int i = 0; i < t.length; i++) {
            dernier = t[i];
        }
        return premier + " et " + dernier;
    }

    public static String premierEtDernierEff(int[] t) {
    int premier = t[0];
    int dernier = 0;
    for (int i = 0; i < t.length; i++) {
        dernier = t[i];
    }
    return premier + " et " + dernier;
}

    // PROBLEME 4 : Continue après avoir trouvé
    public static int rechercheInef(int[] t, int val) {
        int index = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                index = i;
            }
        }
        return index;
    }
    public static int rechercheEff(int[] t, int val) {
    int index = -1;
    for (int i = 0; i < t.length; i++) {
        if (t[i] == val) {
            index = i;
            return index;
        }
    }
    return index;

}
}
