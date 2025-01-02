package structural.adapter.repository

import structural.adapter.Account
import structural.adapter.PaymentGateway

// New payment gateway that you want to integrate
class ModernPaymentGateway : PaymentGateway {
    override fun processPayment(amount: Double, account: Account) {
        println("Processing payment of $$amount using the modern gateway.")
    }
}
