package org.kotlinhyd.petstore.handlers

import org.kotlinhyd.petstore.dto.PetsDto
import org.kotlinhyd.petstore.models.Pet
import org.kotlinhyd.petstore.repository.DataRepo
import org.kotlinhyd.petstore.repository.PetRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.body

@Component
class PetHandler(val petRepo: PetRepo) {

    @Autowired
    val dataRepo: DataRepo? = null

    fun newPet(serverRequest: ServerRequest): PetsDto {
        return serverRequest.body()
    }

    fun getStoreData(): PetsDto {
        val petsDto = PetsDto()
        dataRepo?.getStoreData()?.forEach {
            val storeDetails = it as Map<Any, Any>
            petsDto.storeName = storeDetails.get("storeName").toString()
            petsDto.address = storeDetails.get("address").toString()
            petsDto.petsList = storeDetails.get("pets") as MutableList<Any>
        }

        return petsDto
    }
}