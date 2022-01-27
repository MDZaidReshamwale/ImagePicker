package com.zaid.imagepicker.data

import com.zaid.imagepicker.data.domain.AddressResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GoogleMapsService {
    @GET(ApiConstants.ADDRESS_URL)
    fun getAddress(@Query(ApiConstants.LATLNG_QUERY) latlng: String): Call<AddressResponse>
}