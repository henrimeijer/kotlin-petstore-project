package org.kotlinhyd.petstore.dto

data class PetsDto (
     var storeName: String = "",
     var address: String = "",
     var petsList: List<*> = mutableListOf<Any>()
)