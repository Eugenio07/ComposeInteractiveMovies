package com.example.detail.screens

import androidx.compose.runtime.Composable
import com.example.core.ui.navigation.Feature
import com.example.core.ui.screens.TestScreen

@Composable
fun DetailScreen(onClick: (Feature) -> Unit){
    TestScreen(title = "Detail", onClick)
}