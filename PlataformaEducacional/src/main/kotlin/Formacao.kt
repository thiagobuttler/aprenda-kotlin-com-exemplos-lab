data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário $usuario matriculado com sucesso!")
    }

    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("Usuário $usuario desmatriculado com sucesso!")
    }
}
