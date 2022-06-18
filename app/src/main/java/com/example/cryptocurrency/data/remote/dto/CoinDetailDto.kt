package com.example.cryptocurrency.data.remote.dto


import com.google.gson.annotations.SerializedName

data class CoinDetailDto(
    @SerializedName("description") var description: String? = null,
    @SerializedName("development_status") var developmentStatus: String? = null,
    @SerializedName("first_data_at") var firstDataAt: String? = null,
    @SerializedName("hardware_wallet") var hardwareWallet: Boolean? = null,
    @SerializedName("hash_algorithm") var hashAlgorithm: String? = null,
    @SerializedName("id") var id: String? = null,
    @SerializedName("is_active") var isActive: Boolean? = null,
    @SerializedName("is_new") var isNew: Boolean? = null,
    @SerializedName("last_data_at") var lastDataAt: String? = null,
    @SerializedName("links") var links: Links? = null,
    @SerializedName("links_extended") var linksExtended: List<LinksExtended?>? = null,
    @SerializedName("message") var message: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("open_source") var openSource: Boolean? = null,
    @SerializedName("org_structure") var orgStructure: String? = null,
    @SerializedName("proof_type") var proofType: String? = null,
    @SerializedName("rank") var rank: Int? = null,
    @SerializedName("started_at") var startedAt: String? = null,
    @SerializedName("symbol") var symbol: String? = null,
    @SerializedName("tags") var tags: List<Tag?>? = null,
    @SerializedName("team") var team: List<Team?>? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("whitepaper") var whitepaper: Whitepaper? = null
)