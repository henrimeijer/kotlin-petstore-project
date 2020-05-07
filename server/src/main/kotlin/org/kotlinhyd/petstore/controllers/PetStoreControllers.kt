package org.kotlinhyd.petstore.controllers

import org.kotlinhyd.petstore.dto.PetsDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PetStoreControllers {

    @PostMapping("/savePet")
    fun savePet(@RequestBody pet: PetsDto): PetsDto {
        return pet
    }
}