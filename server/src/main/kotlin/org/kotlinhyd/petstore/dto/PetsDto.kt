package org.kotlinhyd.petstore.dto

data class PetsDto (
     var name: String = "",
     var petType: String = "",
     var petSubType: String = "",
     var numberOfPetsAvailable: Number = 0,
     var tags: String = "",
     var petImageUrl: String = ""
)