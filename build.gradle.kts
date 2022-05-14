buildscript {
  repositories {
    maven  (url = "https://maven.google.com" )
    google()
    mavenCentral()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")
  }
}

plugins {
  id(Plugins.ANDROID_APPLICATION) version Versions.ANDROID_GRADLE_PLUGIN apply false
  id(Plugins.ANDROID_LIBRARY) version Versions.ANDROID_GRADLE_PLUGIN apply false
  id(Plugins.KOTLIN_ANDROID) version Versions.KOTLIN apply false
  id(Plugins.KOTLIN_JVM) version Versions.KOTLIN apply false
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}