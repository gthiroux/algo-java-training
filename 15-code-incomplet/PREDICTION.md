# Ma prédiction - Exercice 15

## Fonction `trouverMax`

```java
int max = ???;      // Trou 1 : ___
for (int i = ???;   // Trou 2 : ___
    if (t[i] ??? max)  // Trou 3 : ___
        max = ???;     // Trou 4 : ___
```

**Raisonnement :**

- Trou 1 : max= t[0]
- Trou 2 : i=1
- Trou 3 : t[i]>max
- Trou 4 : max=t[i]

---

## Fonction `contient`

```java
if (??? == ???)     // Trou 1 et 2 : ___ == ___
    return ???;     // Trou 3 : ___
return ???;         // Trou 4 : ___
```

**Raisonnement :**

- Trous 1-2 : t[i]==val
- Trou 3 : true
- Trou 4 : false

---

## Fonction `sommePairs`

```java
if (t[i] ??? 2 == ???)  // Trou 1 et 2 : ___ et ___
    somme = somme + ???; // Trou 3 : ___
```

**Raisonnement :**

- Trou 1 : %
- Trou 2 : 0
- Trou 3 : t[i]

---

## Fonction `dupliquer`

```java
int[] res = new int[t.length ??? 2];  // Trou 1 : ___
res[i ??? 2] = t[i];                   // Trou 2 : ___
res[i ??? 2 ??? 1] = t[i];              // Trou 3 et 4 : ___ et ___
```

**Raisonnement :**

- Trou 1 :t.length*2
- Trou 2 :res[i*2]
- Trous 3-4 : res[i*2+1]
