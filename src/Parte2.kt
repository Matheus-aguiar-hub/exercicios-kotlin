import model.Pessoa
import model.Produto

fun main () {
    //Exercicio 12
                // Estrutura de intervalo
                                // Metodo que cria uma lista
    val batata = (1 .. 100).toList()
                            // Metodo para filtrar a lista
                                    //Percorre os números em ordem
                                        //Divide pelo número 3 e 5 e o defini como 0
    val batataQuente = batata.filter { it % 3 == 0 || it % 5 == 0 }
    //Estrutura de repeticao padrao
    for (i in batataQuente) {
        //Condicao com arrow function para definir o nome de acordo com a variavel
        when {

            i % 3 == 0 && i % 5 == 0 -> println("${i} = BatataQuente")
            i % 3 == 0 -> println("${i} = Batata")
            i % 5 == 0 -> println("${i} = Quente")

        }
    }

    //Exercicio 13
    //Variavel imutavel com um intervalo 1 ate 20 com o metodo .tolist()
    val numero = (1 .. 20).toList()

    //Variavel imutavel filtrando o intervalo e divide o número que recebe e caso sobre o numero que foi definido é igual a 0
    val triplo = numero.filter { it % 3 == 0 }

    println(triplo)

    //Exercicio 14
    val preco = mutableListOf(99.99, 79.99, 9.99, 13.00)

    val somaPreco = preco.reduce { acumulador, numero ->
        acumulador + numero
    }
    println(somaPreco)

    //Exercicio 15
    val idade = mutableListOf(8, 10, 5, 14, 18)

    val mediaIdade = idade.average().toInt()
    println(mediaIdade)

    //Exercicio 16
    var fatorial = 1

    for (i in 1..5) {
        //Assim que ele fazer o calulo ele adiciona mais um ou seja 1, 1*2, 3 * 2 * 1...
        fatorial *= i

        println(fatorial)
    }

    //Exercicio 17
    val pessoa = Pessoa()

    pessoa.nome = "Maria"
    pessoa.idade = 25
    pessoa.cidade = "Sao paulo"

    println("${pessoa.nome} mora em ${pessoa.cidade} e tem ${pessoa.idade} anos")

    //Exercicio 18

    val listaProduto = arrayOf(
        Produto("Iphone 11", 3999.99),
        Produto("Tv 4k Led", 1999.99),
        Produto("Notebook Ultra Samsung", 2499.99)
    )

    val maiorPreco = listaProduto.maxByOrNull { it.preco }
    println("O maior preco encontrado foi $maiorPreco")



}
