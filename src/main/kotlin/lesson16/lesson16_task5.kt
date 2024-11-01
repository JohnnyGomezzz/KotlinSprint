package org.example.lesson16

fun main() {
    val player1 = Player(
        name = "Воен",
        maxHealth = 50,
        strength = 10
    )
    player1.getDamage(18)
    player1.getHeal(20)
    player1.getDamage(20)
    player1.getDamage(10)
    player1.getHeal(20)
    player1.getDamage(25)
    player1.getDamage(20)
}

private class Player(
    val name: String,
    val maxHealth: Int,
    var strength: Int,
    private var currentHealth: Int = 0,
    private var canHeal: Boolean = false,
) {
    init {
        currentHealth = maxHealth
    }

    private fun getInfo() {
        println("$name ($currentHealth/$maxHealth)")
    }

    fun getDamage(hitPoints: Int) {
        currentHealth -= hitPoints
        canHeal = true

        println("$name получил повреждения на $hitPoints хп")
        getInfo()

        isDead()
    }

    fun getHeal(healPoints: Int) {
        if (canHeal) {
            if (currentHealth + healPoints > maxHealth) {
                currentHealth = maxHealth
                canHeal = false
            } else currentHealth += healPoints

            println("$name получил лечение на $healPoints хп")
            getInfo()
        }
        return
    }

    fun isDead() {
        if (currentHealth <= 0) death()
    }

    private fun death() {
        println("$name помер")
        canHeal = false
        currentHealth = 0
        strength = 0
    }
}