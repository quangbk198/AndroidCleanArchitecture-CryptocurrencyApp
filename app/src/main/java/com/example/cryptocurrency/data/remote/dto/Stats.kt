package com.example.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("contributors") var contributors: Int? = null,
    @SerializedName("followers") var followers: Int? = null,
    @SerializedName("stars") var stars: Int? = null,
    @SerializedName("subscribers") var subscribers: Int? = null
)