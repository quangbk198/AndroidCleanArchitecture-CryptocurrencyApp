package com.example.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("stats") var stats: Stats? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("url") var url: String? = null
)