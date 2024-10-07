package org.example.lesson2

const val PERCENTS = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val minerBuff = 20

    val bonusCrystalOre = crystalOre * minerBuff / PERCENTS
    val bonusIronOre = ironOre * minerBuff / PERCENTS

    println(
        String.format(
            "Кристаллической руды добыто: %d. Бонус от \"Удачи шахтёра\": %d",
            crystalOre,
            bonusCrystalOre
        )
    )
    println(
        String.format(
            "Железной руды добыто: %d. Бонус от \"Удачи шахтёра\": %d",
            ironOre,
            bonusIronOre
        )
    )

}