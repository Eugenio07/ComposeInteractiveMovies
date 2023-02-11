package com.example.composeinteractivemovies.ui

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
): AppState = remember(navController, coroutineScope){
    AppState(navController, coroutineScope)
}

class AppState @OptIn(ExperimentalMaterial3Api::class) constructor(
    val navController: NavHostController,
    private val coroutineScope: CoroutineScope,
) {

}