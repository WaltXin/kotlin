plugins {
    kotlin("js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":base"))
}

kotlin {
    target {
        browser {
            useCommonJs()
        }
    }
}