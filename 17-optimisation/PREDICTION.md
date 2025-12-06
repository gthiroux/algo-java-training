# Ma prédiction - Exercice 17

## Fonction `moyenneInef`

**Problème identifié :** 1ere boucle for inutile

**Nombre d'opérations actuelles (pour n éléments) :** on prend i, on initialise somme à 0, on prend j et on boucle jusqu'à ce que j = i= 0,on augmente i, on initialise somme à 0 et on boucle jusqu'à ce que j=i =1 ,...,on augmente i, on initialise somme à 0 et on boucle jusqu'à ce que j=i =n

**Version optimisée :**

```java
public static double moyenneEff(int[] t) {
    double somme = 0;
    for (int i = 0; i < t.length; i++) {
        somme = somme + t[i];
    }
    return somme/t.length;

}
```

---

## Fonction `contientDoublonInef`

**Problème identifié :** condition de la 2eme boucle for et du if peut être simplifiée

**Version optimisée :**

```java
public static boolean contientDoublonEff(int[] t) {
       for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < i; j++) {
                if ( t[i] == t[j]) {
                    return true;
                }
            }
        }
        return false;

}
```

---

## Fonction `premierEtDernierInef`

**Problème identifié :** la boucle for pour savoir le premier du tableau est inutile puisqu'il aura toujours l'index 0

**Version optimisée :**

```java
public static String premierEtDernierEff(int[] t) {
    int premier = t[0];
    int dernier = 0;
    for (int i = 0; i < t.length; i++) {
        dernier = t[i];
    }
    return premier + " et " + dernier;
}
```

---

## Fonction `rechercheInef`

**Problème identifié :** la boucle va continuer même si on a trouvé une valeur

**Version optimisée :**

```java
public static int rechercheEff(int[] t, int val) {
    int index = -1;
    for (int i = 0; i < t.length; i++) {
        if (t[i] == val) {
            index = i;
            return index;
        }
    }
    return index;

}
```
