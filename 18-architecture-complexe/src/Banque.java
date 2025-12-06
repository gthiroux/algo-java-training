public class Banque {
    private String nom ;
    private Client[] clients;
    private int nbClients;

    public Banque(String nom) {
        this.nom = nom;
        this.clients = new Client[10];
        this.nbClients = 0;
    }

    public void ajouterClient(Client c) {
        clients[nbClients] = c;
        nbClients++;
    }

    public void afficherClients() {
        for (int i = 0; i < nbClients; i++) {
            System.out.println(clients[i].getNom() + " : " + clients[i].getSolde());
        }
    }

    public int totalDepots() {
        int total = 0;
        for (int i = 0; i < nbClients; i++) {
            total = total + clients[i].getSolde();
        }
        return total;
    }
}
