package com.example.superdex.ui.theme

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
    val background: Color,
    val cardFills: Color,
    val buttonFills: Color,
    val textColor: Color,
)

private val DarkColorScheme = AppColors(
   background = DarkNavy,
    cardFills = CharcoalBlue,
    buttonFills = TaupeGray,
    textColor = Cream,
)

private val LightColorScheme = AppColors(
    background = JungleGreen,
    cardFills = AmazonGreen,
    buttonFills = SageGreen,
    textColor = PastelYellow,

)

@Composable
fun SuperDexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
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