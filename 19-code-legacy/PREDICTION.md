# Ma prédiction - Exercice 19

## Partie 1 : Comprendre l'existant

### Classe `Produit`

**Attributs (noms cryptiques) :**

- `n` représente : nom du produit
- `p` représente : prix du produit
- `q` représente : quantité du produit

**Méthode `valeur()` :**

- Que calcule-t-elle ? la valeur du produit par rapport à son prix et sa quantité

---

### Classe `Inventaire`

**Attributs :**

- `prods` représente : tableau regroupant tous les produits
- `nb` représente : le nombre de produit (index)

**Méthodes :**

- `ajouter(Produit p)` : ajout d'un objet Poduit dans le tableau à l'index nb
- `chercher(String nom)` : cherche dans le tableau prods par rapport au nomp du produit et return le produit trouvé
- `afficher()` : boucle sur le tableau prods et affiche le nom, le prix et la quantité du produit
- `valeurTotale()` : accumulateur de la valeur des produits dans le tableau prods

---

## Partie 2 : Prédire la sortie actuelle

```
=== Inventaire ===
Pomme : 2.50 x 100
Pain : 1.20 x 50
Lait : 0.95 x 75
Beurre : 2.10 x 30

=== Recherche 'Pain' ===
Trouve : Pain a 1.20 euros

=== Valeur totale ===
Valeur : 444.25 euros

```

---

## Partie 3 : Ajouter la fonctionnalité

**Fonctionnalité demandée :**
Ajouter une méthode `afficherCher(double seuil)` qui affiche les produits dont le prix est supérieur au seuil.

**Ma méthode :**

```java
public void afficherCher(double seuil) {
    for (int i = 0; i < nb; i++) {
            if (prods[i].getPrix() > seuil) {
                System.out.println("Le prix de " + prods[i].getNom() + " est supérieur à " + seuil);
            }

        }
}
```

**Sortie attendue pour `afficherCher(2.0)` :**

```
=== Produits chers (>2 euros) ===
Le prix de Pomme est supérieur à 2 euros.
Le prix de Beurre est supérieur à 2 euros.

```
