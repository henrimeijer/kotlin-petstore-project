package org.kotlinhyd.petstore.dto

data class PetStoreDto (
     var storeName: String = "",
     var address: String = "",
     var petsList: List<*> = mutableListOf<Any>()
)