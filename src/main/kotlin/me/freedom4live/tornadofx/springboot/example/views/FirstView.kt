package me.freedom4live.tornadofx.springboot.example.views

import me.freedom4live.tornadofx.springboot.example.service.FirstService
import tornadofx.*

class FirstView : View("FirstTitle") {

    private val firstService: FirstService by di()

    override val root = vbox {
        label { text = firstService.getMessage() }
        button("Go to second view") { action { replaceWith<SecondView>() } }
    }

}
