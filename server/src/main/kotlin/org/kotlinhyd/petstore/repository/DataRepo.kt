package org.kotlinhyd.petstore.repository

import org.kotlinhyd.petstore.models.PetStore
import org.kotlinhyd.petstore.models.Pet
import org.springframework.core.io.Resource
import org.springframework.stereotype.Component

@Component
class DataRepo(
    val petRepo: PetRepo,
    val storeRepo: PetStoreRepo
) {
    var resource: Resource? = null

    fun getStoreData(): List<PetStore> {
        return storeRepo.findAll()
    }

    // HM - GET endpoint for /pets
    fun getPetData(): List<Pet> {
        return petRepo.findAll().take(1).toList()
    }

}