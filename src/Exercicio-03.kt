fun tipoIdade(){
    val idade = 37
    when (idade) {
        in 0 .. 12 -> println ("Crianca")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")
    }
}