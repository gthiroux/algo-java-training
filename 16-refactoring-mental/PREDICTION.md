# Ma prédiction - Exercice 16

## Fonction `estPositif`

**Version actuelle :** 5 lignes

**Ma version simplifiée :**

```java
public static boolean estPositif(int n) {

     if (n < 0) {
            return false;}
    return true;
}
```

---

## Fonction `valeurAbsolue`

**Version actuelle :** 7 lignes

**Ma version simplifiée :**

```java
public static int valeurAbsolue(int n) {
    if (n < 0) {
            n = n * -1;
        }
    return n;

}
```

---

## Fonction `estPair`

**Version actuelle :** 7 lignes

**Ma version simplifiée :**

```java
public static boolean estPair(int n) {
        if (n%2!=0) {
            return false;
        }
        return true;
}
```

---

## Fonction `max`

**Version actuelle :** 8 lignes

**Ma version simplifiée :**

```java
public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
}
```

---

## Fonction `signe`

**Version actuelle :** 12 lignes

**Ma version simplifiée :**

```java
public static String signe(int n) {
    if (n != 0) {
        if (n < 0) {
                return "negatif";
            }
         return "positif";
    } else {
        return "zero";
    }

}
```
