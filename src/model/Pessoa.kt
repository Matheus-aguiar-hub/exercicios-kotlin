package model

//Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com
//os dados do objeto por meio de um método: “Maria tem 25 anos e mora em São
//Paulo.”

class Pessoa {
    var nome: String = ""
    var cidade: String = ""
        get() {
            return field
        }

    var idade: Int = 25
        set(value){
            field = value
        }

}