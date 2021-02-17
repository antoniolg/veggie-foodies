buildscript {
    val compose_version by extra("1.0.0-alpha08")
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
        classpath("com.android.tools.build:gradle:7.0.0-alpha06")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}