package com.example.core.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.core.ui.navigation.Feature

@Composable
fun TestScreen(
    title: String = "",
    onClick: (Feature) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title)
        Button(
            onClick = { onClick(Feature.LOGIN) }
        ) {
            Text(text = "Login")
        }
        Button(
            onClick = { onClick(Feature.LISTINGS) }
        ) {
            Text(text = "Listings")
        }
        Button(
            onClick = { onClick(Feature.PROFILE) }
        ) {
            Text(text = "Profile")
        }
        Button(
            onClick = { onClick(Feature.DETAIL) }
        ) {
            Text(text = "Detail")
        }
    }
}

@Composable
@Preview
fun TestScreenPreview() {
    TestScreen(onClick = {})
}