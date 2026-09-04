 fun precoMaior(){
        val preco = mutableListOf(99.99, 79.99, 9.99, 13.00)

        val somaPreco = preco.reduce { acumulador, numero ->
            acumulador + numero
        }
        println(somaPreco)
    }