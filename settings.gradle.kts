rootProject.name = "Calorie Tracker"

pluginManagement {
  repositories {
    maven(url = "https://maven.google.com")
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    maven(url = "https://maven.google.com")
    google()
    mavenCentral()
  }
}

include(
 ":app",
 ":core",
 ":core-ui",
 ":dep-constraints",
 ":onboarding",
 ":onboarding:onboarding-domain",
 ":onboarding:onboarding-presentation",
 ":tracker",
 ":tracker:tracker-data",
 ":tracker:tracker-domain",
 ":tracker:tracker-presentation",
)
