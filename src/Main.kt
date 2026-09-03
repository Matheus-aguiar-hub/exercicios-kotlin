fun main() {
    //Atividade número 1
    //Crie uma variável numérica e diga se o número é par ou (resto da divisão por
    //2 = 0) ímpar (resto da divisão por 2 = 1)

    //O numero x vai ser dividido e vai retornar se é par ou impar
    var divisao = 2/4

    when (divisao) {
        in 0 .. 100 step 2 -> println("Par")
        else -> println("Impar")
    }

    //Atividade número 2
    // Crie uma variável numérica e exiba se o número é positivo, negativo ou zero

    var validacao = -100

    if(validacao < 0) {
        println("Negativo")
    }else if(validacao > 0) {
        println("Positivo")
    }else {
        println("Zero")
    }

    //Atividade número 3
    //Crie uma variável idade e diga "Criança" caso seja menor de 12,
    //"Adolescente" entre 12 e 17, "Adulto" entre 18 e 59 e "Idoso" se 60 ou mais

    val idade = 37

    when (idade) {
        in 0 .. 12 -> println ("Crianca")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")
    }

    //Atividade número 4
    //Crie uma variável numérica e exiba sua tabuada de 1 a 10

    var i = 1
    var tabuada = 3

    while ( i <= 10 ){
        println (i * tabuada)
        i++
    }

    //Atividade 05
    //Dado um array de números, calcule a soma de todos eles (ex: [1,2,3,4] → 10)

    val arraySoma = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val soma = arraySoma.sum()

    println("A soma dos valores é: $soma")

    //Atividade 06
    //Encontre o maior número dentro de um array (ex: [5,8,2,10,3] → 10)
    val arrayMaior = arrayOf(5, 8, 2, 10, 3)

    val maior = arrayMaior.maxOrNull()

    println("O maior número é: $maior")

    //Atividade 07
    //Crie uma variável numérica e exiba uma contagem regressiva até zero

    for (i in 10 downTo 0) {
        println(i)

    }

    //Atividade 08
    //Dado um array de números, calcule somente a soma dos números pares (ex:
    //[1,2,3,4] → 6)

    val arrayPares = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var pares = 0

    for (numero in arrayPares) {
        //Calculando o resto da divisao por 2 e se for igual a 0, acontece a soma com os números pares
        if (numero % 2 == 0) {
            pares += numero
        }
    }

    println("A soma dos pares é: $soma")

    //Atividade 09
    //Crie uma função que receba um número e retorne o dobro dele
    println(dobroValor())

    //Atividade 10
    //Faça uma função que receba 3 notas e retorne a média do aluno
    println(notaAluno())

    //Atividade 11
    //Faça uma função que receba uma temperatura Celsius (ponto flutuante)
    converterTemp(34.5f)

}

///Atividade 09
fun dobroValor (): Int{
    return 67 * 2
}

//Atividade 10
fun notaAluno (): Int{
    val val1 = 6
    val val2 = 5
    val val3 = 9
    var soma = val1 + val2 + val3
    return soma / 3
}

// Atividade 11
fun converterTemp(celsius: Float) {
    val formulaFahrenheit = (celsius * 9f / 5f) + 32
    println(formulaFahrenheit)

    //Chamando classes.

}