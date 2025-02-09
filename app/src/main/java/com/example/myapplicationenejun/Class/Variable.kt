package com.example.myapplicationenejun.Class

/*class Variable {
}*/

fun main () {
    // Variables numéricas
    val age = 20  // Variable de tipo entero
    val Long_number: Long = 29390290203  // Variable de tipo Long para almacenar un número grande
    val temperature: Float = 28.3f  // Variable de tipo Float para almacenar números decimales (requiere la 'f' al final)
    val weight: Double = 19.02783  // Variable de tipo Double para mayor precisión en decimales

    // Variables de tipo String y Char
    val gender: Char = 'F'  // Variable de tipo Char para almacenar un solo carácter
    val name: String = "Ailyn Hernández"  // Variable de tipo String para almacenar texto

    // Variable booleana
    val isGreater = false  // Variable de tipo Boolean con valores true o false

    // Variables de colección
    val names = arrayOf("Andrea", "Fernanda", "Alondra", "Valeria")  // Arreglo de Strings

    // Impresión de variables en consola
    println(age)  // Imprime el valor de la variable age

    // Concatenación e interpolación de Strings
    println("Welcome $name, to your first Kotlin project")  // Imprime un mensaje con el nombre

    // Llamada a la función add() e impresión del resultado
    println(add())

    // Llamada a la función product() con dos parámetros enteros
    println(product(5,8))

    // Llamada a la función printArray() para recorrer e imprimir los nombres del arreglo
    printArray(names)

    // Declaración de un nuevo arreglo de números enteros
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9,10)

    // Llamada a la función isEven() para verificar cuáles números son pares o impares
    isEven(numbers)

    // Llamada a la función getDay() para obtener el nombre de un día según su número
    println(getDay(1))

    // Creación de un objeto de la clase Person
    val person = Person("Alondra", 20)
    person.displayInformation()  // Llamada a la función para mostrar información
    println(person.name)  // Imprime el nombre de la persona
    println(person.age)  // Imprime la edad de la persona
}

// Función que suma dos números y devuelve el resultado
fun add(): Int {
    val x = 10  // Variable entera
    val y = 5  // Variable entera
    return (x + y)  // Retorna la suma de x y y
}

// Función que multiplica dos números y devuelve el resultado
fun product(x:Int, y:Int): Int {
    return (x * y)  // Retorna la multiplicación de x por y
}

// Función que recibe un arreglo de nombres e imprime cada uno de ellos
fun printArray(names: Array<String>) {
    println(names)  // Imprime la referencia del arreglo (no los elementos)
    for (name in names) {  // Itera sobre cada elemento del arreglo
        println("Hello $name")  // Imprime un saludo con el nombre
    }
}

// Función que recibe un arreglo de números y determina si son pares o impares
fun isEven(numbers: Array<Int>) {
    for (number in numbers) {  // Itera sobre cada número en el arreglo
        if (number % 2 == 0) {  // Verifica si el número es par
            println("The number $number is even")  // Imprime si el número es par
        } else {  // Si no es par
            println("The number $number is odd")  // Imprime si el número es impar
        }
    }
}

// Función que devuelve el nombre de un día de la semana según un número del 1 al 7
fun getDay(day: Int): String {
    var name = ""  // Variable para almacenar el nombre del día

    when(day) {  // Estructura condicional para asignar el nombre del día
        1 -> name = "Monday"
        2 -> name = "Tuesday"
        3 -> name = "Wednesday"
        4 -> name = "Thursday"
        5 -> name = "Friday"
        6 -> name = "Saturday"
        7 -> name = "Sunday"
        else -> name = "Incorrect Value"  // Manejo de valores fuera del rango
    }
    return name  // Retorna el nombre del día
}

// Definición de una clase Person con propiedades name y age
class Person(val name: String, val age: Int) {
    //Metodo para mostrar la información de la persona
    fun displayInformation(){
        println("Name: $name   Age: $age ")
    }
}
