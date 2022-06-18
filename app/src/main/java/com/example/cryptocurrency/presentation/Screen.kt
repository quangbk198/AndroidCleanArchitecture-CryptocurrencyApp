package com.example.cryptocurrency.presentation

/**
 * Created by quangnh
 * Date: 17/6/2022
 * Time: 10:53 PM
 * Project Cryptocurrency
 */
sealed class Screen(val route: String) {
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
