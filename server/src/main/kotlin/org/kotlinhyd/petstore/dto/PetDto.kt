package org.kotlinhyd.petstore.dto

class PetDto(
    var name: String = "",
    var availablePets: Int = 0,
    var tags: String = "",
    var petTypeId: String = "",
    var storeId: Long = 0
)