package com.example.composeinteractivemovies.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.core.ui.navigation.Feature
import com.example.detail.screens.DetailScreen
import com.example.listings.screens.ListingsScreen
import com.example.login.screens.LoginScreen
import com.example.profile.screens.ProfileScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Feature.LOGIN.route
    ) {
        loginNav(navController)
        listingsNav(navController)
        detailNav(navController)
        profileNav(navController)
    }
}

private fun NavGraphBuilder.loginNav(navController: NavHostController) {
    navigation(
        startDestination = NavCommand.ContentType(Feature.LOGIN).route,
        route = Feature.LOGIN.route
    ) {
        composable(NavCommand.ContentType(Feature.LOGIN)) {
            LoginScreen(onClick = { feature ->
                navController.navigate(
                    NavCommand.ContentType(feature).route)
            })
        }
    }
}

private fun NavGraphBuilder.listingsNav(navController: NavHostController) {
    navigation(
        startDestination = NavCommand.ContentType(Feature.LISTINGS).route,
        route = Feature.LISTINGS.route
    ) {
        composable(NavCommand.ContentType(Feature.LISTINGS)) {
            ListingsScreen(onClick = { feature ->
                navController.navigate(
                    NavCommand.ContentType(feature).route)
            })
        }
    }
}

private fun NavGraphBuilder.detailNav(navController: NavHostController) {
    navigation(
        startDestination = NavCommand.ContentType(Feature.DETAIL).route,
        route = Feature.DETAIL.route
    ) {
        composable(NavCommand.ContentType(Feature.DETAIL)) {
            DetailScreen(onClick = { feature ->
                navController.navigate(
                    NavCommand.ContentType(feature).route)
            })
        }
    }
}

private fun NavGraphBuilder.profileNav(navController: NavHostController) {
    navigation(
        startDestination = NavCommand.ContentType(Feature.PROFILE).route,
        route = Feature.PROFILE.route
    ) {
        composable(NavCommand.ContentType(Feature.PROFILE)) {
            ProfileScreen(onClick = { feature ->
                navController.navigate(
                    NavCommand.ContentType(feature).route)
            })
        }
    }
}

private fun NavGraphBuilder.composable(
    navCommand: NavCommand,
    content: @Composable (NavBackStackEntry) -> Unit,
) {
    composable(
        route = navCommand.route,
        arguments = navCommand.args
    ) {
        content(it)
    }
}