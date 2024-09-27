package com.example.mobiledeveloping.chats.screen.composables.bottom.bar.enums

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BottomButton {
    Calendar, Home, Profile;

    @Composable
    fun Display(iconSize: Dp = 35.dp) {
        return IconButton(
            onClick = { /*TODO*/ }
        ) {
            Image(
                imageVector = this.getImage(),
                contentDescription = this.getDescription(),
                modifier = Modifier.size(iconSize)
            )
        }
    }

    private fun getImage(): ImageVector {
        return when (this) {
            Home -> Icons.Filled.Home
            Profile -> Icons.Filled.AccountCircle
            Calendar -> Icons.Filled.DateRange
            else -> throw Exception("getImage function not implemented for $this")
        }
    }

    private fun getDescription(): String {
        return when (this) {
            Home -> "Bottom bar home icon"
            Profile -> "Bottom bar profile icon"
            Calendar -> "Bottom bar calendar icon"
            else -> throw Exception("getDescription function not implemented for $this")
        }
    }
}
