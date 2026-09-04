fun fatorial(){
    var fatorial = 1

    for (i in 1..5) {
        //Assim que ele fazer o calulo ele adiciona mais um ou seja 1, 1*2, 3 * 2 * 1...
        fatorial *= i

        println(fatorial)
    }
}