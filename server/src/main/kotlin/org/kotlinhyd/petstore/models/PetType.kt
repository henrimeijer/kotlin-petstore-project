package org.kotlinhyd.petstore.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "pets_type")
data class PetType(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var petTypeId: Long,
    var petType: String,
    var petSubType: String
)
