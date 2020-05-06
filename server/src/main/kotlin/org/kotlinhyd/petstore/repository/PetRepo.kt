package org.kotlinhyd.petstore.repository

import org.kotlinhyd.petstore.models.Pets
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepo : CrudRepository<Pets, Long>