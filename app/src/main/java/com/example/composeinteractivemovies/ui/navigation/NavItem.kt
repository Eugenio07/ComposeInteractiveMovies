package com.example.composeinteractivemovies.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.core.ui.navigation.Feature

enum class NavItem (
    val navCommand: NavCommand,
    val icon: ImageVector,
    @StringRes val title: Int
        ){

}

sealed class NavCommand(
    internal val feature: Feature,
    internal val subRoute: String = "Home",
    private val navArgs: List<NavArg> = emptyList()
){
    class ContentType(feature: Feature) : NavCommand(feature)

    class ContentTypeDetail(feature: Feature) :
        NavCommand(feature, "detail", listOf(NavArg.ItemId)) {
        fun createRoute(itemId: Int) = "${feature.route}/$subRoute/$itemId"
    }

    val route = run {
        val argValues = navArgs.map { "{${it.key}}" }
        listOf(feature.route, subRoute)
            .plus(argValues)
            .joinToString("/")
    }

    val args = navArgs.map {
        navArgument(it.key) { type = it.navType }
    }

}

enum class NavArg(val key: String, val navType: NavType<*>) {
    ItemId("itemId", NavType.IntType)
}