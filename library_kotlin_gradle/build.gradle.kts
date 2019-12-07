//apply plugin: 'com.android.library'
//apply plugin: 'kotlin-android'
//apply plugin: 'kotlin-android-extensions'

//android {
//    compileSdkVersion 29
//    buildToolsVersion "29.0.2"
//
//
//    defaultConfig {
//        minSdkVersion 23
//        targetSdkVersion 29
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles 'consumer-rules.pro'
//    }
//
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//
//}
//
//dependencies {
//    implementation fileTree(dir: 'libs', include: ['*.jar'])
//    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
//    implementation 'androidx.appcompat:appcompat:1.1.0'
//    implementation 'androidx.core:core-ktx:1.1.0'
//    testImplementation 'junit:junit:4.12'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'
//}

open class GreetingPluginExtension {
    var message = "Hello from GreetingPlugin"
}

class GreetingPlugin : Plugin<Project> {


    override fun apply(project: Project) {

        val extension = project.extensions.create<GreetingPluginExtension>("greeting")


        project.task("hello") {
            doLast {
                println(extension.message)
            }
        }
    }
}

apply<GreetingPlugin>()

the<GreetingPluginExtension>().message = "Hi from Gradle"
