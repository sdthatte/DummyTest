plugins{
    application()
}
repositories {
    mavenCentral()
}
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
    implementation("com.google.guava:guava:27.0-jre")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
}
    
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")
        implementation("com.google.guava:guava:27.0-jre")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform() 
}
