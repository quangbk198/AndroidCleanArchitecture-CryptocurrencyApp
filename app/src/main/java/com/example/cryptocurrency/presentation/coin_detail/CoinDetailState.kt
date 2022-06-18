package com.example.cryptocurrency.presentation.coin_detail

import com.example.cryptocurrency.domain.model.CoinDetail

/**
 * Created by quangnh
 * Date: 17/6/2022
 * Time: 5:09 PM
 * Project Cryptocurrency
 */
data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
