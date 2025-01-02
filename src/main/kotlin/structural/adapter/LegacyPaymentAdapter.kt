package structural.adapter

import structural.adapter.legacy_repository.LegacyAccount
import structural.adapter.legacy_repository.LegacyPaymentProcessor
import java.math.BigDecimal

// Adapter to bridge the gap between LegacyPaymentProcessor and PaymentGateway
class LegacyPaymentAdapter(private val legacyProcessor: LegacyPaymentProcessor) : PaymentGateway {
    override fun processPayment(amount: Double, account: Account) {
        // Adapts the legacy system to the new system's interface
        legacyProcessor.processLegacyDeposit(
            amount = BigDecimal(amount),
            account = LegacyAccount(number = account.accountNumber)
        )
    }
}

