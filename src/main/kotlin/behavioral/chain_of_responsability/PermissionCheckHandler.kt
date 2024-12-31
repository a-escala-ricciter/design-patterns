package behavioral.chain_of_responsability

class PermissionCheckHandler(next: AuthenticationHandler?) : AuthenticationHandler(next) {
    private val rolePermissions = mapOf(
        "ADMIN" to listOf("read", "write", "delete"),
        "USER" to listOf("read")
    )

    override fun process(context: AuthContext): Boolean {
        val permissions = rolePermissions[context.role]
        val valid = permissions?.contains(context.request.action) == true
        if (!valid) {
            println("Permission check failed for ${context.role} on action ${context.request.action}")
        } else {
            println("Permission check passed for ${context.role} on action ${context.request.action}")
        }
        return valid
    }
}
