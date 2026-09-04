import model.Pessoa

    fun pessoa(){
        val pessoa = Pessoa()

        pessoa.nome = "Maria"
        pessoa.idade = 25
        pessoa.cidade = "Sao paulo"

        println("${pessoa.nome} mora em ${pessoa.cidade} e tem ${pessoa.idade} anos")
    }