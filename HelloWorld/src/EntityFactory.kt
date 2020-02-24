interface idProvider {
    fun getId() : String
}

class EntityFactory private constructor ( val id: String)
{
    companion object Factory : idProvider{
        override fun getId(): String {
            return "!23"
        }

        const val id = "id"
        fun create() = EntityFactory(getId())
    }
}

fun main() {
    val entity = EntityFactory.Factory.create()
    EntityFactory.id
}