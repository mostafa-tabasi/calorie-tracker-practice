plugins {
  id(Plugins.ANDROID_APPLICATION)
  kotlin("android")
  kotlin("kapt")
}

android {
  compileSdk = Versions.COMPILE_SDK

  defaultConfig {
    applicationId = "com.calorietracker.android"
    minSdk = Versions.MIN_SDK
    targetSdk = Versions.TARGET_SDK
    versionCode = Versions.VERSION_CODE
    versionName = Versions.VERSION_NAME

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables.useSupportLibrary = true
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = Versions.COMPOSE
  }
  packagingOptions {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  api(platform(project(Modules.DEP_CONSTRAINTS)))
  kapt(platform(project(Modules.DEP_CONSTRAINTS)))
  implementation(project(Modules.CORE))
  implementation(project(Modules.CORE_UI))
  implementation(project(Modules.ONBOARDING_DOMAIN))
  implementation(project(Modules.ONBOARDING_PRESENTATION))
  implementation(project(Modules.TRACKER_DATA))
  implementation(project(Modules.TRACKER_DOMAIN))
  implementation(project(Modules.TRACKER_PRESENTATION))

  implementation(Libs.CORE_KTX)
  implementation(Libs.COMPOSE_UI)
  implementation(Libs.COMPOSE_MATERIAL)
  implementation(Libs.MATERIAL)
  implementation(Libs.LIFECYCLE_RUNTIME_KTX)
  implementation(Libs.ACTIVITY_COMPOSE)
  testImplementation(Libs.JUNIT)
  androidTestImplementation(Libs.EXT_JUNIT)
  androidTestImplementation(Libs.ESPRESSO_CORE)
  androidTestImplementation(Libs.COMPOSE_TEST)
  debugImplementation(Libs.COMPOSE_TOOLING)
  debugImplementation(Libs.COMPOSE_TOOLING_PREVIEW)
  debugImplementation(Libs.COMPOSE_TEST_MANIFEST)
}