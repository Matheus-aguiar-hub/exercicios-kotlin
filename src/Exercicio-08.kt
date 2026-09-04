fun calculoPares(){
    val arrayPares = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var pares = 0

    for (numero in arrayPares) {
        if (numero % 2 == 0) {
            pares += numero
        }
    }

    println("A soma dos pares é: $pares")
}