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