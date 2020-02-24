var name : String = "nate"
var greeting: String? = null

fun color(): String? {
    var red = "red"
    return red
}

fun others() {
    println(color())
}

fun name(namaOrang: String) {
    val nama = "hello $namaOrang \n"
    print(nama)
}

fun helloWorld(greeting:String, itemToSend:String) = println("$greeting $itemToSend")

fun helloKotlin(greeting: String, itemToSend:List<String>) {
    itemToSend.forEach {itemToSend -> println("$greeting $itemToSend")}
}

fun itemToPass(greeting: String, vararg itemToSend:String)
{
    itemToSend.forEach { itemToGet -> println("$greeting $itemToGet") }
}


fun main(args : Array<String>)
{

    when(greeting)
   {
       "hi" -> println("Hello world people")
       else  -> println("Damn")
   }

    val greetingByIf = if(greeting != null) greeting else "Whatsup \n"
    print(greetingByIf)

    val greetingByWhen = when(greeting)
    {
        null -> print("This is null \n")
        else -> print("Anything else")
    }

    //color
    if (color() == "yellow" )
        print(color())
    else println("Other color than red")

    others()

    print(name("natasha"))
    helloWorld("heyyyy","girls")

    //Array

    //arrayOf or listOF
    var arrayPrintOut = listOf("a", "b", "c")
    var arrayPrintOut2 = mutableListOf("iphone", "samsung", "nokia")
    var arrayPrintOut3 = arrayOf("monkey","snake","donkey")

//    println(arrayPrintOut.get(0))
//    println(arrayPrintOut[1])

//    for(abc in arrayPrintOut)
//        println(abc)

    arrayPrintOut.forEach { abc -> print(abc + " ") }

    arrayPrintOut2.add("Sony")
    arrayPrintOut2.forEach { phone -> print(phone + " ")}

    arrayPrintOut.forEachIndexed { index, abc -> println("$abc in the $index") }

    //using mapOf
    val map = mutableMapOf(1 to "orange", 2 to "apple", 3 to "watermelon")
    map.put(4,"Cherry")
    map.forEach { i, s -> println("$i > $s")}


    //helloKotlin function
    helloKotlin("hi", arrayPrintOut)

    itemToPass("hi", "kotlin", "programming")
    itemToPass("Hello", *arrayPrintOut3)

    helloWorld(greeting = "hi", itemToSend = "sdsd" )


//    var person = person("natasha","amin" )
//    //property access syntax
//    person.fname
//    person.lname
//    person.nickname = "meow"
//    person.nickname = "new nickname"
//    print(person.nickname)

    var person  = person()

    person.getInfo()



}