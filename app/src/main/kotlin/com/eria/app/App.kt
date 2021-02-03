/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.eria.app

import com.eria.utilities.StringUtils

import org.apache.commons.text.WordUtils
import tornadofx.*

class MyApp: App(MyView::class)

fun main(args: Array<String>) {
    launch<MyApp>(args)
}

class MyView: View() {
    override val root = vbox {
        button(" 123 ")
        label(" 456 ")
    }
}