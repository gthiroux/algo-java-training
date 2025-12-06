# Ma prédiction - Exercice 11

## Analyse des fonctions

### Fonction `xxx(int[] t)`

**Que fait cette fonction ?**
- Analyse le code ligne par ligne :
  - r = t[0] → r est un int initialiser à t[0] = 3
  - Boucle : si t[i] > r alors r = t[i] → vérification de t[i]>r alors r prend la valeur de t[i] sinon il garde la valeur de t[i] précédent
  - return r → retourne un int à l afin de la boucle (9)

**En une phrase, cette fonction :** Cette fonction va chercher le int le plus grand dans le tableau t

**xxx({3, 7, 2, 9, 1, 5}) = ___**

xxx({3, 7, 2, 9, 1, 5}) = 9

### Fonction `yyy(int[] t)`

**Que fait cette fonction ?**
- Analyse :
  - r = 0 → r est un int initialiser à 0
  - Boucle : r = r + t[i] → ajout à r la valeur de t[i] à chaque fois que i augmente
  - return r → retourne un int après la fin de la boucle (27)

**En une phrase, cette fonction :**  Cette fonction additionne tous les int du tableau t

**yyy({3, 7, 2, 9, 1, 5}) = ___**
yyy({3, 7, 2, 9, 1, 5}) = 27

### Fonction `zzz(int[] t, int v)`

**Que fait cette fonction ?**
- Première boucle : compte les éléments où t[i] < v → 3 fois
- Crée un nouveau tableau de taille c → tableau de 3 éléments
- Deuxième boucle : remplit le tableau avec les éléments < v → mettre la valeur de t[i] dans le tableau res à l'index j si t[i]< v

**En une phrase, cette fonction :** Cette fonctionne renvoie un tableau avec tout les int qui sont plus petits que la valeur donnée en paramètre

**zzz({3, 7, 2, 9, 1, 5}, 4) = {___}**

zzz({3, 7, 2, 9, 1, 5}, 4) = {3,2,1}

### Fonction `aaa(int[] t)`

**Que fait cette fonction ?**
- Double boucle imbriquée → Parcours le tableau t en réduisant l'index de 1 à chaque fois que la 2eme boucle fini. 
1ere itération: i = 0 => j prendra la valeur 0, 1 ,2, 3, 4
2eme itération: i = 1 => j prendra la valeur 0, 1 ,2, 3
3eme itération: i = 2 => j prendra la valeur 0, 1 ,2
4eme itération: i = 3 => j prendra la valeur 0, 1 
derniere itération: i = 4 => j prendra la valeur 0 
- Compare t[j] et t[j+1], échange si t[j] > t[j+1] →  Si t[j]>t[j+1] (comparela valeur actuelle de j avec la valeur suivante)=> condition respectée alors t[j+1] prend la valeur de de t[j] et t[j] prend la valeur de t[j]

**En une phrase, cette fonction :** Cette fonction sert à trier le tableau dans l'ordre croissant (du plus petit au plus grand)

**Après aaa({3, 7, 2, 9, 1, 5}) : {___}**
Après aaa({3, 7, 2, 9, 1, 5}) : {1,2,3,5,7,9}

