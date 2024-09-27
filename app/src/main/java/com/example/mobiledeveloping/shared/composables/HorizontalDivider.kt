package com.example.mobiledeveloping.shared.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDivider(
    color: Color = Color.Gray,
    thickness: Dp = 1.dp,
) {
    return Divider(
        color = color,
        thickness = thickness,
        modifier = Modifier
            .fillMaxWidth()
    )
}
