package org.example.lesson14

fun main() {
    val planet1 = Planet("Джеонозис", 5685, true, true)

    val satellite1 = Satellite(
        "Бахрин", 1570, true, true, "Джеонозис"
    )
    val satellite2 = Satellite(
        "Звезда смерти", 60, false, true, "Джеонозис", true
    )

    planet1.satellites.add(satellite1)
    planet1.satellites.add(satellite2)

    println(planet1.name)
    planet1.satellites.forEach { println(it.name) }
}

abstract class CelestialBody(
    val name: String,
    val radius: Long,
    val hasAtmosphere: Boolean,
    val isSuitableForLiving: Boolean,
)

class Planet(
    name: String,
    radius: Long,
    hasAtmosphere: Boolean,
    isSuitableForLiving: Boolean,
    val satellites: MutableSet<Satellite> = mutableSetOf(),
) : CelestialBody(name, radius, hasAtmosphere, isSuitableForLiving) {

}

class Satellite(
    name: String,
    radius: Long,
    hasAtmosphere: Boolean,
    isSuitableForLiving: Boolean,
    val motherPlanet: String,
    val isArtificial: Boolean = false,
) : CelestialBody(name, radius, hasAtmosphere, isSuitableForLiving) {

}