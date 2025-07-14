package com.example.superdex.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

val LocalAppColors = staticCompositionLocalOf { LightColorScheme }

data class AppColors(
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val background: Color,
    val surface: Color,
    val onBackground: Color,
    val onSurface: Color,
    val error: Color,
)

private val LightColorScheme = lightColorScheme(
    primary = SageLight,
    onPrimary = DeepCharcoal,
    secondary = SageDark,
    background = BackgroundDefault,
    surface = SurfaceDefault,
    onBackground = PrimaryText,
    onSurface = PrimaryText,
    error = ErrorRed,
    surfaceVariant = LighterSage,
    onSurfaceVariant = PrimaryText,
    onSecondary = TextTypeLight
)

private val DarkColorScheme = darkColorScheme(
    primary = SageDark,
    onPrimary = PureWhite,
    secondary = DeepCharcoal,
    background = DeepCharcoal,
    surface = MidGray,
    onBackground = PureWhite,
    onSurface = PureWhite,
    error = ErrorRed,
    surfaceVariant = MidGray,
    onSurfaceVariant = PrimaryText,
    onSecondary = TextTypeDark
)

@Composable
fun DigiGateTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}