package org.example


import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
/**
 * Clase que simula una estructura de pila (LIFO) para archivos físicos,
 * permitiendo almacenar, recuperar y listar archivos utilizando un fichero de texto como registro.
 *
 * @property storageDir Directorio donde se almacenan los archivos y el archivo de pila (`stack.txt`).
 */
class FileStack(private val storageDir: String = "storage") {

    private val stackFile = "$storageDir/stack.txt"

    init {
        Files.createDirectories(Paths.get(storageDir)) // Crea la carpeta si no existe
        File(stackFile).createNewFile() // Crea el archivo si no existe
    }
    /**
     * Agrega un archivo a la pila. El archivo se copia al directorio de almacenamiento
     * y se registra su nombre en `stack.txt`.
     *
     * @param filePath Ruta del archivo a almacenar.
     */
    fun push(filePath: String) {
        val file = File(filePath)
        if (file.exists()) {
            val destination = File("$storageDir/${file.name}")
            file.copyTo(destination, overwrite = true) // Copia el archivo al almacenamiento
            File(stackFile).appendText("${file.name}\n") // Registra el archivo en la pila
            println("Archivo '${file.name}' almacenado.")
        } else {
            println("El archivo no existe.")
        }
    }
    /**
     * Recupera el último archivo añadido a la pila. Elimina su registro de `stack.txt`,
     * pero **no elimina el archivo físicamente** del directorio de almacenamiento.
     *
     * @return Ruta absoluta del archivo recuperado o `null` si no hay archivos.
     */
    fun pop(): String? {
        val stack = File(stackFile).readLines()
        if (stack.isEmpty()) {
            println("No hay archivos en la pila.")
            return null
        }

        val lastFile = stack.last()
        val newStack = stack.dropLast(1) // Elimina el último archivo de la pila
        File(stackFile).writeText(newStack.joinToString("\n")) // Actualiza la pila

        val fileToRetrieve = File("$storageDir/$lastFile")
        if (fileToRetrieve.exists()) {
            println("Archivo recuperado: ${fileToRetrieve.name}")
            return fileToRetrieve.absolutePath
        }
        return null
    }
    /**
     * Muestra en consola los archivos actualmente registrados en la pila,
     * desde el último añadido hasta el primero.
     */
    fun listFiles() {
        val files = File(stackFile).readLines()
        if (files.isEmpty()) {
            println("La pila está vacía.")
        } else {
            println("Archivos en la pila:")
            files.reversed().forEach { println(" - $it") }
        }
    }
}
/**
 * Función principal que lanza el menú de interacción con el usuario.
 *
 * Permite:
 * 1. Agregar un archivo a la pila.
 * 2. Recuperar el último archivo.
 * 3. Ver la lista de archivos.
 * 4. Salir del programa.
 */
fun main() {
    val stack = FileStack()

    while (true) {
        println(
            """
            | Gestor de Archivos
            | Agregar archivo
            | Recuperar último archivo
            | Mostrar archivos en la pila
            | Salir
            | Elige una opción:
            """.trimMargin()
        )

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Ruta del archivo a almacenar: ")
                val path = readLine().orEmpty()
                stack.push(path)
            }
            2 -> stack.pop()
            3 -> stack.listFiles()
            4 -> {
                println("¡Hasta luego!")
                break
            }
            else -> println("Opción no válida.")
        }
    }
}