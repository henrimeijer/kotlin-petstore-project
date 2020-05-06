package org.kotlinhyd.petstore.models

import lombok.Data
import javax.persistence.*

@Entity
data class PetStore(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long,
    val name: String,
    val address: String,
    val ownerName: String,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    val petsList: List<Pets>
)