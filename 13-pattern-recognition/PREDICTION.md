# Ma prédiction - Exercice 13

**Données :** nombres = {4, 8, 2, 9, 5, 1, 7, 3}

---

## func1 - Pattern A

**Structure observée :**
- Initialisation : res = 0
- Boucle : res = res + t[i]
- Return res

**Nom du pattern :** accumulateur

**Résultat prédit :** func1(nombres) = 39

---

## func2 - Pattern B

**Structure observée :**
- Initialisation : res = t[0]
- Boucle : si t[i] < res alors res = t[i]
- Return res

**Nom du pattern :** minimum d'un tableau

**Résultat prédit :** func2(nombres) = 1

---

## func3 - Pattern C

**Structure observée :**
- Initialisation : res = 0
- Boucle : si t[i] > val alors res++
- Return res

**Nom du pattern :** compteur (compteur de tout les nombres supérieurs à val)

**Résultat prédit :** func3(nombres, 5) = 3

---

## func4 - Pattern D

**Structure observée :**
- Boucle : si t[i] == val alors return i
- Après boucle : return -1

**Nom du pattern :** retourne le premier index si on trouve une valeur correspondant à val

**Résultat prédit :** func4(nombres, 5) = 4

---

## func5 - Pattern E

**Structure observée :**
- Boucle : si t[i] == val alors return true
- Après boucle : return false

**Nom du pattern :** savoir si la val est dans le tableau

**Résultat prédit :** func5(nombres, 5) = true
