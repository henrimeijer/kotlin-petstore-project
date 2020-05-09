package org.kotlinhyd.petstore.repository

import org.kotlinhyd.petstore.models.Pet
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface PetRepo : CrudRepository<Pet, Long>