# Lab 4 – Fonctions avec paramètres et valeur de retour

## Description

Ce laboratoire présente l'utilisation des **fonctions en Kotlin** pour calculer un score dans un programme simple.

Le programme simule un système de points où un joueur gagne des points selon :

- des points de base
- un multiplicateur de boost
- un multiplicateur de bonus

Une fonction est utilisée pour calculer les points obtenus après chaque action.

---

# Fonction getPoints

La fonction `getPoints` calcule le nombre de points gagnés.

Paramètres :

| Paramètre | Description |
|-----------|-------------|
| basePoints | points de base |
| boost | multiplicateur de boost |
| bonusMultiplier | multiplicateur de bonus |

Formule utilisée :

```
total = basePoints * boost * bonusMultiplier
```

Si le résultat est négatif, la fonction retourne `0`.

Exemple :

```
return if (total > 0) total else 0
```

Cela permet d'éviter d'ajouter des points négatifs au score.

---

# Logique du programme

Le programme :

1. initialise un score
2. appelle la fonction `getPoints`
3. ajoute les points obtenus au score
4. affiche le score après chaque action

---

# Programme complet

```kotlin
fun getPoints(basePoints: Int, boost: Int, bonusMultiplier: Int): Int {
    val total = basePoints * boost * bonusMultiplier
    return if (total > 0) total else 0
}

fun main() {
    var score = 0
    println("Score initial : $score")

    score += getPoints(10, 1, 1)
    println("Score après 1ère action : $score")

    score += getPoints(20, 2, 2)
    println("Score après 2ème action : $score")

    score += getPoints(-10, 1, 1)
    println("Score final : $score")
}
```

---

# Exemple d'exécution

<img width="856" height="254" alt="lab4k" src="https://github.com/user-attachments/assets/249ff42f-95f1-4f55-9cff-0c7cba852c2f" />

---

Explication :

1. Première action  
   `10 * 1 * 1 = 10`

2. Deuxième action  
   `20 * 2 * 2 = 80`  
   Score total = `10 + 80 = 90`

3. Troisième action  
   `-10 * 1 * 1 = -10`  
   La fonction retourne `0`, donc le score ne change pas.

---

# Objectifs pédagogiques

Après ce laboratoire, l’étudiant doit être capable de :

- créer une fonction en Kotlin
- utiliser des paramètres dans une fonction
- retourner une valeur avec `return`
- utiliser une expression conditionnelle
- modifier une variable avec l'opérateur `+=`

---

# Technologies

- Kotlin
- Application console
- Fonctions

---



