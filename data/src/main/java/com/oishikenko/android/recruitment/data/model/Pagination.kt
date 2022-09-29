package com.oishikenko.android.recruitment.data.model


import com.squareup.moshi.Json

data class Pagination(
    @Json(name = "limit")
    val limit: Int,
    @Json(name = "offset")
    val offset: Int,
    @Json(name = "total")
    val total: Int
)