package com.aiod.eps

import org.springframework.boot.WebApplicationType
import org.springframework.fu.kofu.application
import org.springframework.fu.kofu.webflux.webFlux
import org.springframework.web.reactive.function.server.bodyValueAndAwait


val app = application(WebApplicationType.REACTIVE){
  webFlux(){

             port=8090
             coRouter {
                 GET("/") {

                     ok().bodyValueAndAwait("hello")

                 }
             }
             codecs {
                 string()
                 jackson()
             }
         }
}
data class Hello(val name: String)
class SampleService {
    fun generateMessage() = "Hello world!"
}

fun main() {
    app.run()
}