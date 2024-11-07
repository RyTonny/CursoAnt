fun main() {
    println("Throw")
    val ex = "Ana"
    if (ex.equals("Alba")) {
        val cause = IllegalArgumentException("Causa: La que lastimo al ANT")
        throw IllegalArgumentException(cause)
    } else {
        println("Hola $ex")
    }

    println("Try, Catch y Finally")
    val valor = "3f"
    try { // intenta ejecutar este bloque de código
        if (ex.equals("Ana")) {
            val cause = IllegalArgumentException("Causa: La que lastimo al ANT")
            throw IllegalArgumentException(cause)
        } else {
            println("Hola $ex")
        }
        println(valor.toInt())
    } catch (e: Exception) { // pero si falla atrapa el error y ejecuta un bloque de código
        println(e)
    } finally { // independientemente del resultado ejecuta un bloque de código...
        println("Try Catch finalizado")
    }
}