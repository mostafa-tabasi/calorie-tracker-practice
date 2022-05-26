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
    api("${Libs.COMPOSE_COMPILER}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_MATERIAL}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_RUNTIME}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_UI_TOOLING}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_UI_TOOLING_PREVIEW}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TEST}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_TEST_MANIFEST}:${Versions.COMPOSE}")
    api("${Libs.COMPOSE_UI}:${Versions.COMPOSE}")
    api("${Libs.COIL_COMPOSE}:${Versions.COIL_COMPOSE}")
    api("${Libs.EXT_JUNIT}:${Versions.EXT_JUNIT}")
    api("${Libs.ESPRESSO_CORE}:${Versions.ESPRESSO_CORE}")
    api("${Libs.HILT_ANDROID}:${Versions.HILT}")
    api("${Libs.HILT_COMPILER}:${Versions.HILT}")
    api("${Libs.HILT_NAVIGATION_COMPOSE}:${Versions.HILT_NAVIGATION_COMPOSE}")
    api("${Libs.JUNIT}:${Versions.JUNIT}")
    api("${Libs.LIFECYCLE_RUNTIME_KTX}:${Versions.LIFECYCLE}")
    api("${Libs.LIFECYCLE_VIEWMODEL_COMPOSE}:${Versions.LIFECYCLE}")
    api("${Libs.MATERIAL}:${Versions.MATERIAL}")
    api("${Libs.NAVIGATION_COMPOSE}:${Versions.NAVIGATION_COMPOSE}")
    api("${Libs.OKHTTP}:${Versions.OKHTTP}")
    api("${Libs.OKHTTP_LOGGING_INTERCEPTOR}:${Versions.OKHTTP}")
    api("${Libs.RETROFIT}:${Versions.RETROFIT}")
    api("${Libs.RETROFIT_MOSHI_CONVERTER}:${Versions.RETROFIT}")
    api("${Libs.ROOM_COMPILER}:${Versions.ROOM}")
    api("${Libs.ROOM_RUNTIME}:${Versions.ROOM}")
    api("${Libs.ROOM_KTX}:${Versions.ROOM}")
  }
}