// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.test) apply false
    // AGP 9 provides built-in Kotlin support; org.jetbrains.kotlin.android is no
    // longer applied by any module. The `kotlin` version in libs.versions.toml
    // is still consumed by the Compose and serialization compiler plugins.
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.androidx.baselineprofile) apply false
}
