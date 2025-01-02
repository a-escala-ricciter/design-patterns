package structural.adapter

import structural.adapter.legacy_repository.LegacyPaymentProcessor
import structural.adapter.repository.ModernPaymentGateway

// Main function demonstrating the usage of the adapter
fun main() {
    val account = Account(accountNumber = "1234", bankNumber = 1, agency = "1")

    // Using the modern payment gateway directly
    val modernGateway: PaymentGateway = ModernPaymentGateway()
    modernGateway.processPayment(100.0, account)

    // Using the legacy payment processor through the adapter
    val adaptedLegacyGateway: PaymentGateway = LegacyPaymentAdapter(LegacyPaymentProcessor())
    adaptedLegacyGateway.processPayment(150.0, account)
}
