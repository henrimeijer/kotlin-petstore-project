package org.kotlinhyd.petstore.models

import javax.persistence.*

@Entity
data class Pet(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var petId: Long,
    var name: String,
    var availablePets: Number,
    var tags: String,
    var imgUrl: String,

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name = "pet_type_id")
    var petTypeId: PetType
)