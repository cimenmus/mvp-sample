package com.icmen.mvpsample

import kotlinx.coroutines.delay
import kotlin.random.Random

class AdDataSource {

    suspend fun getAdDetails(): AdModel {
        delay(2000)
        val adId = Random.nextInt(500, 1000)
        return AdModel(id = adId.toString(), title = "Opel Astra")
    }
}
