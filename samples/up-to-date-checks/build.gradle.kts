import com.acme.demo.MySign

plugins {
    id("com.gradle.build-scan") version ("2.0.2")
    id("my-signing-plugin")
    `java-library`
}

tasks.sign {
    sources = files(sourceSets.main.map { it.allSource })
    algorithm = "sha256"
}

defaultTasks("sign")