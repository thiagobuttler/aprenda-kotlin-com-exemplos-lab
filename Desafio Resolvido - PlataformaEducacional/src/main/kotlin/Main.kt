fun main() {

    val gitHubBasico = ConteudoEducacional("Git Hub Basico", 30, Dificuldade.BASICO)

    val javaBasico = ConteudoEducacional("Java Basico", 90, Dificuldade.BASICO)

    val formacaoKotlin = Formacao("Formacao Kotlin", listOf(gitHubBasico))

    val formacaoJava = Formacao("Java Basico", listOf(gitHubBasico, javaBasico))

    val taylor = Usuario("Taylor")

    formacaoKotlin.matricular(taylor)

    formacaoJava.matricular(taylor)

    taylor.ExibeInformacoesDoUsuario()

}

