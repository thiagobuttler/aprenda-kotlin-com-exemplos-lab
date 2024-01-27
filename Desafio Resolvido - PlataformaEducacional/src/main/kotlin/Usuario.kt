data class Usuario(val nome: String) {

    val formacoesDoUsuario = mutableListOf<Formacao>()

    fun incluiFormacaoNaLista(formacao: Formacao) {
        formacoesDoUsuario.add(formacao)
    }

    fun ExibeInformacoesDoUsuario() {
        val nomeDasFormacoes = formacoesDoUsuario.joinToString(separator = ", ") { it.nome }
        println("O usuario $nome está matriculado nas formacoes: $nomeDasFormacoes")
    }
}
