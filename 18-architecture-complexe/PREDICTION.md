# Ma prédiction - Exercice 18

## Architecture

**Classes présentes :**
- Main →classe principale qui va gérer toute "l'applicaton"
- Banque → classe ayant un nom et un nombre de clients
- Client → classe ayant un nom et un instance de Compte
- Compte → classe s'occupant du solde

**Qui contient quoi ?**
- Banque contient : un constructeur avec le nom de la banque,les clients sous forme de tableau de la classe Client, et un compteur de client; une fonction pour ajouter un client ; une pou rafficher tous les clients du tableau , et une pour afficher le total d'argent que possède la banque

- Client contient :  un constructeur pour le nom et le compte du client, 2 fonction getters pour le nom et le compte, une fonction pour rajouter du solde au compte et une autre pour en enlever, et une fonction pour transferer de l'argent à un autre client.

- Compte contient : un int solde privé (instancié dans le contructeur), une fonction qui permet de récupérer le solde en dehors de la classe, une fonction pour rajouter à solde, et une fonction pour diminuer le solde 

---

## Traçage de l'exécution

### Création des objets

**Ligne 3 :** `new Banque("MaBanque")`
- Crée une Banque avec clients[] vide

**Lignes 5-6 :** `new Client(...)`
- Alice créé avec un Compte (solde = 0)
- Bob créé avec un Compte (solde = 0)

**Lignes 8-9 :** `ajouterClient(...)`
- clients[0] = alice, nbClients = 1
- clients[1] = bob, nbClients = 2

---

### Dépôts

**Ligne 11 :** `alice.deposer(100)`
- Appelle compte.crediter(100)
- Alice.compte.solde = 0 + 100 = 100

**Ligne 12 :** `bob.deposer(50)`
- Bob.compte.solde = 50

---

### Affichage initial

```
alice : 100
bob : 50

```

---

### Transfert

**Ligne 17 :** `alice.transferer(bob, 30)`

Que se passe-t-il dans transferer() ?
1. `this.retirer(30)` → Alice.compte.solde = 100-30=70
2. `destinataire.deposer(30)` → Bob.compte.solde = 50+30=80

---

### Affichage après transfert

```
alice : 70
bob : 80

```

---

### Total en banque

**Ligne 22 :** `banque.totalDepots()`
- total = 70 + 80 = 150

```
Total :150
```
