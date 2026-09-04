 fun batataQuente(){
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
 }