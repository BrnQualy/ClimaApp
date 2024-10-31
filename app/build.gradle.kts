plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.climaapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.climaapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.core)
    implementation(libs.recyclerview)
    implementation(libs.viewpager2)
    implementation(libs.converter.gson)
    implementation(libs.zxing.core)
    implementation(libs.androidx.junit)
    implementation(libs.espresso.core)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.core.ktx)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    debugImplementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.androidx.ui.test.junit4)
    implementation(libs.androidx.material3)
    implementation(libs.retrofit)
    implementation(libs.volley)
    implementation(libs.zxing.android.embedded)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}