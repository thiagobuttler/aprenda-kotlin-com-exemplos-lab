data class Usuario(val nome: String) {

    val formacoesDoUsuario = mutableListOf<Formacao>()

    fun incluiFormacaoNaLista(formacao: Formacao) {
        formacoesDoUsuario.add(formacao)
    }

    fun ExibeInformacoesDoUsuario() {
        val nomeDasFormacoes = formacoesDoUsuario.joinToString(separator = ", ") { it.nome }
        println("O usuario $nome está matriculado nas formacoes: $nomeDasFormacoes")
    }
    fun matricular(formacao: Formacao) {
        formacao.inscritos.add(this)
        incluiFormacaoNaLista(formacao)
        println("Usuário $nome matriculado com sucesso na formacao ${formacao.nome}!")
    }

    fun desmatricular(formacao: Formacao) {
        formacao.inscritos.remove(this)
        println("Usuário $nome desmatriculado com sucesso da formacao ${formacao.nome}!")
    }
}
