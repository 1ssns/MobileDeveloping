package com.example.mobiledeveloping.chats.screen.composables.top.bar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobiledeveloping.R

@Composable
fun TopBar() {
    return Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(6.dp),
        ) {
            Box(
                modifier = Modifier.padding(3.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = stringResource(R.string.top_bar_icon_content_description),
                    modifier = Modifier.size(40.dp)
                )
            }
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.top_bar_label),
                    modifier = Modifier.padding(3.dp),
                    fontSize = 24.sp
                )
            }
        }
    }
}
