package me.freedom4live.tornadofx.springboot.example.service

import org.springframework.stereotype.Component

interface BaseService {
    fun getMessage(): String
}

interface FirstService : BaseService

interface SecondService : BaseService

@Component
internal class FirstServiceImpl : FirstService {
    override fun getMessage() = "Hello from FirstService!"
}

@Component
internal class SecondServiceImpl : SecondService {
    override fun getMessage() = "Hello from SecondService!"
}