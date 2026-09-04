class ContaBancaria(
    var nomeTitular: String,
    var saldoInicial: Double,
) {
    private var saldo: Double = saldoInicial

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Deposito de R$ ${valor}")
        } else {
            println("Deposito inválido")
        }
    }

    fun sacar(valor: Double) {
        if (valor <= 0) {
            println("Valor de saque inválido")
        } else if (valor > saldo) {
            println("Saldo insuficiente para sacar")
        } else {
            saldo -= valor
            println("Saque realizado com sucesso")
        }
    }

    fun consultarSaldo(): Double {
        println("$nomeTitular saldo atual $saldo")
        return saldo
    }
}

fun main() {
    val conta = ContaBancaria(nomeTitular = "Maria Ivone", saldoInicial = 100.0)
    conta.consultarSaldo()
}