package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class FileStack(private val storageDir: String = "storage") {

    private val stackFile = "$storageDir/stack.txt"

    init {
        Files.createDirectories(Paths.get(storageDir)) // Crea la carpeta si no existe
        File(stackFile).createNewFile() // Crea el archivo si no existe
    }

    fun push(filePath: String) {
        val file = File(filePath)
        if (file.exists()) {
            val destination = File("$storageDir/${file.name}")
            file.copyTo(destination, overwrite = true) // Copia el archivo al almacenamiento
            File(stackFile).appendText("${file.name}\n") // Registra el archivo en la pila
            println("✅ Archivo '${file.name}' almacenado.")
        } else {
            println("❌ El archivo no existe.")
        }
    }

    fun pop(): String? {
        val stack = File(stackFile).readLines()
        if (stack.isEmpty()) {
            println("⚠ No hay archivos en la pila.")
            return null
        }

        val lastFile = stack.last()
        val newStack = stack.dropLast(1) // Elimina el último archivo de la pila
        File(stackFile).writeText(newStack.joinToString("\n")) // Actualiza la pila

        val fileToRetrieve = File("$storageDir/$lastFile")
        if (fileToRetrieve.exists()) {
            println("📂 Archivo recuperado: ${fileToRetrieve.name}")
            return fileToRetrieve.absolutePath
        }
        return null
    }

    fun listFiles() {
        val files = File(stackFile).readLines()
        if (files.isEmpty()) {
            println("📂 La pila está vacía.")
        } else {
            println("📜 Archivos en la pila:")
            files.reversed().forEach { println(" - $it") }
        }
    }
}

fun main() {
    val stack = FileStack()

    while (true) {
        println(
            """
            |📂 Gestor de Archivos
            |1️⃣ Agregar archivo
            |2️⃣ Recuperar último archivo
            |3️⃣ Mostrar archivos en la pila
            |4️⃣ Salir
            |👉 Elige una opción:
            """.trimMargin()
        )

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("📂 Ruta del archivo a almacenar: ")
                val path = readLine().orEmpty()
                stack.push(path)
            }
            2 -> stack.pop()
            3 -> stack.listFiles()
            4 -> {
                println("👋 ¡Hasta luego!")
                break
            }
            else -> println("❌ Opción no válida.")
        }
    }
}