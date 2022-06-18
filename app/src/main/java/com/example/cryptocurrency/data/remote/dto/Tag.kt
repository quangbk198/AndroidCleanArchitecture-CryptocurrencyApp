package com.example.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("coin_counter") var coinCounter: Int? = null,
    @SerializedName("ico_counter") var icoCounter: Int? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null
)