plugins {
  id(Plugins.ANDROID_APPLICATION)
  id("dagger.hilt.android.plugin")
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
    release {
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
  implementation(platform(project(Modules.DEP_CONSTRAINTS)))
  kapt(platform(project(Modules.DEP_CONSTRAINTS)))
  implementation(project(Modules.CORE))
  implementation(project(Modules.CORE_UI))
  implementation(project(Modules.ONBOARDING_DOMAIN))
  implementation(project(Modules.ONBOARDING_PRESENTATION))
  implementation(project(Modules.TRACKER_DATA))
  implementation(project(Modules.TRACKER_DOMAIN))
  implementation(project(Modules.TRACKER_PRESENTATION))

  implementation(Libs.APP_COMPAT)
  implementation(Libs.CORE_KTX)
  implementation(Libs.MATERIAL)
  implementation(Libs.LIFECYCLE_RUNTIME_KTX)
  implementation(Libs.LIFECYCLE_VIEWMODEL_COMPOSE)
  implementation(Libs.ACTIVITY_COMPOSE)
  implementation(Libs.COMPOSE_UI)
  implementation(Libs.COMPOSE_COMPILER)
  implementation(Libs.COMPOSE_MATERIAL)
  implementation(Libs.COMPOSE_RUNTIME)
  implementation(Libs.COIL_COMPOSE)
  implementation(Libs.NAVIGATION_COMPOSE)
  implementation(Libs.HILT_ANDROID)
  implementation(Libs.HILT_NAVIGATION_COMPOSE)
  implementation(Libs.RETROFIT)
  implementation(Libs.RETROFIT_MOSHI_CONVERTER)
  implementation(Libs.OKHTTP)
  implementation(Libs.OKHTTP_LOGGING_INTERCEPTOR)
  implementation(Libs.ROOM_RUNTIME)
  implementation(Libs.ROOM_KTX)
  kapt(Libs.HILT_COMPILER)
  kapt(Libs.ROOM_COMPILER)

  debugImplementation(Libs.COMPOSE_UI_TOOLING)
  debugImplementation(Libs.COMPOSE_UI_TOOLING_PREVIEW)
  debugImplementation(Libs.COMPOSE_TEST_MANIFEST)

  testImplementation(Libs.JUNIT)
  androidTestImplementation(Libs.EXT_JUNIT)
  androidTestImplementation(Libs.ESPRESSO_CORE)
  androidTestImplementation(Libs.COMPOSE_TEST)

//  testImplementation(Testing.junit4)
//  testImplementation(Testing.junitAndroidExt)
//  testImplementation(Testing.truth)
//  testImplementation(Testing.coroutines)
//  testImplementation(Testing.turbine)
//  testImplementation(Testing.composeUiTest)
//  testImplementation(Testing.mockk)
//  testImplementation(Testing.mockWebServer)

//  androidTestImplementation(Testing.junit4)
//  androidTestImplementation(Testing.junitAndroidExt)
//  androidTestImplementation(Testing.truth)
//  androidTestImplementation(Testing.coroutines)
//  androidTestImplementation(Testing.turbine)
//  androidTestImplementation(Testing.composeUiTest)
//  androidTestImplementation(Testing.mockkAndroid)
//  androidTestImplementation(Testing.mockWebServer)
//  androidTestImplementation(Testing.hiltTesting)
//  kaptAndroidTest(DaggerHilt.hiltCompiler)
//  androidTestImplementation(Testing.testRunner)
}