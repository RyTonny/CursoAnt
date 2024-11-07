fun main() {
    println("Estructuras de Datos")
    val ahorros = Array<Int>(3) { 100 }
    println(ahorros.get(0))
    ahorros[0] = 110
    println(ahorros.get(0))

    val tablero = Array(2) { Array(2) { 0 } }
    tablero[0][0] = 5
    tablero[1][0] = 10
    println(tablero[0][1])

    for (i in 0..tablero.size - 1) {
        for (j in 0..tablero.size - 1) {
            println("$i, $j = ${tablero[i][j]}")
        }
    }

    val array = arrayOf('p', 'a', 'm', 'e', 'l', 'a')
    for (i in 0..array.size - 1) print(array[i])
}