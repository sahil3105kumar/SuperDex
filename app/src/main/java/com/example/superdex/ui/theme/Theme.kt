package com.example.superdex.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme


import androidx.compose.ui.platform.LocalContext
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.CompositionLocalProvider

val LocalAppColors = staticCompositionLocalOf { LightColorScheme }

data class AppColors(

    //Text
    val title: Color,
    val primary: Color, // mainText
    val secondary: Color, // insideCardText
    val tertiary: Color, // insideButtonText


    //UiElements
    val background: Color,
    val cardFills: Color,
    val buttonFills: Color,
)


private val LightColorScheme = AppColors(

    title = almostBlack,
    primary = red,
    secondary = red,
    tertiary = red,

    background = mustardYellow,
    cardFills = lavender,
    buttonFills = powderBlue,
)

private val DarkColorScheme = AppColors(
    title = reddishPink,
    primary = white,
    secondary = white,
    tertiary = white,

    background = midnightBlue,
    cardFills = royalPurple,
    buttonFills = charcoalGreen,

    )


@Composable
fun SuperDexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme =
        if (darkTheme) com.example.superdex.ui.theme.DarkColorScheme else com.example.superdex.ui.theme.LightColorScheme
    CompositionLocalProvider(com.example.superdex.ui.theme.LocalAppColors provides colorScheme) {
        MaterialTheme(
            colorScheme = if (darkTheme) darkColorScheme() else lightColorScheme(),
            content = content
        )
    }
}
