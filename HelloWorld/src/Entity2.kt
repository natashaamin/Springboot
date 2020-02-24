import java.util.*


enum class EntityType2 {
        HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityObject2 {
    fun create(type: EntityType2): Entity2 {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityType2.EASY -> type.getFormattedName()
            EntityType2.MEDIUM -> type.name
            EntityType2.HARD -> "Hard"
            EntityType2.HELP -> type.getFormattedName()
        }

        return when(type) {
            EntityType2.EASY -> Entity2.Easy(id, name)
            EntityType2.MEDIUM -> Entity2.Easy(id, name)
            EntityType2.HARD -> Entity2.Easy(id, name)
            EntityType2.HELP -> Entity2.Help
        }
    }
}

sealed class Entity2() {
    object Help: Entity2() {
        val name = "help"
    }

    data class Easy(val id: String, val name: String): Entity2()
    data class Medium(val id: String, val name: String): Entity2()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity2()

}

fun main() {
    val entity:Entity2 = EntityObject2.create(EntityType2.EASY)
    val msg = when (entity) {
        Entity2.Help -> "help class"
        is Entity2.Easy -> "easy class"
        is Entity2.Medium -> "emedium class"
        is Entity2.Hard -> "hard class"
    }

    println(msg)

}