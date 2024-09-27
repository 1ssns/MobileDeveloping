package com.example.mobiledeveloping.chats.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobiledeveloping.chats.screen.composables.body.Body
import com.example.mobiledeveloping.chats.screen.composables.bottom.bar.BottomBar
import com.example.mobiledeveloping.chats.screen.composables.top.bar.TopBar

@Preview
@Composable
private fun Preview() {
    ChatsScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatsScreen() {
    return Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
    ) { padding ->
        Box(
            Modifier.padding(padding)
        ) {
            Body()
        }
    }
}
