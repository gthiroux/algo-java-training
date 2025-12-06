public class Main {
    public static void main(String[] args) {
        int[] data = {3, 7, 2, 9, 1, 5};

        System.out.println("Avant : ");
        afficher(data);

        int r1 = xxx(data);
        System.out.println("xxx(data) = " + r1);

        int r2 = yyy(data);
        System.out.println("yyy(data) = " + r2);

        int[] r3 = zzz(data, 4);
        System.out.println("zzz(data, 4) : ");
        afficher(r3);

        aaa(data);
        System.out.println("Apres aaa(data) : ");
        afficher(data);
    }

    public static int xxx(int[] t) {
        int r = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > r) {
                r = t[i];
            }
        }
        return r;
    }

    public static int yyy(int[] t) {
        int r = 0;
        for (int i = 0; i < t.length; i++) {
            r = r + t[i];
        }
        return r;
    }

    public static int[] zzz(int[] t, int v) {
        int c = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < v) c++;
        }
        int[] res = new int[c];
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < v) {
                res[j] = t[i];
                j++;
            }
        }
        return res;
    }

    public static void aaa(int[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - 1 - i; j++) {
                if (t[j] > t[j + 1]) {
                    int tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
                }
            } 
        }
    }

    public static void afficher(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }
}
