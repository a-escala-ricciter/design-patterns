package behavioral.chain_of_responsability

/** Why Chain of Responsibility Works Well Here
Flexibility: You can easily add new steps to the authentication pipeline (e.g., CAPTCHA verification) without changing the existing code.
Separation of Concerns: Each handler is self-contained and responsible for a single validation step.
Dynamic Composition: The chain can be configured at runtime based on requirements (e.g., skip permission check for guest users).
This pattern ensures the system is extensible, maintainable, and capable of handling complex workflows without becoming tightly coupled.
*/
fun main() {
    // Build the chain: Username/Password -> Role Check -> Permission Check
    val authChain = UsernamePasswordHandler(
        next = RoleCheckHandler(
            next = PermissionCheckHandler(null)
        )
    )

    val request1 = Request(username = "user1", password = "password1", action = "read")
    val request2 = Request(username = "admin", password = "wrongpass", action = "delete")
    val request3 = Request(username = "admin", password = "adminpass", action = "write")

    println("\nProcessing Request 1:")
    authChain.handle(AuthContext(request1))

    println("\nProcessing Request 2:")
    authChain.handle(AuthContext(request2))

    println("\nProcessing Request 3:")
    authChain.handle(AuthContext(request3))
}
