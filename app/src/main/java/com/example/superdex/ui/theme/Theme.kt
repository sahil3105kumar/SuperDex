package com.example.superdex.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


val LocalAppColors = staticCompositionLocalOf { LightColorScheme }

data class AppColors(
    // variables for landing page
    val landingPageBackground: Color,
    val landingPageAppTitle: Color,
    val landingPageFillButtonBackground: Color,
    val landingPageTransparentButtonBackground: Color,
    val landingPageTransparentButtonText: Color,
    val landingPageTransparentButtonBorder: Color,

    // Variables for Other Pages
    val background: Color,
    val appTitle: Color,
    val viewText: Color,
    val editText: Color,
    val editTextBorder: Color,
    val editTextBackground: Color,
    val fillButtonBackground: Color,
)


private val LightColorScheme = AppColors(

    landingPageBackground = Purple,
    landingPageAppTitle = Orange,
    landingPageFillButtonBackground = Orange,
    landingPageTransparentButtonBackground = Color.White,
    landingPageTransparentButtonText = Orange,
    landingPageTransparentButtonBorder = Orange,

    background = Color.White,
    appTitle = Purple,
    viewText = Orange,
    editText = Color.Black,
    editTextBorder = Purple,
    editTextBackground = EditTextBackgroundColorLight,
    fillButtonBackground = Orange,

)
private val DarkColorScheme = AppColors(
    landingPageBackground = Orange,
    landingPageAppTitle = Purple,
    landingPageFillButtonBackground = Purple,
    landingPageTransparentButtonBackground = Color.White,
    landingPageTransparentButtonText = Purple,
    landingPageTransparentButtonBorder = Purple,

    background = Purple,
    appTitle = Orange,
    viewText = Orange,
    editText = Color.White,
    editTextBorder = Color.White,
    editTextBackground = EditTextBackgroundColorDark,
    fillButtonBackground = Orange,

)



@Composable
fun SuperDexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    //    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    CompositionLocalProvider(LocalAppColors provides colorScheme) {
        MaterialTheme(
            colorScheme = if (darkTheme) darkColorScheme() else lightColorScheme(),
            content = content
        )
    }

}