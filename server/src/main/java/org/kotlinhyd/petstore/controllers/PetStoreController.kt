package org.kotlinhyd.petstore.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PetStoreController {

    @RequestMapping("/")
    fun helloController(): String =
        """Hello World! 
            First Kotlin App With Spring""".trim()
}