fun main(){
    open class Funcionario(
        val nome: String,
        val salario: Double
    ) {
        val nomeFuncionario: String = nome
        private val salarioFuncionario: Double = salario

        protected fun obterSalario(): Double = salarioFuncionario

        open fun consultarSalario(): Double = salarioFuncionario

    }

    class Gerente (
        nome: String,
        salario: Double
    ): Funcionario(nome, salario) {
        val nomeGerente: String = nome

        private val salarioGerente = salario + (salario * 0.2)

        override fun consultarSalario(): Double {
            return salarioGerente
        }
    }

    val funcionario = Funcionario( "Joao", 1000.0)
    val gerente = Gerente( "Luis", 1000.0)

    val salarioFuncionario = funcionario.consultarSalario()
    val salarioGerente = gerente.consultarSalario()

    println(salarioFuncionario)
    println(salarioGerente)
}