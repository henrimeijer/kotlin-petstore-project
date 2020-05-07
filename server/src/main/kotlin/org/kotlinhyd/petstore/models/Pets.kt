package org.kotlinhyd.petstore.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Pets(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    var name: String,
    var petType: String,
    var petSubType: String,
    var numberOfPetsAvailable: Number,
    var tags: String,
    var petImageUrl: String
)