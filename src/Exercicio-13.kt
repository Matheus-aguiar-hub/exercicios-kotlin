fun exibirTriplo(){
    val numero = (1 .. 20).toList()

    //Variavel imutavel filtrando o intervalo e divide o número que recebe e caso sobre o numero que foi definido é igual a 0
    val triplo = numero.filter { it % 3 == 0 }

    println(triplo)
}