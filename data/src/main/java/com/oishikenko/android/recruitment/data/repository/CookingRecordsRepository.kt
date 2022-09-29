package com.oishikenko.android.recruitment.data.repository

import com.oishikenko.android.recruitment.data.model.CookingRecords
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface CookingRecordsRepository {
    suspend fun getCookingRecords(offet: Int, limit: Int): Flow<Response<CookingRecords>>
}