package com.zaid.imagepicker.data.domain

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AddressResponse(@SerializedName("status") @Expose val status: String,
                           @SerializedName("results") @Expose val resultList: List<Result>)

data class Result(@SerializedName("formatted_address") @Expose val formattedAddress: String)
