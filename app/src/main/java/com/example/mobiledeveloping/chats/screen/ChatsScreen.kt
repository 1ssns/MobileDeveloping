package com.example.mobiledeveloping.chats.screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobiledeveloping.chats.screen.components.bottom.bar.BottomBar
import com.example.mobiledeveloping.chats.screen.components.top.bar.TopBar

@Preview
@Composable
private fun Preview() {
    ChatsScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatsScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
    ) { padding -> padding }
}
