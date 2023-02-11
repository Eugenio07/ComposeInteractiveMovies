package com.example.core

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.material3.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import com.example.composeinteractivemovies.ui.AppState
import com.example.composeinteractivemovies.ui.navigation.Navigation
import com.example.composeinteractivemovies.ui.rememberAppState
import com.example.core.ui.theme.ComposeInteractiveMoviesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp(appState: AppState = rememberAppState()) {
    val scrollState = rememberTopAppBarState()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(scrollState)
    MainScreen {
        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        ) { padding ->
            Box(modifier = Modifier.padding(padding)) {
                Navigation(navController = appState.navController)
            }
        }
    }
}

@Composable
fun MainScreen(content: @Composable () -> Unit) {
    ComposeInteractiveMoviesTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}