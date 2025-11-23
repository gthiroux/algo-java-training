public class Main {
    public static void main(String[] args) {
        int age = 25;
        boolean estEtudiant = true;
        int solde = 150;

        System.out.println("Verification du profil...");

        if (age >= 18) {
            System.out.println("Majeur");

            if (estEtudiant) {
                System.out.println("Statut : Etudiant");

                if (solde >= 100) {
                    solde = solde - 50;
                    System.out.println("Reduction etudiant appliquee");
                } else {
                    System.out.println("Solde insuffisant pour reduction");
                }
            } else {
                System.out.println("Statut : Non etudiant");
                solde = solde - 100;
            }
        } else {
            System.out.println("Mineur");
            System.out.println("Acces refuse");
        }
        System.out.println("Solde final : " + solde);
    }
}
