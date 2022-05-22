package org.kotlinhyd.petstore.models

import org.kotlinhyd.petstore.dto.PetDto
import javax.persistence.*

@Entity
class Pet(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var petId: Long = 0,
    var name: String = "",
    var availablePets: Int = 0,
    var tags: String = "",
    var petTypeId: String = "",
    var storeId: Long = 0
) {
    companion object {
        fun mapper(petDto: PetDto): Pet {
            val pet = Pet()
            pet.name = petDto.name
            pet.tags = petDto.tags
            pet.petTypeId = petDto.petTypeId
            pet.availablePets = petDto.availablePets
            pet.storeId = petDto.storeId
            return pet
        }
    }
}