package me.freedom4live.tornadofx.springboot.example.views

import me.freedom4live.tornadofx.springboot.example.service.SecondService
import tornadofx.*

class SecondView : View("SecondTitle") {

    private val secondService: SecondService by di()

    override val root = vbox {
        label { text = secondService.getMessage() }
        button("Go to first view") { action { replaceWith<FirstView>() } }
    }

}