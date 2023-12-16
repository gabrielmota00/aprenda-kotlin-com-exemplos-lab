// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { INICIANTE, INTERMEDIARIO, AVANÇADO }

data class Aluno(val nome: String, var age: Int){
    var matriculas = matricular
}

data class ConteudoEducacional(val nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(usuario: Aluno) {
        // Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).

    }
}

fun main() {
    // Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.
    // Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.
}
