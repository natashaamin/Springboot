import java.util.*

enum class EntityType
{
    EASY,MEDIUM,HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}
object EntityObject {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> "Hard"
        }

        return Entity(id, name)
    }
}

    class Entity(val id: String, val name: String) {
        //put toString so that we can get readable text
        override fun toString(): String {
            return "id=$id name=$name"
        }
    }

    fun main() {
        val EasyEntity = EntityObject.create(EntityType.EASY)
        println(EasyEntity)

        val MediumEntity = EntityObject.create(EntityType.MEDIUM)
        println(MediumEntity)
    }
