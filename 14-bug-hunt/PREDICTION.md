# Ma prédiction - Exercice 14

## BUG 1 : fonction `moyenne`

**Ligne suspecte :** 28

**Description du bug :** i=6

**Ce qui va se passer :** i ne peut pas etre egale à 6 car le tableau ne possède pas d'index 6, plantage de java

**Correction proposée :** i<t.length

---

## BUG 2 : fonction `estTrie`

**Ligne suspecte :** 36-37

**Description du bug :** dans la dernière itération, on compare t[4] à t[5] mais t.lenght = 5 donc l'index 5 n'existe pas (on commence à l'index 0)

**Ce qui va se passer :** plantage de java car index > longueur du tableau

**Correction proposée :** i< t.length -1

---

## BUG 3 : fonction `inverse`

**Ligne suspecte :** 48

**Description du bug :** en prenant l'index t.length-1-i, dans les dernières itérations, on reprend un index qu'on avait déjà modifié

**Ce qui va se passer :** on va avoir un tableau non inversé

**Correction proposée :** double boucle for imbriquée

---

## BUG 4 : fonction `compter`

**Ligne suspecte :** 59

**Description du bug :** avec le return, on sort de la fonction à la première valeur égale à val

**Ce qui va se passer :** count sera égale à 1

**Correction proposée :** enlever le return count de la boucle for
