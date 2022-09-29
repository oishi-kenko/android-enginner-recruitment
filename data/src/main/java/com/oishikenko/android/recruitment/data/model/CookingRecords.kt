package com.oishikenko.android.recruitment.data.model


import com.squareup.moshi.Json

data class CookingRecords(
    @Json(name = "cooking_records")
    val cookingRecords: List<CookingRecord>,
    @Json(name = "pagination")
    val pagination: Pagination
)