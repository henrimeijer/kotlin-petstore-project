package org.kotlinhyd.petstore.dto

import lombok.Data

data class PetsDto(
    var name: String?,
    var petType: String?,
    var petSubType: String?,
    var numberOfPetsAvailable: Number?,
    var tags: String?,
    var petImageUrl: String?
)
