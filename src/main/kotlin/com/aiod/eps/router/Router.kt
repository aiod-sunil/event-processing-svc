package com.aiod.eps.router

import com.aiod.eps.handler.EventHandler
import org.springframework.web.reactive.function.server.coRouter


fun routes(eventHandler: EventHandler) =  coRouter {

    GET("/api/events", eventHandler::events)
    GET("/api/counts", eventHandler::counts)
    GET("/api/findOne/{id}", eventHandler::findOne)
    POST("/api/insert", eventHandler::insert)
    PUT("/api/update", eventHandler::update)
    DELETE("/api/deleteAll", eventHandler::deleteAll)

}