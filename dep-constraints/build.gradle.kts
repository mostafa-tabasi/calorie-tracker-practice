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
    api("${Libs.ACTIVITY_COMPOSE}:${Versions.ACTIVITY_COMPOSE}")
    api("${Libs.APP_COMPAT}:${Versions.APP_COMPAT}")
    api("${Libs.CORE_KTX}:${Versions.CORE_KTX}")
    api("${Libs.COMPOSE_UI}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_MATERIAL}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TOOLING}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TOOLING_PREVIEW}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TEST}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TEST_MANIFEST}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_UI}:${Versions.COMPOSE}")
    api("${Libs.EXT_JUNIT}:${Versions.EXT_JUNIT}")
    api("${Libs.ESPRESSO_CORE}:${Versions.ESPRESSO_CORE}")
    api("${Libs.JUNIT}:${Versions.JUNIT}")
    api("${Libs.LIFECYCLE_RUNTIME_KTX}:${Versions.LIFECYCLE_RUNTIME_KTX}")
    api("${Libs.MATERIAL}:${Versions.MATERIAL}")
  }
}