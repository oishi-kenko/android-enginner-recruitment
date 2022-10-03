package com.oishikenko.android.recruitment.feature.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oishikenko.android.recruitment.data.model.CookingRecord
import com.oishikenko.android.recruitment.data.repository.CookingRecordsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class CookingRecordsViewModel @Inject constructor(
    private var cookingRecordsRepository: CookingRecordsRepository
) : ViewModel() {
    val cookingRecords: StateFlow<List<CookingRecord>> =
        cookingRecordsRepository.getCookingRecords(offet = 0, limit = 5).map {
            it.body()?.cookingRecords ?: emptyList<CookingRecord>()
        }.stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList<CookingRecord>()
        )
}