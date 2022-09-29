package com.oishikenko.android.recruitment.feature.list

import androidx.lifecycle.ViewModel
import com.oishikenko.android.recruitment.data.model.CookingRecord

class CookingRecordsViewModel: ViewModel() {
    val cookingRecords = listOf(
        CookingRecord(
            imageUrl= "https://cooking-records.herokuapp.com/images/1.jpg",
            comment = "豚肉のコクとごぼうの香り、野菜の甘みで奥行きのある味わい。",
            recipeType = "soup",
            recordedAt = "2018-05-01 17:57:31"
        ),
        CookingRecord(
            imageUrl= "https://cooking-records.herokuapp.com/images/1.jpg",
            comment = "豚肉のコクとごぼうの香り、野菜の甘みで奥行きのある味わい。",
            recipeType = "soup",
            recordedAt = "2018-05-01 17:57:31"
        ),
        CookingRecord(
            imageUrl= "https://cooking-records.herokuapp.com/images/1.jpg",
            comment = "豚肉のコクとごぼうの香り、野菜の甘みで奥行きのある味わい。",
            recipeType = "soup",
            recordedAt = "2018-05-01 17:57:31"
        ),
        CookingRecord(
            imageUrl= "https://cooking-records.herokuapp.com/images/1.jpg",
            comment = "豚肉のコクとごぼうの香り、野菜の甘みで奥行きのある味わい。",
            recipeType = "soup",
            recordedAt = "2018-05-01 17:57:31"
        )
    )
}