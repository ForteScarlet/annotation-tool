/*
 *  Copyright (c) 2021-2021 ForteScarlet <https://github.com/ForteScarlet>
 *
 *  根据 Apache License 2.0 获得许可；
 *  除非遵守许可，否则您不得使用此文件。
 *  您可以在以下网址获取许可证副本：
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *   有关许可证下的权限和限制的具体语言，请参见许可证。
 */

plugins {
    `kotlin-dsl`
    java
}

repositories {
    mavenLocal()
    google()
    mavenCentral()
}

kotlin {
    sourceSets.all {
        languageSettings.optIn("kotlin.Experimental")
        languageSettings.optIn("kotlin.RequiresOptIn")
    }
}

dependencies {
    // implementation("org.jetbrains.kotlin", "kotlin-gradle-plugin", "1.5.31")
    // implementation("org.jetbrains.kotlin", "kotlin-compiler-embeddable", "1.5.31")
    // implementation(gradleApi())
}

