package com.icmen.mvpsample

class AdRepository {

    private val adDataSource: AdDataSource = AdDataSource()

    suspend fun getAdDetails() = adDataSource.getAdDetails()
}
