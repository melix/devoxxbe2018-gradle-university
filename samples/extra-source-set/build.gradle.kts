/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

plugins {
    `java`
}

repositories {
    jcenter()
}

sourceSets {
    create("slowTest") {
        compileClasspath += sourceSets["main"].output
        runtimeClasspath += sourceSets["main"].output
    }
}

configurations {
    "slowTestImplementation" {
        extendsFrom(configurations.implementation.get())
    }
    "slowTestRuntime" {
        extendsFrom(configurations.runtime.get())
    }
}

dependencies {
    implementation("org.slf4j:slf4j-api:1.7.25")
    runtime("org.slf4j:slf4j-simple:1.7.25")
    "slowTestImplementation"("junit:junit:4.12")
}

tasks.create<Test>("slowTest") {
    classpath = sourceSets["slowTest"].runtimeClasspath
    testClassesDirs = sourceSets["slowTest"].output
}
