package org.kotlinhyd.petstore.repository

import org.kotlinhyd.petstore.models.PetStore
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PetStoreRepo : CrudRepository<PetStore, Long>