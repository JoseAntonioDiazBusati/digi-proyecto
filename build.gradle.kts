plugins {
    kotlin("jvm") version "2.1.0"
    id("org.jetbrains.dokka") version "1.9.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
tasks.dokkaHtml {
    outputDirectory.set(buildDir.resolve("dokka")) // carpeta destino
    dokkaSourceSets {
        named("main") {
            includes.from("README.md") // opcional: incluir README
            perPackageOption {
                matchingRegex.set(".*internal.*") // opcional: excluir paquetes
                suppress.set(true)
            }
        }
    }
}