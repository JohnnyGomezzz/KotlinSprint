package org.example.lesson19

fun main() {
    val tank = Tank("Т-34")

    tank.loadGun(Ammo.BLUE)
    tank.fireGun()
    tank.fireGun()
    tank.loadGun(Ammo.RED)
    tank.loadGun(Ammo.BLUE)
    tank.fireGun()
    tank.loadGun(Ammo.GREEN)
    tank.fireGun()
}

enum class Ammo(
    val ammoType: String,
    val ammoPower: Int,
) {
    BLUE("Синий снаряд", 5),
    GREEN("Зелёный снаряд", 10),
    RED("Красный снаряд", 20),
}

private class Tank(
    private val tankModel: String,
    private val tankId: Int = 0,
    private var isArmed: Boolean = false,
    private var loadedAmmoType: Ammo? = null
) {
    fun loadGun(ammoType: Ammo) {
        if (!isArmed) {
            println("${ammoType.ammoType} заряжен!")
            loadedAmmoType = ammoType
            isArmed = true
        } else {
            println("Орудие уже заряжено!")
        }
    }

    fun fireGun() {
        if (isArmed) {
            println("Выстрел! Урон по цели: ${loadedAmmoType?.ammoPower}")
            isArmed = false
        } else {
            println("Орудие не заряжено!")
        }
    }
}