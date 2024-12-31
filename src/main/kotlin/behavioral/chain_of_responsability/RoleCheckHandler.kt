package behavioral.chain_of_responsability

class RoleCheckHandler(next: AuthenticationHandler?) : AuthenticationHandler(next) {
    private val userRoles = mapOf("user1" to "USER", "admin" to "ADMIN")

    override fun process(context: AuthContext): Boolean {
        val role = userRoles[context.request.username]
        val valid = role != null
        if (!valid) {
            println("Role check failed for ${context.request.username}")
        } else {
            context.role = role
            println("Role check passed for ${context.request.username} with role $role")
        }
        return valid
    }
}
