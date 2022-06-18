package com.example.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("explorer") var explorer: List<String?>? = null,
    @SerializedName("facebook") var facebook: List<String?>? = null,
    @SerializedName("reddit") var reddit: List<String?>? = null,
    @SerializedName("source_code") var sourceCode: List<String?>? = null,
    @SerializedName("website") var website: List<String?>? = null,
    @SerializedName("youtube") var youtube: List<String?>? = null
)