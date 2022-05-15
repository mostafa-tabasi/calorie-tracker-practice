apply {
    from("$rootDir/base-module.gradle")
}

dependencies{
    "implementation"(project(Modules.CORE))
    "implementation"(project(Modules.TRACKER_DATA))
}