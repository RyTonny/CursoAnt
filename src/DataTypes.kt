/**
 * 1 bit es igual a la unidad mas basica del sistema informatico
 * 1 kb = 1024 bits = 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
 * 1 MB = 1024 KB
 * 1 Gb = 1024 MB
 * 1 tb = 1024 Gb...
 */
fun main() {
    println("Boolean")//tipo boolean = a 1 bit
    val soyInstructor = true //true =1, false = 0
    println("Soy instructor:")
    println(soyInstructor)

    val soyChino: Boolean = false
    println("Soy de China:?")
    println(soyChino)

    println("Entero:")
    val trabajos: Byte = 3 // rango desde -128 hasta 127
    println("Trabajos:")
    println(trabajos)
    val max = Byte.MAX_VALUE

    val diasTRabajados: Short = 500
    println("Dias Trabajados:")
    println(diasTRabajados)

    val minutosTrabajados: Int = 300_430//se pueden separar los numeros con guion bajo para separarlos y leerlos bien
    println("Minutos trabajados:")
    println(minutosTrabajados)

    val segundosTrabajados: Long = 200_000_000_000L//se le puede agregar una L mayuscula a los long y es aceptable
    println("Segundos Trabajados:")
    println(segundosTrabajados)

    println("Decimales")
    val estatura: Float = 1.75f
    println("Estatura:")
    println(estatura)

    val estaturaReal: Double = 1.753_333_333_333
    println("Estatura real:")
    println(estaturaReal)


}