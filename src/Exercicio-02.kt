fun main(){

    fun ParOuImpar():Int{
        var validacao = -100

        if(validacao < 0) {
            println("Negativo")
        }else if(validacao > 0) {
            println("Positivo")
        }else {
            println("Zero")
        }
        return validacao
    }
    ParOuImpar()
}

