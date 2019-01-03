object PluginDependencies {
    val android = "com.android.tools.build:gradle:${Versions.gradleAndroidPlugin}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Modules {
    val app = ":app"
}

object Versions {
    val gradleAndroidPlugin = "3.2.1"
    val kotlin = "1.3.11"

    val compileSdk = 28
    val targetSdk = 28
    val minSdk = 21
    val releaseVersionCode = 1
    val releaseVersionName = "1.0"

    val appcompat = "1.0.2"
    val design = "1.0.0"
    val constraintLayout = "1.1.3"

    val rxJava = "2.2.3"
    val rxAndroid = "2.1.0"
    val rxKotlin = "2.3.0"
    val retrofit = "2.5.0"
    val lifecycle = "2.0.0"
    val room = "2.1.0-alpha01"
    val dagger = "2.16"

    val junit = "4.12"
    val runner = "1.0.2"
    val espresso = "3.0.2"
}

object Languages {
    val english = "en"
    val french = "fr"
}

object Libraries {
    val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object SupportLibraries {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val design = "com.google.android.material:material:${Versions.design}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
}

object TestLibraries {
    val runnerClass = "android.support.test.runner.AndroidJUnitRunner"
    val junit = "junit:junit:${Versions.junit}"

    val testRunner = "com.android.support.test:runner:${Versions.runner}"
    val espressoCore = "com.android.support.test:runner:${Versions.espresso}"

    val lifecycleTesting = "androidx.arch.core:core-testing:${Versions.lifecycle}"
    val roomTesting = "androidx.room:room-testing:${Versions.room}"
}