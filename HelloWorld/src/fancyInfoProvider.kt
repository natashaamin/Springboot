//type the class that want to be inherit
//need 'open' to public the class
class fancyInfoProvider : BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"
    override val providerInfo: String
        get() = "Fancy info provider"


    override fun getInfo(person: person) {
        super.getInfo(person)
        println("Fancy info")
    }
}