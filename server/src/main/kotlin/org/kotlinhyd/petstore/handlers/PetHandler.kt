package org.kotlinhyd.petstore.handlers

import org.kotlinhyd.petstore.dto.PetsDto
import org.kotlinhyd.petstore.models.Pet
import org.kotlinhyd.petstore.repository.PetRepo
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.body

@Component
class PetHandler(val petRepo: PetRepo) {
    fun newPet(serverRequest: ServerRequest): PetsDto {
        return serverRequest.body()
    }

    fun getAllPets(): List<Pet> {
        return petRepo.findAll() as List<Pet>
    }
}