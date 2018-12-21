object ApplicationId {
    const val id = "com.bsaugues.cleansample"
}

object Modules {
    const val app = ":app"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Versions {
    const val gradlePlugin = "3.2.1"

    const val kotlin = "1.3.11"

    const val compileSdk = 28
    const val targetSdk = 28
    const val minSdk = 21

    const val appcompat = "1.0.2"
    const val design = "1.0.0"
    const val constraintLayout = "1.1.3"

    const val rxJava = "2.2.3"
    const val rxAndroid = "2.1.0"
    const val rxKotlin = "2.3.0"
    const val retrofit = "2.5.0"
    const val lifecycle = "2.0.0"
    const val room = "2.1.0-alpha01"
    const val dagger = "2.16"

    const val junit = "4.12"
    const val runner = "1.0.2"
    const val espresso = "3.0.2"
}

object Languages {
    const val english = "en"
    const val french = "fr"
}

object Libraries {
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object SupportLibraries {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val design = "com.google.android.material:material:${Versions.design}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
}

object TestLibraries {
    const val runnerClass = "android.support.test.runner.AndroidJUnitRunner"
    const val junit = "junit:junit:${Versions.junit}"

    const val testRunner = "com.android.support.test:runner:${Versions.runner}"
    const val espressoCore = "com.android.support.test:runner:${Versions.espresso}"

    const val lifecycleTesting = "androidx.arch.core:core-testing:${Versions.lifecycle}"
    const val roomTesting = "androidx.room:room-testing:${Versions.room}"
}