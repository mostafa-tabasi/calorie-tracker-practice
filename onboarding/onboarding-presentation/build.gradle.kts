apply {
    from("$rootDir/base-compose-module.gradle")
}

dependencies{
    "implementation"(project(Modules.CORE))
    "implementation"(project(Modules.CORE_UI))
    "implementation"(project(Modules.ONBOARDING_DOMAIN))
}