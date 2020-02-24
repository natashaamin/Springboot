 class person(val fname: String = "Peter", val lname: String = "Parker" ) {


    var nickname: String? = null
        set(value)  {
            field = value
            println("The new nickname is $value")
        }

        get() {
            println("The return value is $field")
            return  field
         }

    fun getInfo() {
        //val nicknameToPrint = if(nickname != null) print(nickname) else print("No nickname available")
        val nicknameToPrint = nickname ?: "no nickname available"
        println("$fname ($nicknameToPrint) $lname")
    }


 }