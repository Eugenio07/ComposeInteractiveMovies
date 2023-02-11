package com.example.listings.screens

import androidx.compose.runtime.Composable
import com.example.core.ui.navigation.Feature
import com.example.core.ui.screens.TestScreen

@Composable
fun ListingsScreen(onClick: (Feature) -> Unit) {
    TestScreen(title = "Listings", onClick)
}