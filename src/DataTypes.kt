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

    println("Textos")
    val inicial1: Char = 'J'
    val inicial2: Char = 'A'
    val inicial3: Char = 'V'
    val nuevaLinea: Char = '\n'

    print(inicial1)
    print(inicial2)
    print(inicial3)
    print(nuevaLinea)

    val iniciales: String = "JAV"
    println(iniciales)
    val casosEspeciales: String = "\tJ\'A\'V\\ \$"
    println(casosEspeciales)

    println("Entrada de datos(readline)")
    val nombre = readln()  //funcion para entrada estandar de datos por consola
    println(nombre)
    println("Concatenación:")
    println("Hola " + nombre + "!")

    println("String Templates:")//nos sirve para concatenar string en kotling de forma optimizada
    println("Hola $nombre!")//requiere el simbolo de dollar antes de llamar a la variable
    /*val longitud = nombre.length
    println("Longitud: $longitud")*/
    println("Longitud: ${nombre.length}")//encapsular con llaves en caso de acceder a propiedades o funciones {}

    println("Multiline String")//Raw String
    val lineasMultiples: String = """
        Hola, estoy "escribiendo"
            con sangría!
    """
    println(lineasMultiples)//multiline String permite cadenas de texto con formatos o estilos más completos

    println("Nulos en kotlin")
    var ganancias: Int? = null//siempre que algo puede ser null, debe ser marcado con su signo de interrogacion
    println("Salario: $ganancias")
    var nombreUsuario: String? = "Juan Antonio"
    nombreUsuario = null
    println("Longitud de nombre de usuario con ?: ${nombreUsuario?.length}")//lo que está a la derecha de ? no se ejecutara si es null

    val nombreRandom: String? = "CursoTony"
    nombreUsuario = nombreRandom!!// !! es igual a estamos asegurandole a kotlin que la variable no sera null
    println("Longitud de nombre de usuario !!: ${nombreUsuario.length}")//bajo nuestra responsabilidad

    println("Operador Elvis")// ?: = es igual si lo que esta a la izquierda de ?: no es null entonces ocupalo, de lo contrario usa lo que esta despues del ?:
    var lenguaje:String? = "Kotlin"
    lenguaje = null
    val lenguajepordefault: String = "Java"
    println("Yo programo en: ${lenguaje?: lenguajepordefault}")

}