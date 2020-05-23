package org.kotlinhyd.petstore.models

import javax.persistence.*

@Entity
data class PetStore(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val storeId: Long,
    val storeName: String,
    val address: String,
    val storeOwnerName: String,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name = "storeId")
    val petList: List<Pet>
)