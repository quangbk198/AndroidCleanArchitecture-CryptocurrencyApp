package com.example.cryptocurrency.domain.model

/**
 * Created by quangnh
 * Date: 17/6/2022
 * Time: 10:49 AM
 * Project Cryptocurrency
 */
data class Coin(
    val id: String? = null,
    val isActive: Boolean? = null,
    val name: String? = null,
    val rank: Int? = null,
    val symbol: String? = null,
)
