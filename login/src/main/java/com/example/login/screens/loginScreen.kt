package com.example.login.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.core.ui.navigation.Feature
import com.example.core.ui.screens.TestScreen

@Composable
fun LoginScreen(onClick: (Feature) -> Unit){
    TestScreen(title = "Login", onClick)
}