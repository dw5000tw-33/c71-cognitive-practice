plugins {
    id("com.android.application")
}

android {
    namespace = "com.thirtythree.cognitivepractice"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.thirtythree.cognitivepractice"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
}
