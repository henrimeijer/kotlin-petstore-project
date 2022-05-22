package org.kotlinhyd.petstore.handlers

import org.kotlinhyd.petstore.dto.PetDto
import org.kotlinhyd.petstore.dto.PetStoreDto
import org.kotlinhyd.petstore.models.Pet
import org.kotlinhyd.petstore.repository.DataRepo
import org.kotlinhyd.petstore.repository.PetRepo
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.body

@Component
class PetHandler(
    val petRepo: PetRepo,
    val dataRepo: DataRepo
) {

    fun newPet(serverRequest: ServerRequest): PetDto {
        val petDto = serverRequest.body<PetDto>()
        val pet = Pet.mapper(petDto)
        petRepo.save(pet)
        return petDto
    }

    fun getStoreData(): List<PetStoreDto> {
        return dataRepo.getStoreData()
            .map {
                val petStore = PetStoreDto()
                petStore.storeName= it.storeName
                petStore.address= it.address
                petStore.petsList = it.petList
                return@map petStore
            }
    }
}