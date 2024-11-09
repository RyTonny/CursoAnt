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

    println("Transformaciones de Colecciones")
    val precios = setOf(100, 200, 500)
    println(precios.map { it * .16 })// Map = mapeo

    val bebidas = listOf("Soda", "Limonada", "Té")
    println(menuset)
    println(bebidas)
    println(menuset zip bebidas)// Zip = cierre

    val numeros = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    println(numeros)
    println(numeros.flatten())//Flatten = aplanar

    val herramientaslist = listOf("Tuercas", "Martillo", "Tabla 1x1")
    println(herramientaslist)
    println(herramientaslist.associateWith { "${it[0]}${it.length}" })// Associate = asociar

    println(menuset.joinToString())//Join = unir

    println("Filtros en colecciones")
    println(bebidas.filter { it.length <= 4 })
    herramientasmap.put("T2", "Tabla 2x2")
    println(herramientasmap.filter { it.key.contains("T") && it.value.contains(" ") })
    println(herramientasmap.filterNot { it.key.contains("T") && it.value.contains(" ") })
    println(bebidas.filterIndexed { index, s -> index > 0 && s.length < 3 })
    val detodolist = listOf("Soda", 2.3f, null, "Pizza", 10_000)
    println(detodolist.filterIsInstance<String>())
    println(detodolist.filterNotNull())

    println("Particionar Colecciones")
    //println(bebidas.partition { it.length > 2 })
    val (azucaradas, saludables) = bebidas.partition { it.length > 2 }
    println(azucaradas)
    println(saludables)
    println("Test Predicates")
    println("any: ${detodolist.any { it == null }}")
    println("any: ${detodolist.none { it == false }}")
    println("any: ${detodolist.all { it == null }}")

    println("Ordenar colecciones")
    println(listaSoloLectura)
    println("reversed: ${listaSoloLectura.reversed()}")
    println("reversed: ${listaSoloLectura.sorted()}")
    println("reversed: ${listaSoloLectura.sortedDescending()}")
    println("reversed: ${listaSoloLectura.sorted().sortedBy { it.length }}")
    println("shuffled: ${listaSoloLectura.sorted().shuffled()}")

    println("Indice de Laura: ${listaSoloLectura.indexOf("Laura")}")

    println("Métodos de String")

    val course = "Kotlin course by Cursos ANT"
    var target = "Kotlin"
    println(course.length)
    println(course.compareTo(target))
    println("Kotlin".equals(target))
    println(course.contains(target))
    println(course.lowercase())
    println(course.uppercase())
    println(course.subSequence(0, 6))
    println(course.indexOf("N"))
    var emty = " "
    println(emty.isBlank())
    println(emty.isEmpty())
    println(course.lastIndexOf("o"))
    println(course.lowercase().lastIndexOf("n"))
    println(course.replace('c', 'k'))
    println(course.lowercase().replace("an", "al"))
    println(course.replaceBefore(" by", "Only"))
    println(course.reversed())
    println(course.slice(20..course.length - 1))
    println(course.split(" "))
    println(course.startsWith('K'))
    println(course.substring(14..16))
    println(" Kotlin ".trim())


}