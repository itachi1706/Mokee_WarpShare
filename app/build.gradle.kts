plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.mokee.warpshare"
    compileSdk = 33

    defaultConfig {
        applicationId = "org.mokee.warpshare"
        minSdk = 19
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        multiDexEnabled = true

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.preference:preference:1.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Compile only cloud.jar
//    implementation(files("libs/cloud.jar")) // MoKee ROM Cloud Maanger

    // Packages only on JCenter (now sunsetted)
    implementation(files("libs/com.microsoft.connecteddevices_connecteddevices-sdk_1.3.0.aar")) // Microsoft Connected Devices SDK
    implementation(files("libs/com.gemalto.jp2_jp2-android_1.0.aar")) // JP2 Library

    implementation("com.squareup.okio:okio:2.2.2")
    implementation("me.zhanghai.android.materialprogressbar:library:1.6.1")
    implementation("com.github.bumptech.glide:glide:4.10.0")
    implementation("org.jmdns:jmdns:3.5.1")
    implementation("com.googlecode.plist:dd-plist:1.22")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    implementation("com.koushikdutta.async:androidasync:2.2.1")
    // https://mvnrepository.com/artifact/org.apache.commons/commons-compress
    implementation("org.apache.commons:commons-compress:1.19")
    // https://mvnrepository.com/artifact/com.gemalto.jp2/jp2-android


}