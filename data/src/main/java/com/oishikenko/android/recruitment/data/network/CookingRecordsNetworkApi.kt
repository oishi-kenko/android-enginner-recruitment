package com.oishikenko.android.recruitment.data.network

import com.oishikenko.android.recruitment.data.model.CookingRecords
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CookingRecordsNetworkApi {
    @GET("/cooking_records")
    suspend fun getCookingRecords(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ): Response<CookingRecords>
}