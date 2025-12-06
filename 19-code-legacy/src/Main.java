public class Main {
    public static void main(String[] args) {
        Inventaire inv = new Inventaire(10);

        inv.ajouter(new Produit("Pomme", 2.50, 100));
        inv.ajouter(new Produit("Pain", 1.20, 50));
        inv.ajouter(new Produit("Lait", 0.95, 75));
        inv.ajouter(new Produit("Beurre", 2.10, 30));

        System.out.println("=== Inventaire ===");
        inv.afficher();

        System.out.println("\n=== Recherche 'Pain' ===");
        Produit p = inv.chercher("Pain");
        if (p != null) {
            System.out.println("Trouve : " + p.getNom() + " a " + p.getPrix() + " euros");
        }

        System.out.println("\n=== Valeur totale ===");
        System.out.println("Valeur : " + inv.valeurTotale() + " euros");

        // TODO: Ajouter ici l'appel à la nouvelle fonctionnalité
        System.out.println("\n=== Produits chers (>2 euros) ===");
        inv.afficherCher(2.0);
    }
}
