//fun es palabra reservada para las funciones
fun main(){
    print("Tony")

    print("\n") //print es una funcion interna de kotlin que imprime un dato
    val fechadeNacimiento = "13 de Junio de 1987"// variable de solo lectura, no puede ser reasignada o marca error
    // esto es un comentario las variables se pueden cambiar el valor y en val no se puede cambiar el valor
    println(fechadeNacimiento)//imprime un dato y hace un salto de linea al final

    var edad = "37 años"//var es variable de lectura y escritura
    edad = "38 años"//se puede reasignar el valor de var
    println(edad)
}