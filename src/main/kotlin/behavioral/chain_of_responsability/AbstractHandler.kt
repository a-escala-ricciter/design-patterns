package behavioral.chain_of_responsability

// Abstract Handler
abstract class AuthenticationHandler(
    private val next: AuthenticationHandler?
) {
    open fun handle(context: AuthContext): Boolean {
        // Process current handler
        val handled = process(context)
        // Stop the chain if the current step fails
        return if (handled) {
            next?.handle(context) ?: true // Continue to the next handler or return true if none
        } else {
            false
        }
    }

    protected abstract fun process(context: AuthContext): Boolean
}
