plugins {
    `java-library`
    id("code-generator")
}

tasks {
    generateCode {
        conferences = setOf("Breizhcamp", "Devoxx")
    }

    compileJava {
        dependsOn(generateCode)
        source(generateCode.get().outputDirectory)
    }
}

