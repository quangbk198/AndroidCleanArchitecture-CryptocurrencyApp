package com.example.cryptocurrency.domain.repository

import com.example.cryptocurrency.data.remote.dto.CoinDetailDto
import com.example.cryptocurrency.data.remote.dto.CoinDto

/**
 * Created by quangnh
 * Date: 17/6/2022
 * Time: 3:37 PM
 * Project Cryptocurrency
 */
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}