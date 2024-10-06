package org.example.lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val minerBuff = 0.2F

    val bonusCrystalOre = crystalOre * minerBuff
    val bonusIronOre = ironOre * minerBuff

    println(
        String.format(
            "Кристаллической руды добыто: %d. Бонус от \"Удачи шахтёра\": %.0f",
            crystalOre,
            bonusCrystalOre
        )
    )
    println(
        String.format(
            "Железной руды добыто: %d. Бонус от \"Удачи шахтёра\": %.0f",
            ironOre,
            bonusIronOre
        )
    )

}