package com.aiod.eps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class EventProcessingSvcApplication

fun main(args:Array<String>) {
    runApplication<EventProcessingSvcApplication>(*args)
}