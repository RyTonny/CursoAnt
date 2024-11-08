fun main() {
    println("Bucles")
    println("for") // for = por cada elemento has algo...
    for (i in 1..5) {
        println(i)
    }
    for (i in 2..8 step 2) {
        println("step 2 $i")
    }
    val vocales: String = "aeiou"
    for (i in 0..vocales.length - 1) {
        println("$i = ${vocales.get(i)}")
    }
    for (vocal in vocales) {
        println(vocal)
    }

    println("Operadores de incremento")
    val nombre: String = "Rosa"
    var longitud: Int = 0
    var saldo: Int = 100
    for (letra in nombre) {
        println(letra)
        longitud++
        saldo--
    }
    println("Longitud de la cadena: $longitud")
    println("Saldo actual: $saldo")

    nombre.forEach {
        print(it)
    }
    (1..3).forEach { numero ->
        println(numero)
    }

    println("While & Do While")
    var indice = 0
    while (indice < nombre.length) {// evalua primero y si se cumple repite el bloque de código
        println("Indice: $indice")
        println("Letra en el indice: ${nombre.get(indice)}")
        indice++ //incrementamos para que la condicion pueda ser falsa y termine el bucle while
    }
    do { // ejecuta al menos una vez el bloque de código y despues verifica la condición
        indice--
        println("Indice: $indice")
        println("Letra en el indice: ${nombre.get(indice)}")
    } while (indice > 0)

    println("Return, Breack y Continue")
    for (i in 1..5) {
        if (i == 3) {
            break // termina el bucle actual
        }
        println(i)
    }
    for (i in 6..10) {
        if (i == 8) {
            continue //salta el caso actual pero continua el ciclo en la siguiente interaccion
        }
        println(i)
    }
    for (i in 11..15) {
        if (i == 13) {
            return // esta sentencia termina la funcion, sale de la funcion
        }
        println(i)
    }

}