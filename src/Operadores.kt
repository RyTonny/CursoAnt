fun main() {// Cualquier numero puede ser convertido a otro tipo de número, entero o decimales

    println("Conversiones de números:")
    val a: Byte = 10
    val b: Int = 5
    val c: Long = 20L
    var resultado: Long = b.toLong()
    println(resultado)

    val d: Double = 12.54
    resultado = d.toLong()
    println(resultado)
    println(a.toFloat())

    val numeroTexto: String = "6.4"//solo se puede convertir cuando tenga solo numeros en el interior
    println(numeroTexto.toDouble())

    println("Operadores Matematicos.\nInserte un número")
    val x = readln()
    println("Inserte otro número:")
    val y = readln()

    var numerox = x.toInt()
    val numeroy = y.toInt()

    println("x + y = ${numerox + numeroy}")//suma
    println("x - y = ${numerox - numeroy}")//resta
    println("x * y = ${numerox * numeroy}")//multiplicacion
    println("x / y = ${numerox / numeroy}")//division
    println("x % y = ${numerox % numeroy}")//modulo

    println("Operadores con tareas aumentadas.")
    //numerox = numerox + numeroy // la linea de abajo es lo mismo que esta linea
    numerox /= numeroy
    println("x / y = $numerox")

}