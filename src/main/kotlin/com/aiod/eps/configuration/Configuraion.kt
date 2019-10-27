package com.aiod.eps.configuration

import com.aiod.eps.handler.EventHandler
import com.aiod.eps.repository.EventRepository
import com.aiod.eps.router.routes
import org.springframework.fu.kofu.configuration
import org.springframework.fu.kofu.mongo.reactiveMongodb
import de.flapdoodle.embed.mongo.distribution.Version
import org.springframework.fu.kofu.webflux.webFlux

val dataConfig= configuration {
    beans {
        bean<EventRepository>()
    }
    reactiveMongodb{
        embedded{
            version= Version.Main.PRODUCTION
        }
    }
}

val webConfig = configuration {
    beans {
        bean<EventHandler>()
        bean(::routes)
    }
    webFlux {
        port = if (profiles.contains("test")) 8181 else 8080
        codecs {
            string()
            jackson()
        }
    }
}