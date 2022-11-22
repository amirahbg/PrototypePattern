data class User(
    val name: String,
    val role: Role,
    val permissions: Set<String>
) {
    fun hasPermission(permission: String) = permission in permissions
}

enum class Role {
    ADMIN,
    SUPER_ADMIN,
    REGULAR_USER
}