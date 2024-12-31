package behavioral.chain_of_responsability

class UsernamePasswordHandler(next: AuthenticationHandler?) : AuthenticationHandler(next) {
    private val validUsers = mapOf("user1" to "password1", "admin" to "adminpass")

    override fun process(context: AuthContext): Boolean {
        val valid = validUsers[context.request.username] == context.request.password

        if (!valid) {
            println("Username/Password authentication failed for ${context.request.username}")
        } else {
            println("Username/Password authentication passed for ${context.request.username}")
        }
        return valid
    }
}
