# Ma prédiction - Exercice 03

## Traçage ligne par ligne

**Lignes 3-5 :** Initialisation des variables
- age = 25
- estEtudiant = true
- solde = 150

**Ligne 7 :** Affichage
```
Verification du profil ...
```

**Ligne 9 :** `if (age >= 18)`
- Condition : 25 >= 18 → true
- Branche exécutée : if (if / else)

**Ligne 10 :** (si exécuté)
```
Majeur
```

**Ligne 12 :** `if (estEtudiant)`
- Condition : estEtudiant → true
- Branche exécutée : if (if / else)

**Ligne 13 :** (si exécuté)
```
Statut : Etudiant
```

**Ligne 15 :** `if (solde >= 100)`
- Condition : 150 >= 100 → true
- Branche exécutée : if (if / else)

**Ligne 16 :** (si exécuté) `solde = solde - 50;`
- Calcul : 150- 50 = 100
- État : solde = 100

**Ligne 17 :** (si exécuté)
```
Reduction etudiant appliquee
```

**Ligne 29 :** Affichage final
```
Solde final : 100
```



## Résumé du chemin d'exécution

Quelles branches ont été prises ?
- Premier if (age >= 18) : true
- Deuxième if (estEtudiant) : true
- Troisième if (solde >= 100) : true
