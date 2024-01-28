import org.gradle.internal.impldep.org.junit.experimental.categories.Categories.CategoryFilter.exclude

plugins {
    id("com.android.application")
    id("com.google.gms.google-services")

}


android {
    namespace = "com.example.amma"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.amma"
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
    packagingOptions {
        exclude("META-INF/NOTICE.md")
        exclude("META-INF/LICENSE.md")
        exclude("com/google/api/Advice.class")
        exclude("google/protobuf/type.proto")
        exclude("google/protobuf/**")
        exclude("META-INF/INDEX.LIST")
    }
//    configurations {
//        all {
//            exclude(group = "com.google.api", module = "Advice")
//        }
//    }
    configurations.implementation {
        exclude(group= "com.google.api", module= "Advice")
    }









}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-firestore:24.10.1")
    {
//        exclude( module="protolite-well-known-types")
//        exclude(module="protobuf-javalite")
//        exclude(module="protobuf-java")
//        exclude(module="protobuf-java-util")
    }
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")
    implementation("com.sun.mail:android-mail:1.6.6")
    implementation("com.sun.mail:android-activation:1.6.7")
    implementation("androidx.annotation:annotation:1.7.1")
  //compileOnly("com.google.cloud:google-cloud-translate:1.27.0")
    implementation("com.google.cloud:google-cloud-translate:1.27.0")
    {
       exclude(module="proto-google-common-protos")
        exclude(module="protobuf-java")
    }
        //implementation("com.google.api.grpc:proto-google-common-protos:1.9.0")
        //implementation("com.google.firebase:protolite-well-known-types:18.0.0")
    }
