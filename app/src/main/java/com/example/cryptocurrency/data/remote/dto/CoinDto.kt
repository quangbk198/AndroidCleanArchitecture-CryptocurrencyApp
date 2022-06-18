package com.example.cryptocurrency.data.remote.dto

import com.example.cryptocurrency.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    @SerializedName("id") var id: String? = null,
    @SerializedName("is_active") var isActive: Boolean? = null,
    @SerializedName("is_new") var isNew: Boolean? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("rank") var rank: Int? = null,
    @SerializedName("symbol") var symbol: String? = null,
    @SerializedName("type") var type: String? = null
)

fun CoinDto.toCoin(): Coin {
    return Coin(
        id,
        isActive,
        name,
        rank,
        symbol
    )
}