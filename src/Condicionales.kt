fun main() {
    println("Sentencias Condicionales")
    if (false) println("Condición exitosa")
    if (true) {// si (if) la condicion se cumple(boolean) entonces ejecuta la siguiente linea o bloque de código {}
        println("Condición exitosa")
        println(":)")
    }

    println("Operadores de igualdad")
    if (1 == 1)
        println("1 es igual a 1")
    val nombre = "Juan"
    if (nombre.equals("Juan"))
        println("Es igual")

    if (1 == 1) {
    }
    println("Es igual a 1")
    if (1 == 2) {
        println("No es igual")
    }

    println("Operadores Lógicos")
    //not ! es negación tambien se puede leer como diferente de !=
    if (1 != 2) println("1 es diferente de 2")
    //or || uno u otro, con que una opción sea válida entonces procedemos
    //true o true = true - true o false = true - folse o true = true - false o false = false
    if (1 == 1 || 1 != 2) println("Al menos una condición fué válida")
    //and && es si y solo sí, los dos son positivos entonces procede
    // true y true = true - true y false = false - false y true = false - false y false = false
    if (1 == 1 && 1 == 2) println("Las dos condiciones fueron válidas")

    println("Operadores de Comparación y sentencia if-else")
    val a = 9
    val b = 10
    if (a > b) println("a es mayor que b")
    val c = 15
    if (a >= c) println("a es mayor o igual que c")
    else println("a es menor que c")

    if (a < b) {//si esto se cumple
        println("a es menor que b")
    } else if (a > b) {//o si esto se cumple
        println("a es mayor que b")
    } else {//si no, entonces...
        println("a igual que b")
    }

    println("Sentencia When")
    println("Para consultar tu saldo, Ingresa tu tajeta")
    val tarjeta = readln()
    when (tarjeta) {//cuando (when) lo evaluado (tarjeta) coincida con alguna opcion, ejecuta el codigo correspondiente ->...
        "001" -> println("$10.0 USD")
        "011" -> println("$11.0 USD")
        "201" -> println("$210.0 USD")
        "300",
        "301" -> println("130.00 USD")

        "320" -> {
            println("21.00 USD")
            println("10.00 USD")
        }

        else -> println("tarjeta no encontrada")// si no coincide con nada entonces ejecuta el caso por default (else)
    }
}