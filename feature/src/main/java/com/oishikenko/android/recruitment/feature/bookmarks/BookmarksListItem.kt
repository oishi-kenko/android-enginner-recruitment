package com.oishikenko.android.recruitment.feature.bookmarks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.oishikenko.android.recruitment.data.model.CookingRecord

@Composable
fun BookmarkedRecipeListItem(
    cookingRecord: CookingRecord
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp,
            ),
    ) {
        Row {
            AsyncImage(
                model = cookingRecord.imageUrl,
                contentDescription = cookingRecord.comment,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(96.dp)
                    .clip(RoundedCornerShape(4.dp)),
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .padding(start = 10.dp)
                    .weight(1f, false),
            ) {
                Text(
                    text = cookingRecord.comment
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewBookmarkedRecipeListItem() {
    BookmarkedRecipeListItem(
        cookingRecord = CookingRecord(
            imageUrl= "https://cooking-records.herokuapp.com/images/1.jpg",
            comment = "豚肉のコクとごぼうの香り、野菜の甘みで奥行きのある味わい。",
            recipeType = "soup",
            recordedAt = "2018-05-01 17:57:31"
        )
    )
}