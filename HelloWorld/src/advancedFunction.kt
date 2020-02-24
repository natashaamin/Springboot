fun printListFunc(list: List<String>, predicate: (String) -> Boolean)
{
    list.forEach {
        if(predicate(it))
            print(it)
    }
}


fun getPredicate(): (String) -> Boolean {
    return {it.startsWith("J")}
}
fun main() {
    val display = listOf("Kotlin", "JAva", "Javascript", "C++")
//    printListFunc(display , {it.startsWith("K")})

//    printListFunc(display) {
//        it.startsWith("K")
//    }

    printListFunc(display,getPredicate())
}