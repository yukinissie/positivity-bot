package com.yukinissie.positivitybot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class PositivityBotApplication {
    @RequestMapping("/")
    fun home() = "Hello World!"
}

fun main(args: Array<String>) {
    runApplication<PositivityBotApplication>(*args)
}
