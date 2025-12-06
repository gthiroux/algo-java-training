public class Main {
    public static void main(String[] args) {
        System.out.println("estPositif(5) : " + estPositif(5));
        System.out.println("estPositif(-3) : " + estPositif(-3));

        System.out.println("valeurAbsolue(5) : " + valeurAbsolue(5));
        System.out.println("valeurAbsolue(-3) : " + valeurAbsolue(-3));

        System.out.println("estPair(4) : " + estPair(4));
        System.out.println("estPair(7) : " + estPair(7));

        System.out.println("max(5, 3) : " + max(5, 3));
        System.out.println("max(2, 8) : " + max(2, 8));

        System.out.println("signe(5) : " + signe(5));
        System.out.println("signe(-3) : " + signe(-3));
        System.out.println("signe(0) : " + signe(0));
    }

    // Version verbeuse - à simplifier
    public static boolean estPositif(int n) {
        // if (n > 0) {
        // return true;
        // } else {
        // return false;
        // }
        if (n < 0) {
            return false;
        }
        return true;
    }

    // Version verbeuse - à simplifier
    public static int valeurAbsolue(int n) {
        // if (n < 0) {
        // n = n * -1;
        // return n;
        // } else {
        // return n;
        // }
        if (n < 0) {
            n = n * -1;
        }
        return n;
    }

    // Version verbeuse - à simplifier
    public static boolean estPair(int n) {
        // int reste = n % 2;
        // if (reste == 0) {
        // return true;
        // } else {
        // return false;
        // }
        if (n % 2 != 0) {
            return false;
        }
        return true;
    }

    // Version verbeuse - à simplifier
    public static int max(int a, int b) {
        // int resultat;
        // if (a > b) {
        // resultat = a;
        // } else {
        // resultat = b;
        // }
        // return resultat;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Version verbeuse - à simplifier
    public static String signe(int n) {
        // String resultat;
        // if (n > 0) {
        // resultat = "positif";
        // } else {
        // if (n < 0) {
        // resultat = "negatif";
        // } else {
        // resultat = "zero";
        // }
        // }
        // return resultat;
        if (n != 0) {
            if (n < 0) {
                return "negatif";
            }
            return "positif";
        } else {
            return "zero";
        }
    }
}
