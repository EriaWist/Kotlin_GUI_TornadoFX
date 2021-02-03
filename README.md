# Kotlin_GUI_TornadoFX
## [gradle建立Kotlin應用](https://docs.gradle.org/current/samples/sample_building_kotlin_libraries.html)
```
$ mkdir demo
$ cd demo
建議新增資料夾
$ gradle init
//為了配合大多數開發者習慣
Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1
我們選擇Groovy
```
## [TornadoFX](https://edvin.gitbooks.io/tornadofx-guide/content/part1/2_Setting_Up.html)
```
plugins {
    id 'application'
    id 'org.openjfx.javafxplugin' version '0.0.8'
}
javafx {
    version = "11.0.2"
    modules = ['javafx.controls', 'javafx.graphics']
}

dependencies {
    implementation 'no.tornado:tornadofx:1.7.20'
}
compileKotlin {
    kotlinOptions.jvmTarget = "15"
}

```
因為版本現在jvm已經到15以及x.y.z是看TornadoFX目前版本為1.7.20
[TornadoFX版本](https://tornadofx.io/)
