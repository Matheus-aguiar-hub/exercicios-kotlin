fun main(){

    fun dividir(): Int {

        var divisao = 2/4

        when (divisao) {
            in 0 .. 100 step 2 -> println("Par")
            else -> println("Impar")
        }

        return divisao
    }

    dividir()
}