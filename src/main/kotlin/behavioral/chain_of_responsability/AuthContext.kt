package behavioral.chain_of_responsability

data class AuthContext(
    val request: Request,
    var role: String? = null // Populated during the RoleCheckHandler
)
