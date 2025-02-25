package com.example.ejercicio1variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //sentenciaIf()
        sentenciaWhen()
        //arrays()
        //bucle()
    }

    private fun variablesyconstantes(){
        var miprimervariable = "Hola estudiantes de Ingenieria"
        println(miprimervariable)
    }
    //Hola
    private fun sentenciaIf(){
        val miNumero = 12
        val miNumero2 = 8
        val miNumero3 = 45
        val miNumero4 = 50
        val miNumero5 = 6
        //Operadores condicionales
        /*
        * > mayor que
        * < menor que
        * >= mayor o igual que
        * <= menor o igual que
        * == igualdad
        * != desigualdad
        * */
        if(miNumero <= 10){
            //Sentencia if
            println("$miNumero es menor o igual que 10")  }else{
            //Sentencia else
            println("$miNumero es mayor que 10")  }
        // Operadores logicos
        /*
        * && operodor "y"
        * || operador "o"
        * ! operador "no"
        * */
        if(miNumero2 <= 10 && miNumero2 > 5){
            //Sentencia if
            println("$miNumero2 es menor o igual que 10 y  mayor que 5")
        }else{
            //Sentencia else
            println("$miNumero2 es mayor que 10")  }
        if((miNumero3 <= 10 && miNumero3 > 5) || miNumero3  == 45){
            //Sentencia if
            println("$miNumero3 es menor o igual que 10 y  mayor que 5 o es igual a 45")
        }else{
            //Sentencia else
            println("$miNumero3 es mayor que 10 o menor o  igual que 5 y no es igual a 45")
        }
        if((miNumero4 <= 10 && miNumero4 > 5) || miNumero4  == 45){
            //Sentencia if
            println("$miNumero4 es menor o igual que 10 y  mayor que 5 o es igual a 45")
        }else if(miNumero4 == 50){
            //sentencia else if
            println("$miNumero4 es igual a 50")  }else if(miNumero4 != 60){
            //sentencia else if
            println("$miNumero4 es igual a 60")  }else{
            //Sentencia else
            println("$miNumero4 es mayor que 10 o menor o  igual que 5 y no es igual a 45")
        }
        if(!(miNumero5 <= 10 && miNumero5 > 5) ||  miNumero5 == 45){
            //Sentencia if
            println("$miNumero5 es menor o igual que 10 y  mayor que 5 o es igual a 45")
        }else{
            //Sentencia else
            println("$miNumero5 es mayor que 10 o menor o  igual que 5 y no es igual a 45")
        }
    }
    /*Esta es la sentecia when o switch*/
    private fun sentenciaWhen(){
        //When con String
        val pais = "El Salvador"
        when(pais){
            "El Salvador" ->{
                println("El idioma es Español")  }
            "Mexico" ->{
                println("El idioma es Español")  }
            "Guatemana" ->{
                println("El idioma es Español")  }
            "Argentina" ->{
                println("El idioma es Español")  }
            "Brasil" ->{
                println("El idioma es Portugues")  }
            "Francis" ->{
                println("El idioma es Francies")  }
            "EEUU" ->{
                println("El idioma es Ingles")  }
            else ->{
                println("No se conoce el idioma")  }
        }
        when(pais){
            "El Salvador", "Mexico", "Guatemana",  "Argentina" ->{
                println("El idioma es Español")  }
            "Brasil" ->{
                println("El idioma es Portugues")  }
            "Francis" ->{
                println("El idioma es Francies")  }
            "EEUU" ->{
                println("El idioma es Ingles")  }
            else ->{
                println("No se conoce el idioma")  }
        }
        //When con int
        val edad = 10
        when(edad){
            0,1,2 ->{
                println("Eres un bebé")  } in 3..10 ->{
            println("Eres un niño")  }in 11..17 ->{
            println("Eres un adolecente")  }in 18..30 ->{
            println("Eres un adulto joven")  }in 31..69 ->{
            println("Eres un adulto")
        }in 70..99 ->{
            println("Eres un anciano")  }else ->{
            println("Eres muy viejo")  }
        }
    }
    /*Aqui trabajaremos con arrays o arreglos*/ fun arrays(){
        val nombre = "Jonathan"
        val apellido = "Carballo"
        val departamento = "Chalatenango"
        val edad = "32"
        //creación de un Array
        val miArreglo = arrayListOf<String>()
        //añadir datos de uno en uno
        miArreglo.add(nombre)
        miArreglo.add(apellido)
        miArreglo.add(departamento)
        miArreglo.add(edad)
        println(miArreglo)
        //Añadri un conjunto de datos
        miArreglo.addAll(listOf("hola","Programación IV"))
        println(miArreglo)
        //Acceso a datos
        val miDepartamento = miArreglo[2]
        println(miDepartamento)
        //modificar datos
        miArreglo[4] = "Clase presencial"
        println(miArreglo)
        //eliminar datos
        miArreglo.removeAt(5)
        println(miArreglo)
        //Recorrer datos
        miArreglo.forEach { it
            println(it)
        }
        //otras operaciones
        println(miArreglo.count())
        miArreglo.clear()
        println(miArreglo.count())
    }
    /*
    * aqui tarabajermos los ciclos o loops, tambien  llamados bucles
    * */
    private fun bucle(){
        val miArreglo = listOf("Hola","clase presencial","programacio IV")
            //bucles
            //for
            for(miString in miArreglo){  println(miString)  }
            for(x in 0..10){
                println(x)
            }
            for(x in 0 until 10){  println(x)
            }
            for(x in 0..10 step 2){  println(x)
            }
            for(x in 10 downTo 0 step 3){  println(x)
            }
            val miNumArreglo = (0..20)
        for(miNum in miNumArreglo){  println(miNum)
        }
        //While
        var x = 0
        while(x<10){
            println(x)
            x += 2
        }
    }

}