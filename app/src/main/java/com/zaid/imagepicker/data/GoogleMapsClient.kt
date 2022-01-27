package com.zaid.imagepicker.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GoogleMapsClient {
    val service: GoogleMapsService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        service = retrofit.create(GoogleMapsService::class.java)
    }
}