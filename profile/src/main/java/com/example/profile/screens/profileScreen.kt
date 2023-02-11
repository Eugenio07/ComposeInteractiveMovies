package com.example.profile.screens

import androidx.compose.runtime.Composable
import com.example.core.ui.navigation.Feature
import com.example.core.ui.screens.TestScreen

@Composable
fun ProfileScreen(onClick: (Feature) -> Unit){
    TestScreen(title = "Profile", onClick)
}