package org.kotlinhyd.petstore.repository

import org.kotlinhyd.petstore.models.PetStore
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PetStoreRepo : JpaRepository<PetStore, Long>