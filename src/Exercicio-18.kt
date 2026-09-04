import model.Produto

    fun listaProdutos(){
        val listaProduto = arrayOf(
            Produto("Iphone 11", 3999.99),
            Produto("Tv 4k Led", 1999.99),
            Produto("Notebook Ultra Samsung", 2499.99)
        )

        val maiorPreco = listaProduto.maxByOrNull { it.preco }
        println("O maior preco encontrado foi $maiorPreco")
    }