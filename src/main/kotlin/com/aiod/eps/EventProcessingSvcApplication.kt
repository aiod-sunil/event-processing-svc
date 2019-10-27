package com.aiod.eps

import com.aiod.eps.configuration.dataConfig
import com.aiod.eps.configuration.webConfig
import org.springframework.boot.WebApplicationType
import org.springframework.fu.kofu.application
import org.springframework.fu.kofu.webflux.webFlux
import org.springframework.web.reactive.function.server.bodyValueAndAwait


val app = application(WebApplicationType.REACTIVE) {
    enable(dataConfig)
    enable(webConfig)
}
fun main() {
    app.run()
}