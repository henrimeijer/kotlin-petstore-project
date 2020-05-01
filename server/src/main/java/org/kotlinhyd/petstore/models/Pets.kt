package org.kotlinhyd.petstore.models

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Data
@Entity
data class Pets(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val name: String,
    val petType: PetType,
    val petSubType: PetSubType
)