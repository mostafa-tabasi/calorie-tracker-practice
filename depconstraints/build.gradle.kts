plugins {
  id(Plugins.JAVA_LIBRARY)
  id(Plugins.KOTLIN_JVM)
  id("maven-publish")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
  constraints {
    api("${Libs.CORE_KTX}:${Versions.CORE_KTX}")
    api("${Libs.COMPOSE_TOOLING}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TEST_MANIFEST}:${Versions.COMPOSE}")
    api("${Libs.MATERIAL}:${Versions.MATERIAL}")
  }
}