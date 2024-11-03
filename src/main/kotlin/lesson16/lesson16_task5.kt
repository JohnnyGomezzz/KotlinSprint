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
    player1.getDamage(20)
    player1.getDamage(20)
    player1.getDamage(20)
}

private class Player(
    val name: String,
    val maxHealth: Int,
    var strength: Int,
    private var currentHealth: Int = 0,
    private var canHeal: Boolean = false,
    private var isDead: Boolean = false,
) {
    init {
        currentHealth = maxHealth
    }

    private fun getInfo() {
        println("$name ($currentHealth/$maxHealth)")
    }

    fun getDamage(hitPoints: Int) {
        if (!isDead) {
            currentHealth -= hitPoints
            canHeal = true

            println("$name получил повреждения на $hitPoints хп")
            getInfo()

            if (currentHealth <= 0) {
                isDead = true
                death()
            }
        }
        return
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

    private fun death() {
        println("$name помер")
        canHeal = false
        currentHealth = 0
        strength = 0
    }
}