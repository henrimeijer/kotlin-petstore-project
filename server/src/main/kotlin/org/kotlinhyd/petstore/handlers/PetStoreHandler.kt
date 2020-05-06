package org.kotlinhyd.petstore.handlers

import org.kotlinhyd.petstore.models.PetStore
import org.kotlinhyd.petstore.repository.PetStoreRepo
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.stereotype.Component

@Component
class PetStoreHandler(val petStoreRepo: PetStoreRepo) {

    fun getAllPetStores(): List<PetStore> {
        return petStoreRepo.findAll() as List<PetStore>;
    }
}