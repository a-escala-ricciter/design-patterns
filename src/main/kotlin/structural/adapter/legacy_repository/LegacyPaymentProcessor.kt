package structural.adapter.legacy_repository

import java.math.BigDecimal

// Legacy payment processing system
class LegacyPaymentProcessor {
    fun processLegacyDeposit(amount: BigDecimal, account: LegacyAccount) {
        println("Processing deposit of $$amount to ${account.number} using the legacy system.")
    }
}

data class LegacyAccount(
    val number: String
)
