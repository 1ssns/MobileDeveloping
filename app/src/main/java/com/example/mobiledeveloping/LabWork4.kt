package com.example.mobiledeveloping

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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
private fun preview() {
    SecondScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
    ) { padding -> padding}
}

@Composable
private fun TopBar(){
    Box(
        modifier = Modifier.fillMaxWidth().height(60.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(6.dp),
        ) {
            Box (
                modifier = Modifier.padding(3.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = "App bar favorite icon",
                    modifier = Modifier.size(40.dp)
                )
            }
            Box (
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier.fillMaxSize()
            ) {
                Text("My First App", Modifier.padding(3.dp), fontSize = 24.sp)
            }
        }
    }
}

@Composable
private fun BottomBar(){

}

