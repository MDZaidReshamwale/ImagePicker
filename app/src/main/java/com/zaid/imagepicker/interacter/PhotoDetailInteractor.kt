package com.zaid.imagepicker.interacter

import com.zaid.imagepicker.data.GoogleMapsClient
import com.zaid.imagepicker.data.domain.AddressResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object PhotoDetailInteractor {
    fun getAddress(latitude: Double, longitude: Double
                   , onResponse: (formattedAddress: String) -> Unit
                   , onFailure: (t: Throwable) -> Unit) {
        GoogleMapsClient
            .service
            .getAddress("$latitude,$longitude")
            .enqueue(object : Callback<AddressResponse> {
                override fun onFailure(call: Call<AddressResponse>?, t: Throwable) {
                    onFailure(t)
                }

                override fun onResponse(
                    call: Call<AddressResponse>,
                    response: Response<AddressResponse>
                ) {
                    onResponse("")
//                    response.body()?.resultList?.first()?.let { onResponse(it.formattedAddress) }
                }

//                override fun onResponse(call: Call<AddressResponse>?, response: Response<AddressResponse>) {
//                    onResponse(response.body()!!.resultList.first().formattedAddress)
//                }
            })
    }

}