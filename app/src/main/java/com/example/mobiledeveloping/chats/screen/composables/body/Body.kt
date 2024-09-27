package com.example.mobiledeveloping.chats.screen.composables.body

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobiledeveloping.R
import com.example.mobiledeveloping.chats.screen.composables.body.chat.card.ChatCard
import com.example.mobiledeveloping.chats.screen.models.Chat
import com.example.mobiledeveloping.shared.composables.HorizontalDivider

fun getTestChats(): Array<Chat> {
    return Array(20) { index ->
        Chat(
            number = index + 1,
            description = "That a simple example for chat number ${index + 1}. I just want to see this text on two lines so that you can try to make a restriction."
        )
    }
}

@Composable
fun Body() {

    val chats = getTestChats()

    return Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            Text(
                text = stringResource(R.string.chats_list_title),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 15.dp, start = 15.dp)
            )
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                itemsIndexed(chats) { index, chat ->
                    if (index != 0) {
                        Spacer(modifier = Modifier.height(10.dp))
                    }

                    ChatCard(chat)

                    if (index != chats.lastIndex) {
                        Spacer(modifier = Modifier.height(10.dp))
                        HorizontalDivider()
                    }
                }
            }
        }
    }
}
