package view

import controller.PersonaController
import model.Persona

class PersonaView {
//    Ahora, crea una clase ejecutable que haga lo siguiente:

    var pc= PersonaController()

    fun Menu(){

//    •	Pide por teclado el nombre, la edad, sexo, peso y altura.
        println("Nombre de la Persona: ")
        var nombre : String = readLine()?:toString()
        println("Edad de la Persona: ")
        var edad :Int = readLine()?.toInt() as Int
        println("Cedula de la Persona: ")
        var cedula : String = readLine()?:toString()
        println("Sexo de la Persona: ")
        var sexo : Char = readLine()!![0]
        println("Peso de la Persona: ")
        var peso : Float = readLine()?.toFloat() as Float
        println("Altura de la Persona: ")
        var altura : Float = readLine()?.toFloat() as Float


//    •	Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado
//      el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto
//      para este último utiliza los métodos set para darle a los atributos un valor.
        var p = Persona(nombre, edad, cedula, sexo, peso, altura)
        var p1 = Persona(nombre, edad, sexo)
        var p2 = Persona()

        p2.nombre = "Carlos"
        p2.edad = 16
        p2.cedula = "609830578"
        p2.sexo = 'H'
        p2.peso = 77.5f
        p2.altura = 1.82f

//    •	Para cada objeto, deberá comprobar si esta en su peso ideal
//    tiene sobrepeso o por debajo de su peso ideal con un mensaje.
        println("Peso Persona 1: ")
        PesoIdeal(p)
        println("Peso Persona 2: ")
        PesoIdeal(p1)
        println("Peso Persona 3: ")
        PesoIdeal(p2)

//    •	Indicar para cada objeto si es mayor de edad.
        println("Edad Persona 1: ")
        esmayor(p)
        println("Edad Persona 2: ")
        esmayor(p1)
        println("Edad Persona 3: ")
        esmayor(p2)

//    •	Por último, mostrar la información de cada objeto.
        println(pc.toString(p))
        println(pc.toString(p1))
        println(pc.toString(p2))
    }

    fun PesoIdeal(persona:Persona){
        var ResultadoIMC : Int = pc.calcularIMC(persona)
        if (ResultadoIMC == -1){
            println("Está por debajo del promedio")
        }
        else if (ResultadoIMC == 0){
            println("Está en el promedio")
        }else{
            println("Está por encima del promedio")
        }
    }

    fun esmayor(persona: Persona){
        var m = pc.esMayorDeEdad(persona)
        if(m){
            println("Es mayor de edad")
        }else{
            println("Es menor de edad")
        }
    }
}