public class Main {
    public static void main(String[] args) {
        int[] nombres = { 5, 2, 8, 1, 9, 2 };

        System.out.println("=== Test moyenne ===");
        System.out.println("moyenne : " + moyenne(nombres));

        System.out.println("\n=== Test estTrie ===");
        int[] trie = { 1, 2, 3, 4, 5 };
        int[] pasTrie = { 1, 3, 2, 4, 5 };
        System.out.println("trie : " + estTrie(trie));
        System.out.println("pasTrie : " + estTrie(pasTrie));

        System.out.println("\n=== Test inverse ===");
        int[] original = { 1, 2, 3, 4, 5 };
        inverse(original);
        System.out.print("inverse : ");
        for (int n : original)
            System.out.print(n + " ");
        System.out.println();

        System.out.println("\n=== Test compteur ===");
        System.out.println("nb de 2 : " + compter(nombres, 2));
    }

    // BUG 1 : Cette fonction devrait calculer la moyenne
    public static int moyenne(int[] t) {
        int somme = 0;
        // for (int i = 0; i <= t.length; i++) {
        // somme = somme + t[i];
        // }
        for (int i = 0; i < t.length; i++) {
            somme = somme + t[i];
        }
        return somme / t.length;
    }

    // BUG 2 : Cette fonction devrait vérifier si le tableau est trié
    public static boolean estTrie(int[] t) {
        // for (int i = 0; i < t.length; i++) {
        // if (t[i] > t[i + 1]) {
        // return false;
        // }
        // }
        // return true;
        for (int i = 0; i < t.length - 1; i++) {
            if (t[i] > t[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // BUG 3 : Cette fonction devrait inverser le tableau
    public static void inverse(int[] t) {
        // for (int i = 0; i < t.length; i++) {
        // int temp = t[i];
        // t[i] = t[t.length - 1 - i];
        // t[t.length - 1 - i] = temp;
        // }
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - 1 - i; j++) {
                if (t[j] < t[j + 1]) {
                    int tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
                }
            }
        }
    }

    // BUG 4 : Cette fonction devrait compter les occurrences
    public static int compter(int[] t, int val) {
        int count = 0;
        // for (int i = 0; i < t.length; i++) {
        // if (t[i] == val) {
        // count++;
        // return count;
        // }
        // }
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                count++;
            }
        }
        return count;
    }
}
