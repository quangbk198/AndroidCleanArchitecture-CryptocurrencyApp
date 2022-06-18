package com.example.cryptocurrency.domain.model

import com.example.cryptocurrency.data.remote.dto.TeamMember

/**
 * Created by quangnh
 * Date: 17/6/2022
 * Time: 11:14 AM
 * Project Cryptocurrency
 */
data class CoinDetail(
    var coinId: String? = null,
    var name: String? = null,
    var description: String? = null,
    var symbol: String? = null,
    var rank: Int? = null,
    var isActive: Boolean? = null,
    var tags: List<String>? = null,
    var team: List<TeamMember>? = null
)
