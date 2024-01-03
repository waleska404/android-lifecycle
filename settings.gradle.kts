pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidLifecycle"
include(":app")
include(":feature:activity")
include(":core:util")
include(":feature:home")
include(":core:ui")
include(":feature:fragment")
