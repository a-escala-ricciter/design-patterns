package structural.adapter

interface PaymentGateway {
    fun processPayment(amount: Double, account: Account)
}