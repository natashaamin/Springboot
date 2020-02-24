interface PersonInfoProvider {
    //fun printInfo(person: person)
    val providerInfo: String
    fun getInfo(person: person)
    {
        println("BasicInfoProvider")
        person.getInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}
//abstract- doesnt need to implement all the methods available on the interface
open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "session"

    override fun getInfo(person: person) {
        super.getInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

//    override fun printInfo(person: person) {
//        println("BasicInfoProvider")
//        person.getInfo()
//    }
}


fun main() {
    //val provider = fancyInfoProvider()
    //open val sessionIdPrefix: String
   //provider.sessionIdPrefix

    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New info provider"

        fun getSessionId() = "id"
    }

    provider.getInfo(person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider)
{
    if(infoProvider !is SessionInfoProvider) {
        println("is a session info provider")
    }else{
        println("not a session info provider")
    }
}