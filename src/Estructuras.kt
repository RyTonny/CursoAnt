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
    println()

    println("Listas Mutables e Inmutables")
    val listaSoloLectura: List<String>
    listaSoloLectura = listOf("Alain", "María", "Christian", "Laura")
    println("Lista de solo lectura: $listaSoloLectura")
    println("Nombre en la posicion 1: ${listaSoloLectura.get(1)}")

    val listaModificable: MutableList<String> = mutableListOf("Alain", "María", "Christian", "Laura")
    println("Lista modificable: $listaModificable")
    listaModificable.add("Juan") // añadir elemento
    println("Add $listaModificable")
    listaModificable.removeAt(1) //remover elemento en la posicion indicada por el indice
    println("RemoveAt $listaModificable")
    listaModificable.remove("Juan") // remover por valor
    println("Remove $listaModificable")
    listaModificable.set(0, "Antonio") //actualizar indicando primero la posicion y luego el valor nuevo
    println("Set: $listaModificable")

    val menuset = setOf("Arepa", "Taco", "Completo")
    println(menuset)
    val comida = "Completo"
    if (menuset.contains(comida)) {
        println("Si hay :)")
    } else {
        println("No hay :(")
    }
    val menuset2 = setOf("Completo", "Taco", "Arepa")
    println(menuset == menuset2)

    val herramientasmap = mutableMapOf<String, String>()
    herramientasmap.put("T1", "Tuercas")
    herramientasmap.put("M2", "Martillo")
    herramientasmap.put("T2", "Tabla 2x2")
    println(herramientasmap)
    println(herramientasmap.get("T1"))
    herramientasmap.remove("T2")
    println(herramientasmap)
    herramientasmap.set("M2", "Mesa de trabajo")
    println(herramientasmap)
    println(herramientasmap.keys)
    println(herramientasmap.values)
    /**
     * List = Colección ordenada basada en indices ( puede repetir elementos)
     * Set = Colección no ordenada con elementos irrepetibles
     * Map = Diccionario basado en clave-valor
     */

}