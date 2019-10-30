package com.aiod.eps.kafka

import org.springframework.context.annotation.Bean

class KafkaConsumer {
   @Bean
    fun kotlinFunction(): (String) -> String {
        return  { it.toUpperCase() }
    }
}