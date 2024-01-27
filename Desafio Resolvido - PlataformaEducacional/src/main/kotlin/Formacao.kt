data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        usuario.incluiFormacaoNaLista(this)
        println("Usuário ${usuario.nome} matriculado com sucesso na formacao $nome!")
    }

    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("Usuário {${usuario.nome}} desmatriculado com sucesso!")
    }

}
