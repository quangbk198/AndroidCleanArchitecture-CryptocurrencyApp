package com.example.cryptocurrency.presentation.coin_list

import com.example.cryptocurrency.domain.model.Coin

/**
 * Created by quangnh
 * Date: 17/6/2022
 * Time: 5:09 PM
 * Project Cryptocurrency
 */
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
