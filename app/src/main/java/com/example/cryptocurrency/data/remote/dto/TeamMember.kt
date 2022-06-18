package com.example.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName

data class TeamMember(
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("position") var position: String? = null
)