package org.kotlinhyd.petstore.repository

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Component

@Component
class DataRepo {
    var resource: Resource? = null

    fun getStoreData(): List<*>? {
        val storeData = ObjectMapper()
            .readValue(ClassPathResource("data.json").file, List::class.java)
        return storeData
    }
}