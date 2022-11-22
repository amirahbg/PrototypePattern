// In real application this would be a database of users
val allUsers = mutableListOf<User>()
fun main() {

}

fun createUser(name: String, role: Role) {
    for (u in allUsers) {
        if (u.role == role) {
            allUsers += User(name, role, u.permissions)
            return
        }
    }
    // handle cases that no other user with such a role exists
}