package model

class Persona {
//    Sus atributos son: nombre, edad, cédula, sexo (H hombre, M mujer), peso y altura.
    var nombre : String = ""
    var edad : Int = 0
    var cedula : String = ""
    var sexo : Char = 'H'
    var peso : Float = 0.0f
    var altura : Float = 0.0f

//    Por defecto, todos los atributos menos la cédula  serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.)

//    Se implantaran varios constructores:

//    •	Un constructor por defecto.
    constructor()

//    •	Un constructor con el nombre, edad y sexo, el resto por defecto.
    constructor(nombre : String, edad : Int, sexo : Char) : this() {
    this.nombre = nombre
    this.edad = edad
    this.sexo = sexo
}

//    •	Un constructor con todos los atributos como parámetro.
    constructor(nombre : String, edad : Int, cedula : String, sexo : Char, peso : Float, altura : Float) : this() {
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }
}