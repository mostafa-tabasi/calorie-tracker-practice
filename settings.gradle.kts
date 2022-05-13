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
  ":tracker",
  ":onboarding",
  ":onboarding:onboarding_domain",
  ":onboarding:onboarding_presentation",
  ":tracker:tracker_data",
  ":tracker:tracker_domain",
  ":tracker:tracker_presentation",
  ":depconstraints",
)
