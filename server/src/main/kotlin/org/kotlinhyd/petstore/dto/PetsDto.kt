package org.kotlinhyd.petstore.dto

import lombok.Data

@Data
class PetsDto {
    lateinit var name: String
    lateinit var petType: String
    lateinit var petSubType: String
    lateinit var numberOfPetsAvailable: Number
    lateinit var tags: String
    lateinit var petImageUrl: String
}
