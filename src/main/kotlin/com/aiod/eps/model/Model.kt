package com.aiod.eps.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Event(var  id: String?=null,@Id val name: String,
                 val type: String, val status: String,
                 val date: LocalDateTime= LocalDateTime.now())