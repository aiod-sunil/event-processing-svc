package com.aiod.eps.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*

@Document
data class Event(val id: String, val name: String,
                 val type: String, val status: String,
                 val date: LocalDateTime)