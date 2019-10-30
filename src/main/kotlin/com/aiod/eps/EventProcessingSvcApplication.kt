package com.aiod.eps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class EventProcessingSvcApplication{
    @Bean
    fun kotlinFunction(): (String) -> String {
        return  { it.toUpperCase() }
    }
}

fun main(args:Array<String>) {
    runApplication<EventProcessingSvcApplication>(*args)
}