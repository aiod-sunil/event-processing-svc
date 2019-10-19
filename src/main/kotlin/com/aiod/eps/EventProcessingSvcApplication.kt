package com.aiod.eps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class EventProcessingSvcApplication {
    companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			runApplication<EventProcessingSvcApplication>(*args)
		}
	}

	@Bean
	fun  hello():(String) ->String{
		return {it.toUpperCase()}
	}
}