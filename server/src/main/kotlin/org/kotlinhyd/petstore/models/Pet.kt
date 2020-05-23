package org.kotlinhyd.petstore.models

import javax.persistence.*

@Entity
data class Pet(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var petId: Long = 0,
    var name: String = "",
    var availablePets: Number = 0,
    var tags: String = "",
    var petSubType: String = "",
    var storeId: Long = 0
)