public class Main {
    public static void main(String[] args) {
        int[] nombres = { 3, 7, 2, 8, 5 };

        // Test 1 : Trouver le maximum
        // Attendu : 8
        System.out.println("Max : " + trouverMax(nombres));

        // Test 2 : Vérifier si contient 7
        // Attendu : true
        System.out.println("Contient 7 : " + contient(nombres, 7));

        // Test 3 : Calculer la somme des pairs
        // Attendu : 10 (2 + 8)
        System.out.println("Somme pairs : " + sommePairs(nombres));

        // Test 4 : Dupliquer chaque élément
        // Attendu : {3, 3, 7, 7, 2, 2, 8, 8, 5, 5}
        int[] duplique = dupliquer(nombres);
        System.out.print("Duplique : ");
        for (int n : duplique)
            System.out.print(n + " ");
        System.out.println();
    }

    // Remplace les ??? par le bon code
    public static int trouverMax(int[] t) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }

    // Remplace les ??? par le bon code
    public static boolean contient(int[] t, int val) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                return true;
            }
        }
        return false;
    }

    // Remplace les ??? par le bon code
    public static int sommePairs(int[] t) {
        int somme = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                somme = somme + t[i];
            }
        }
        return somme;
    }

    // Remplace les ??? par le bon code
    public static int[] dupliquer(int[] t) {
        int[] res = new int[t.length * 2];
        for (int i = 0; i < t.length; i++) {
            res[i *2] = t[i];
            res[i * 2 + 1] = t[i];
        }
        return res;
    }
}
