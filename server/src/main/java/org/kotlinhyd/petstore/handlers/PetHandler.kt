package org.kotlinhyd.petstore.handlers

import org.kotlinhyd.petstore.models.Pets
import org.kotlinhyd.petstore.repository.PetRepo
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.body

@Component
class PetHandler(val petRepo: PetRepo) {
    fun newPet(request: ServerRequest): Pets {
        val pet = request.body<Pets>()
        return petRepo.save(pet)
    }
}