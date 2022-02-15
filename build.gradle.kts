// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.1.1" apply false
    id("com.android.library") version "7.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
}

tasks.create<Delete>("clean") {
    delete = setOf(
        rootProject.buildDir,
        "utils/libradiantstodegrees.dylib",
    )
}

val localNativeBuild = tasks.create<Exec>("localNativeBuild") {
    commandLine = listOf("sh", "./scripts/buildLocalNativeLib.sh")
}

project.afterEvaluate {
    // Run CMake and  before tests to build the library
    getTasksByName("testDebugUnitTest", true).forEach {
        it.dependsOn(localNativeBuild)
    }
}