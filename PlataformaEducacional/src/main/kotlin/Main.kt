fun main() {
    val thiago = Usuario("thiago")
    println(thiago)

    val kotlinBasico = ConteudoEducacional("Kotlin Basico", 70, Dificuldade.AVANÇADO)
    println(kotlinBasico)

    val bootcampKotlin = Formacao("Bootcamp Kotlin", listOf(kotlinBasico))
    println(bootcampKotlin)

    bootcampKotlin.matricular(thiago)
    bootcampKotlin.desmatricular(thiago)
// ..
}

