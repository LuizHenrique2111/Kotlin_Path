import java.io.FileWriter
import java.io.IOException

fun buscarSistemaDeLog(): LoggerGenerico {
    return SistemaArquivo()
}

fun main() {

    val userA = Usuario(buscarSistemaDeLog())

    userA.criarPublicacao()

    val userB = Usuario(buscarSistemaDeLog())

    userB.criarPublicacao()

}

interface LoggerGenerico {
    fun print(message: String)
}

class SistemaConsole: LoggerGenerico {
    override fun print(message: String) {
        println(message)
    }
}

class SistemaArquivo: LoggerGenerico {
    override fun print(message: String) {
        val path = "C:/Users/hp"
        try {
            val fw = FileWriter(path, true)
            fw.write(message)
            fw.write("\n")
            fw.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}

class Usuario(val logger: LoggerGenerico) {

    init{
        log("Usuário criado!")
    }

    fun criarPublicacao() {
        log("Novo post criado!")
    }

    fun log(mensagem: String) {
        logger.print(mensagem)
    }
}