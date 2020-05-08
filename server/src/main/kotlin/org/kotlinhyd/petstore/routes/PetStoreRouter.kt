package org.kotlinhyd.petstore.routes

import org.kotlinhyd.petstore.handlers.PetHandler
import org.kotlinhyd.petstore.handlers.PetStoreHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.servlet.function.router

@Configuration
class PetStoreRouter(
    val petStoreHandler: PetStoreHandler,
    val petHandler: PetHandler
) {

    @Bean
    fun apiRouter() = router {
        (accept(APPLICATION_JSON) and "/api").nest {
            GET("/") { ok().body("Hello World! Welcome to PetStore") }
            GET("/getAllPets") { ok().body(petStoreHandler::getAllPetStores) }
            POST("/newPet") { ok().body(petHandler.newPet(it))}
        }
    }

}