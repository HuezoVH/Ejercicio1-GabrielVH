package controller

import model.Persona

class PersonaController {
    var num = 1;
//    Los métodos que se implementaran son:

//    •	calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m))
//      devuelve un -1 si esta por debajo de su peso ideal, un 0 si esta en su peso ideal y un 1 si
//      tiene sobrepeso . Usa constantes para devolver estos valores.
    fun calcularIMC(p: Persona):Int {
        var imc : Float = (p.peso/(p.altura*p.altura))

        if(imc<18.5){
            return -1
        }else if (18.5<= imc && imc<=24.9){
            return 0
        }else{
            return 1
        }
    }

//    •	esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    fun esMayorDeEdad(p: Persona):Boolean{
        return p.edad > 17
    }

//    •	comprobarSexo(char sexo): comprueba que el sexo introducido
//    es correcto. Si no es correcto, sera H. No sera visible al exterior.
    fun comprobarSexo(p: Persona){
        if (p.sexo != 'H' || p.sexo != 'M'){
            p.sexo = 'H'
        }else{
            p.sexo = p.sexo
        }
    }

//    •	toString(): devuelve toda la información del objeto correspondiente.
//    Este método sera invocado cuando se construya el objeto.
//    Puedes dividir el método para que te sea más fácil. No será visible al exterior.
    fun toString(p: Persona):String {
        var persona : String = ""
        persona += "\n\nPersona $num\n"
        persona += "Nombre de la persona: "+p.nombre
        persona += "\nEdad de la persona: "+p.edad
        persona += "\nCedula de la persona: "+p.cedula
        persona += "\nSexo de la persona: "+p.sexo
        persona += "\nPeso de la persona: "+p.peso
        persona += "\nAltura de la persona: "+p.altura

        num++

        return persona
    }
}